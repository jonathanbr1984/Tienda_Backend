/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.adsi.rest.services;

import co.edu.sena.adsi.jpa.entities.Usuarios;
import co.edu.sena.adsi.jpa.sessions.UsuariosFacade;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author adsi1261718
 */
@Path("usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuariosREST {
    
    @EJB
    private UsuariosFacade usuariosEJB;

    @GET
    public List<Usuarios> findAll() {
        return usuariosEJB.findAll();
    }
    @GET
    @Path("{id}")
    public Usuarios findById(@PathParam("id") Integer id){
        return usuariosEJB.find(id);
    }
    
    @POST
    public Response create(Usuarios usuario){
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        try {
        return Response.status(Response.Status.CREATED).entity(gson.toJson("Cliente registrado correctamente")).build();
        } catch(Exception e) {
            System.out.println("Error" + e);
            return Response.status(Response.Status.BAD_REQUEST).entity(gson.toJson("Error al registrar al cliente")).build();
        }
        }
    
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Usuarios usuario){
        usuariosEJB.edit(usuario);
    }
}
