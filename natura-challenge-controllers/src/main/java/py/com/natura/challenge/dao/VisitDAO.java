package py.com.natura.challenge.dao;

import py.com.natura.challenge.model.Visit;
import py.com.natura.challenge.utils.DBUtils;

import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 30/07/19
 */
public class VisitDAO extends DBUtils<Visit> {

    public static final String TABLE_NAME = "Visit";

    public List<Visit> getVisits() throws Exception {
        List<Visit> visitList;
        try {
            visitList = this.findAll(TABLE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }

        return visitList;
    }

    public Visit getVisitById(int id) throws Exception {
        Visit visit;
        try {
            visit = this.findById(Visit.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }

        return visit;
    }
}
