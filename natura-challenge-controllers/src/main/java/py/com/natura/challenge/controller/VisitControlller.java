package py.com.natura.challenge.controller;

import py.com.natura.challenge.dao.VisitDAO;
import py.com.natura.challenge.model.Visit;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 30/07/19
 */

public class VisitControlller {

    @Inject
    VisitDAO dao;

    @Inject
    DiagnosisController diagnosisController;

    public void createVisit(Visit visit) throws Exception {
        try {
            visit.setObservation(diagnosis(visit.getBloodPressure(), visit.getHeartRate()) + ". " + visit.getObservation());
            dao.insert(visit);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public void updateVisit(Visit visit, Integer id) throws Exception {
        try {
            visit.setObservation(diagnosis(visit.getBloodPressure(), visit.getHeartRate()));
            dao.update(visit, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public void deleteVisit(Integer id) throws Exception {
        try {
            dao.delete(Visit.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public Visit getVisitById(Integer id) throws Exception {
        Visit visit;
        try {
            visit = dao.getVisitById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
        return visit;
    }

    public List<Visit> selectAll() throws Exception {
        try {
            return dao.getVisits();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    public String diagnosis(Integer pressure, Integer heartRate) throws Exception {
        return diagnosisController.checkPressureValues(pressure, heartRate);
    }

    public List<Visit> getVisitByAttr(Integer patientId) throws Exception {
        try {
            return dao.getByAtribute(Visit.class, VisitDAO.TABLE_NAME, String.valueOf(patientId), "pacient_id");
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }
}
