package py.com.natura.challenge.dao;

import py.com.natura.challenge.model.Pacient;
import py.com.natura.challenge.utils.DBUtils;

import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 29/07/19
 */
public class PacientDAO extends DBUtils<Pacient> {

    private static final String TABLE_NAME = "pacient";

    public List<Pacient> getPacients() throws Exception {
        List<Pacient> pacientList;
        try {
            pacientList = this.findAll(TABLE_NAME);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }

        return pacientList;
    }

    public Pacient getPacientById(int id) throws Exception {
        Pacient cliente;
        try {
            cliente = this.findById(Pacient.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("ERROR", e);
        }

        return cliente;
    }
}
