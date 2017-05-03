package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.TablaDeCrecimientoEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
//import sun.tools.jconsole.Tab;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Sofia on 1/05/17.
 */
public class TablaDeCrecimientoController extends Controller
{
    public CompletionStage<Result> getTablas()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return TablaDeCrecimientoEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(tablasDeCrecimiento -> {return ok(toJson(tablasDeCrecimiento));}
                );
    }

    public CompletionStage<Result> getTabla(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return TablaDeCrecimientoEntity.FINDER.byId(idE); } ,jdbcDispatcher)
                .thenApply(tablaDeCrecimiento -> {return ok(toJson(tablaDeCrecimiento));}
                );
    }

    public CompletionStage<Result> createTabla()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();

        TablaDeCrecimientoEntity tabla = Json.fromJson( n ,TablaDeCrecimientoEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    tabla.save();
                    return tabla;
                }
        ).thenApply(
                TablasDeCrecimiento -> {
                    return ok(Json.toJson(TablasDeCrecimiento));
                }
        );
    }

    public CompletionStage<Result> deleteTabla(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    TablaDeCrecimientoEntity tabla = TablaDeCrecimientoEntity.FINDER.byId(idE);
                    tabla.delete();
                    return tabla;
                }
        ).thenApply(
                TablasDeCrecimiento -> {
                    return ok(Json.toJson(TablasDeCrecimiento));
                }
        );
    }
    public CompletionStage<Result> updateTabla( Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        TablaDeCrecimientoEntity m = Json.fromJson( n , TablaDeCrecimientoEntity.class ) ;
        TablaDeCrecimientoEntity antiguo = TablaDeCrecimientoEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{

                    //Asignar los atributos

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                TablasDeCrecimiento -> {
                    return ok(Json.toJson(TablasDeCrecimiento));
                }
        );
    }
}
