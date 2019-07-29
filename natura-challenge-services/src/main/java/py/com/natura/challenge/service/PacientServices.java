package py.com.natura.challenge.service;


import py.com.natura.challenge.controller.PacientController;
import py.com.natura.challenge.model.Pacient;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 29/07/19
 */

@Path("/pacients")
@Consumes(MediaType.APPLICATION_JSON)
public class PacientServices {

    @Inject
    PacientController controller;

    @GET
    public List<Pacient> getAllPacients() throws Exception {
        return controller.selectAll();
    }

    @GET
    @Path("/get/{pacient}")
    public Pacient getPacient(@PathParam("pacient") Integer id) throws Exception {
        return controller.getPacientById(id);
    }

    @POST
    public void insertPacient(Pacient pacient) throws Exception {
        try {
            controller.createPacient(pacient);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @PUT
    public void updatePacient(Pacient pacient) throws Exception {
        try {
            controller.updatePacient(pacient, pacient.getPacientId());
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @DELETE
    @Path("/{pacientId}")
    public void deletePacient(@PathParam("pacientId") Integer pacientId) throws Exception {
        try {
            controller.deletePacient(pacientId);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
