package controllers;

import akka.dispatch.MessageDispatcher;
import com.avaje.ebean.QueryEachConsumer;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.TablaDeCrecimientoEntity;
import models.TablaEstaticaEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;
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

    public CompletionStage<Result> createTabla(Long idPlanta)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();

        System.out.println("Creando tabla de crecimiento");
        TablaDeCrecimientoEntity tabla = Json.fromJson( n ,TablaDeCrecimientoEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->
                {
                    String categoria = tabla.getTipoPlanta();
                    List<TablaEstaticaEntity> infoBasicaList = TablaEstaticaEntity.FINDER.all();
                    TablaEstaticaEntity infoBasica = null;
                    for (int i = 0; i < infoBasicaList.size(); i++)
                    {
                        if(infoBasicaList.get(i).getTipoPlanta().equals(categoria)){
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
