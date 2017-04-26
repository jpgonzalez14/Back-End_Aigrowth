package controllers;

import akka.dispatch.MessageDispatcher;
import dispatchers.AkkaDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.libs.Json;
import play.mvc.*;

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

    public CompletionStage<Result> createPlantaEnCategoria(Long idCategoria){
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        PlantaEntity planta = Json.fromJson( n , PlantaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    CategoriaEntity categoria = CategoriaEntity.FINDER.byId(idCategoria);
                    categoria.addPlanta(planta);
                    planta.setCategoria(categoria);
                    categoria.update();
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
