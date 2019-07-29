package py.com.natura.challenge.controller;

import py.com.natura.challenge.dao.PacientDAO;
import py.com.natura.challenge.model.Pacient;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 29/07/19
 */
public class PacientController {

    @Inject
    PacientDAO dao;

    public void createPacient(Pacient pacient) throws Exception {
        try {
            dao.insert(pacient);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public void updatePacient(Pacient pacient, Integer id) throws Exception {
        try {
            dao.update(pacient, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public void deletePacient(Integer id) throws Exception {
        try {
            dao.delete(Pacient.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public Pacient getPacientById(Integer id) throws Exception {
        Pacient pacient;
        try {
            pacient = dao.getPacientById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
        return pacient;
    }

    public List<Pacient> selectAll() throws Exception {
        try {
            return dao.getPacients();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }
}
