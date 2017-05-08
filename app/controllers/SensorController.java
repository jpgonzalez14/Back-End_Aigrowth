package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.org.apache.regexp.internal.RE;
import dispatchers.AkkaDispatcher;
import models.PlantaEntity;
import models.ReporteEntity;
import models.SensorEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ThreadLocalRandom;

import static play.libs.Json.toJson;

/**
 * Created by Sofia on 7/05/17.
 */
public class SensorController extends Controller
{
    public CompletionStage<Result> getSensores()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return SensorEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(sensores -> {return ok(toJson(sensores));}
                );
    }

    public CompletionStage<Result> getSensor(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return SensorEntity.FINDER.byId(idE); } ,jdbcDispatcher)
                .thenApply(sensor -> {return ok(toJson(sensor));}
                );
    }


    public CompletionStage<Result> createSensor(Long idPlanta)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        SensorEntity sensor = Json.fromJson( n , SensorEntity.class );
        PlantaEntity pe = PlantaEntity.FINDER.byId(idPlanta);

        Random r = new Random();
        double rangeMinPh = pe.getTabla().getRangoInferiorPH();
        double rangeMaxPh =pe.getTabla().getRangoSuperiorPH();
        double ph = rangeMinPh + (rangeMaxPh - rangeMinPh) * r.nextDouble();
        double rangeMinEC = pe.getTabla().getRangoInferiorPH();
        double rangeMaxEC =pe.getTabla().getRangoSuperiorPH();
        double ec = rangeMinEC + (rangeMaxEC - rangeMinEC) * r.nextDouble();

        pe.getTabla().setPhActual(ph);
        pe.getTabla().setPhInicial(ph);
        pe.getTabla().setEcActual(ec);
        pe.getTabla().setEcInicial(ec);

        return CompletableFuture.supplyAsync(
                ()->{
                    sensor.save();
                    return sensor;
                }
        ).thenApply(
                Sensor -> {
                    return ok(Json.toJson(Sensor));
                }
        );
    }

    public CompletionStage<Result> deleteSensor(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    SensorEntity sensor = SensorEntity.FINDER.byId(idE);
                    sensor.delete();
                    return sensor;
                }
        ).thenApply(
                Sensor -> {
                    return ok(Json.toJson(Sensor));
                }
        );
    }
    public CompletionStage<Result> updateSensor( Long idE, Long idPlanta)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        SensorEntity m = Json.fromJson( n , SensorEntity.class ) ;
        SensorEntity antiguo = SensorEntity.FINDER.byId(idE);
        PlantaEntity pe = PlantaEntity.FINDER.byId(idPlanta);

        Random r = new Random();
        double rangeMinPh = pe.getTabla().getRangoInferiorPH();
        double rangeMaxPh =pe.getTabla().getRangoSuperiorPH();
        double ph = rangeMinPh + (rangeMaxPh - rangeMinPh) * r.nextDouble();
        double rangeMinEC = pe.getTabla().getRangoInferiorPH();
        double rangeMaxEC =pe.getTabla().getRangoSuperiorPH();
        double ec = rangeMinEC + (rangeMaxEC - rangeMinEC) * r.nextDouble();

        pe.getTabla().setPhActual(ph);
        pe.getTabla().setEcActual(ec);
        ReporteEntity reporte = new ReporteEntity();


        if(pe.getTabla().getEcInicial() < ec )
        {
            reporte.setRecomendacion(ReporteEntity.MAS_AGUA);
            antiguo.setRecomendacion(ReporteEntity.MAS_AGUA);
            pe.addToReportes(reporte);
        }

        else if(pe.getTabla().getEcInicial() > ec )
        {
            reporte.setRecomendacion(ReporteEntity.CAMBIA_SOLUCION);
            antiguo.setRecomendacion(ReporteEntity.CAMBIA_SOLUCION);
            pe.addToReportes(reporte);

        }


        return CompletableFuture.supplyAsync(
                ()->{

                    //Asignar los atributos

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                sensor -> {
                    return ok(Json.toJson(sensor));
                }
        );
    }
}
