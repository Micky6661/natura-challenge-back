package py.com.natura.challenge.dao;

import py.com.natura.challenge.model.Diagnosis;
import py.com.natura.challenge.utils.DBUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 30/07/19
 */
public class DiagnosisDAO extends DBUtils<Diagnosis> {

    public static final String TABLE_NAME = "Diagnosis";

    public List<Diagnosis> getAllDiagnosis() throws Exception {
        List<Diagnosis> diagnosisList;
        try {
            diagnosisList = this.findAll(TABLE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }

        return diagnosisList;
    }

    public Map<String, Diagnosis> selectAllValues() throws Exception {
        Map<String, Diagnosis> diagonsisMap = new HashMap<String, Diagnosis>();
        for (Diagnosis d : getAllDiagnosis()) {
            diagonsisMap.put(d.getValue(), d);
        }
        return diagonsisMap;
    }
}
