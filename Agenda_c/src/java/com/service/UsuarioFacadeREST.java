/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.entidades.Usuario;
import com.google.gson.Gson;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Lore
 */
@Stateless
@Path("com.entidades.usuario")
public class UsuarioFacadeREST extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "AgendaPU")
    private EntityManager em;

    public UsuarioFacadeREST() {
        super(Usuario.class);
        this.em= Persistence.createEntityManagerFactory("AgendaPU").createEntityManager();
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(Usuario entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Usuario entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Usuario find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<Usuario> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({ MediaType.APPLICATION_JSON})
    public List<Usuario> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }
    
    @POST
    @Path("/correo")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Usuario correo(String jsonMail) {
        Gson obj = new Gson();
        Usuario u = obj.fromJson(jsonMail, Usuario.class);
        try {
            u = (Usuario) getEntityManager()
                    .createQuery("SELECT u FROM Usuario u WHERE u.correo = :correo")
                    .setParameter("correo", u.getCorreo()).getSingleResult();
        }
        catch (NoResultException e) {
            u = null;
        }
        return u;
    }
    @GET
    @Path("/mail/{correo}")
    @Produces({MediaType.APPLICATION_JSON})
    public Usuario findCorreo(@PathParam("correo") String correo) {
        Usuario u;
        try {
            u = (Usuario) getEntityManager()
                    .createQuery("SELECT u FROM Usuario u WHERE u.correo = :correo")
                    .setParameter("correo", correo).getSingleResult();
        }
        catch (NoResultException e) {
            u = null;
        }
        return u;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
