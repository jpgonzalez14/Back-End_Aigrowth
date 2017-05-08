package controllers;

import akka.dispatch.MessageDispatcher;
import dispatchers.AkkaDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.libs.Json;
import play.mvc.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.*;
import static play.mvc.Controller.*;

/**
 * Created by jp.gonzalez14 on 24/04/17.
 */
public class PlantaController {

    public CompletionStage<Result> getPlantas() {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PlantaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(plantaEntities -> {return ok(toJson(plantaEntities));}
                );
    }
    public CompletionStage<Result> getPlanta(Long idP) {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PlantaEntity.FINDER.byId(idP); } ,jdbcDispatcher)
                .thenApply(itemEntities -> {return ok(toJson(itemEntities));}
                );
    }

    public CompletionStage<Result> createPlanta(){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode nCamp = request().body().asJson();
        PlantaEntity planta = Json.fromJson( nCamp , PlantaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    planta.save();
                    return planta;
                }
        ).thenApply(
                PlantaEntity -> {
                    return ok(toJson(PlantaEntity));
                }
        );
    }

    public CompletionStage<Result> createPlantaEnCategoria(){
        System.out.println("Creando planta");
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        PlantaEntity planta = Json.fromJson( n , PlantaEntity.class ) ;
        TablaDeCrecimientoEntity tabla = new TablaDeCrecimientoEntity();
        SensorEntity sensor = new SensorEntity();
        planta.setSensor(sensor);
        planta.setTabla(tabla);
        return CompletableFuture.supplyAsync(
                ()->{
                    //Tabla de crecimiento
                    tabla.setTipoPlanta(planta.getNombre());
                    List<TablaEstaticaEntity> infoBasicaList = TablaEstaticaEntity.FINDER.all();
                    TablaEstaticaEntity infoBasica = null;
                    for (int i = 0; i < infoBasicaList.size(); i++)
                    {
                        System.out.println("Entro lista de plantas con tablas");
                        if(infoBasicaList.get(i).getTipoPlanta().equals(planta.getNombre())){
                            infoBasica = infoBasicaList.get(i);
                        }
                    }

                    if(infoBasica != null)
                    {
                        tabla.setRangoInferiorEC(infoBasica.getRangoInferiorEC());
                        tabla.setRangoInferiorPH(infoBasica.getRangoInferiorPH());
                        tabla.setRangoSuperiorEC(infoBasica.getRangoSuperiorEC());
                        tabla.setRangoSuperiorPH(infoBasica.getRangoSuperiorPH());

                    }

                    Random r = new Random();
                    double rangeMinPh = tabla.getRangoInferiorPH();
                    double rangeMaxPh = tabla.getRangoSuperiorPH();
                    double ph = rangeMinPh + (rangeMaxPh - rangeMinPh) * r.nextDouble();
                    double rangeMinEC = tabla.getRangoInferiorPH();
                    double rangeMaxEC = tabla.getRangoSuperiorPH();
                    double ec = rangeMinEC + (rangeMaxEC - rangeMinEC) * r.nextDouble();


                    tabla.setPhInicial(ph);
                    tabla.setEcInicial(ec);


                    sensor.save();
                    tabla.save();
                    planta.save();
                    return planta;
                }
        ).thenApply(
                pozoEntity -> {
                    return ok(Json.toJson(pozoEntity));
                }
        );
    }

    public CompletionStage<Result> deletePlanta(Long idP){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    PlantaEntity planta = PlantaEntity.FINDER.byId(idP);
                    planta.delete();
                    return planta;
                }
        ).thenApply(
                PlantaEntity -> {
                    return ok(toJson(PlantaEntity));
                }
        );
    }

    public CompletionStage<Result> updatePlanta( Long idP){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode nCamp = request().body().asJson();
        PlantaEntity planta = Json.fromJson( nCamp , PlantaEntity.class ) ;
        PlantaEntity antiguo = PlantaEntity.FINDER.byId(idP);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setNombre(planta.getNombre());
                    antiguo.setNombreCientifico(planta.getNombreCientifico());
                    antiguo.setDescripcion(planta.getDescripcion());
                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                PlantaEntity -> {
                    return ok(toJson(PlantaEntity));
                }
        );
    }

}
