package py.com.natura.challenge.controller;

import py.com.natura.challenge.dao.DiagnosisDAO;
import py.com.natura.challenge.model.Diagnosis;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 30/07/19
 */
public class DiagnosisController {

    @Inject
    DiagnosisDAO dao;

    List<Diagnosis> selectAll() throws Exception {
        try {
            return dao.getAllDiagnosis();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }
    }

    String checkPressureValues(Integer pressure, Integer heartRate) throws Exception {
        Map<String, Diagnosis> values = dao.selectAllValues();
        if (pressure < values.get("LOW").getBloodPressure())
            return "The patient has LOW_PRESSURE";
        else if (pressure.equals(values.get("LOW").getBloodPressure()) && heartRate <= values.get("LOW").getHeartRate())
            return "The patient has LOW_PRESSURE";
        else if (pressure > values.get("HIGH").getBloodPressure())
            return "The patient has HIGH_PRESSURE";
        else if (pressure.equals(values.get("HIGH").getBloodPressure()) && heartRate >= values.get("HIGH").getHeartRate())
            return "The patient has HIGH_PRESSURE";
        return "The patient has NORMAL_PRESSURE";
    }
}
