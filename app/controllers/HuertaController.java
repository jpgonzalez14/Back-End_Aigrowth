package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.HuertaEntity;
import models.ReporteEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Sofia on 3/05/17.
 */
public class HuertaController extends Controller
{
    public CompletionStage<Result> getHuertas()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return HuertaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(huertas -> {return ok(toJson(huertas));}
                );
    }

    public CompletionStage<Result> getHuerta(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return HuertaEntity.FINDER.byId(idE); } ,jdbcDispatcher)
                .thenApply(huerta -> {return ok(toJson(huerta));}
                );
    }

    public CompletionStage<Result> createHuerta()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();

        HuertaEntity huerta = Json.fromJson( n ,HuertaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    huerta.save();
                    return huerta;
                }
        ).thenApply(
                Huerta -> {
                    return ok(Json.toJson(Huerta));
                }
        );
    }

    public CompletionStage<Result> deleteHuerta(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    HuertaEntity huerta = HuertaEntity.FINDER.byId(idE);
                    huerta.delete();
                    return huerta;
                }
        ).thenApply(
                Huerta -> {
                    return ok(Json.toJson(Huerta));
                }
        );
    }
    public CompletionStage<Result> updateHuerta( Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        HuertaEntity m = Json.fromJson( n , HuertaEntity.class ) ;
        HuertaEntity antiguo = HuertaEntity.FINDER.byId(idE);

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
