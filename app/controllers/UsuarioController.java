package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.UsuarioEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by aj.paredes10 on 27/04/17.
 */

public class UsuarioController extends Controller
{


    public CompletionStage<Result> getUsuarios()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return UsuarioEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(usuarioEntities -> {return ok(toJson(usuarioEntities));}
                );
    }

    public CompletionStage<Result> getUsuario(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return UsuarioEntity.FINDER.byId(idE); } ,jdbcDispatcher)
                .thenApply(Usuarios -> {return ok(toJson(Usuarios));}
                );
    }

    public CompletionStage<Result> createUsuario()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();

        UsuarioEntity usuario = Json.fromJson( n , UsuarioEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    usuario.save();
                    return usuario;
                }
        ).thenApply(
                Usuarios -> {
                    return ok(Json.toJson(Usuarios));
                }
        );
    }

    public CompletionStage<Result> deleteUsuario(Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    UsuarioEntity usuario = UsuarioEntity.FINDER.byId(idE);
                    usuario.delete();
                    return usuario;
                }
        ).thenApply(
                Usuarios -> {
                    return ok(Json.toJson(Usuarios));
                }
        );
    }
    public CompletionStage<Result> updateUsuario( Long idE)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
        JsonNode n = request().body().asJson();
        UsuarioEntity m = Json.fromJson( n , UsuarioEntity.class ) ;
        UsuarioEntity antiguo = UsuarioEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setNombre(m.getNombre());
                    antiguo.setClave(m.getClave());
                    antiguo.setCorreo(m.getCorreo());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                Usuarios -> {
                    return ok(Json.toJson(Usuarios));
                }
        );
    }

}

