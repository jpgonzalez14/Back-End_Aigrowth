package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.CategoriaEntity;
import play.libs.Json;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;
import static play.mvc.Controller.request;
import static play.mvc.Results.ok;

/**
 * Created by jp.gonzalez14 on 26/04/17.
 */
public class CategoriaController {

    public CompletionStage<Result> getCategorias() {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return CategoriaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(plantaEntities -> {return ok(toJson(plantaEntities));}
                );
    }
    public CompletionStage<Result> getPlanta(Long idP) {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return CategoriaEntity.FINDER.byId(idP); } ,jdbcDispatcher)
                .thenApply(itemEntities -> {return ok(toJson(itemEntities));}
                );
    }

    public CompletionStage<Result> createCategoria(){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode nCamp = request().body().asJson();
        CategoriaEntity categoria = Json.fromJson( nCamp , CategoriaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    categoria.save();
                    return categoria;
                }
        ).thenApply(
                PlantaEntity -> {
                    return ok(toJson(PlantaEntity));
                }
        );
    }

    public CompletionStage<Result> deleteCategoria(Long idP){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    CategoriaEntity categoria = CategoriaEntity.FINDER.byId(idP);
                    categoria.delete();
                    return categoria;
                }
        ).thenApply(
                PlantaEntity -> {
                    return ok(toJson(PlantaEntity));
                }
        );
    }

    public CompletionStage<Result> updateCategoria( Long idP){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode nCamp = request().body().asJson();
        CategoriaEntity categoria = Json.fromJson( nCamp , CategoriaEntity.class ) ;
        CategoriaEntity antiguo = CategoriaEntity.FINDER.byId(idP);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setNombre(categoria.getNombre());
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
