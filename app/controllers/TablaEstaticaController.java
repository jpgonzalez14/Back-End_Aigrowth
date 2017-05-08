package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.TablaDeCrecimientoEntity;
import models.TablaEstaticaEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Sofia on 4/05/17.
 */
public class TablaEstaticaController extends Controller
{
    public CompletionStage<Result> getTablas()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return TablaEstaticaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(tablas -> {return ok(toJson(tablas));}
                );
    }

    public CompletionStage<Result> getTabla(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return TablaEstaticaEntity.FINDER.byId(idE); } ,jdbcDispatcher)
                .thenApply(tabla -> {return ok(toJson(tabla));}
                );
    }

    public CompletionStage<Result> createTabla()
    {
        System.out.println("Entra a create table");
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();

        TablaEstaticaEntity tabla = Json.fromJson( n ,TablaEstaticaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    tabla.save();
                    return tabla;
                }
        ).thenApply(
                Tablas -> {
                    return ok(Json.toJson(Tablas));
                }
        );
    }

    public CompletionStage<Result> deleteTabla(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    TablaEstaticaEntity tabla = TablaEstaticaEntity.FINDER.byId(idE);
                    tabla.delete();
                    return tabla;
                }
        ).thenApply(
                Tablas -> {
                    return ok(Json.toJson(Tablas));
                }
        );
    }
    public CompletionStage<Result> updateTabla( Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        TablaEstaticaEntity m = Json.fromJson( n , TablaEstaticaEntity.class ) ;
        TablaEstaticaEntity antiguo = TablaEstaticaEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{

                    //Asignar los atributos
                    antiguo.setRangoInferiorEC(m.getRangoInferiorEC());
                    antiguo.setRangoInferiorPH(m.getRangoInferiorPH());
                    antiguo.setRangoSuperiorEC(m.getRangoSuperiorEC());
                    antiguo.setRangoSuperiorPH(m.getRangoSuperiorPH());
                    antiguo.setTipoPlanta(m.getTipoPlanta());
                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                TablasEstetica -> {
                    return ok(Json.toJson(TablasEstetica));
                }
        );
    }
}
