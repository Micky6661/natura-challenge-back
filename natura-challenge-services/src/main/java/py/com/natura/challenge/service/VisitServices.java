package py.com.natura.challenge.service;

import py.com.natura.challenge.controller.VisitControlller;
import py.com.natura.challenge.model.Visit;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 29/07/19
 */

@Path("/visits")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VisitServices {

    @Inject
    VisitControlller controller;

    @GET
    public Response getAllVisits() throws Exception {
        try {
            return Response.ok(controller.selectAll()).build();
        } catch (Exception e) {
            throw new Exception("ERROR", e);
        }
    }

    @GET
    @Path("/get/{visitId}")
    public Response getVisitById(@PathParam("visitId") Integer id) throws Exception {
        try {
            return Response.ok(controller.getVisitById(id)).build();
        } catch (Exception e) {
            throw new Exception("ERROR", e);
        }
    }

    @POST
    public void createVisit(Visit visit) throws Exception {
        try {
            controller.createVisit(visit);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @PUT
    public void updateVisit(Visit visit) throws Exception {
        try {
            controller.updateVisit(visit, visit.getVisitId());
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @DELETE
    @Path("/{visitId}")
    public void deleteVisit(@PathParam("visitId") Integer visitId) throws Exception {
        try {
            controller.deleteVisit(visitId);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

}
