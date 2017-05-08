package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.ReporteEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Sofia on 3/05/17.
 */
public class ReporteController extends Controller
{
    public CompletionStage<Result> getReportes(Long idP)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        List<ReporteEntity> reportes = ReporteEntity.FINDER.all();
        List<ReporteEntity> reportesFinal = new ArrayList<ReporteEntity>();
        for (int i = 0; i< reportes.size();i++)
        {
            if(reportes.get(i).getPlanta().getId() == idP)
            {
                reportesFinal.add(reportes.get(i));
            }
        }
        return CompletableFuture.
                supplyAsync(() -> { return reportesFinal; } ,jdbcDispatcher)
                .thenApply(Reportes -> {return ok(toJson(Reportes));}
                );
    }

    public CompletionStage<Result> getReporte(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return ReporteEntity.FINDER.byId(idE); } ,jdbcDispatcher)
                .thenApply(reporte -> {return ok(toJson(reporte));}
                );
    }

    public CompletionStage<Result> createReporte()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();

        ReporteEntity reporte = Json.fromJson( n ,ReporteEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    reporte.save();
                    return reporte;
                }
        ).thenApply(
                Reporte -> {
                    return ok(Json.toJson(Reporte));
                }
        );
    }

    public CompletionStage<Result> deleteReporte(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    ReporteEntity reporte = ReporteEntity.FINDER.byId(idE);
                    reporte.delete();
                    return reporte;
                }
        ).thenApply(
                Reporte -> {
                    return ok(Json.toJson(Reporte));
                }
        );
    }
    public CompletionStage<Result> updateReporte( Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        ReporteEntity m = Json.fromJson( n , ReporteEntity.class ) ;
        ReporteEntity antiguo = ReporteEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{

                    //Asignar los atributos

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                Reporte -> {
                    return ok(Json.toJson(Reporte));
                }
        );
    }
}
