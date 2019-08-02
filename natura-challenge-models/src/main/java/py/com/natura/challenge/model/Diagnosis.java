package py.com.natura.challenge.model;

import javax.persistence.*;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 30/07/19
 */
@Entity
@Table(name = "Diagnosis")
public class Diagnosis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnostic_id")
    private Integer diagnosticId;

    @Column(name = "blood_pressure")
    private Integer bloodPressure;

    @Column(name = "heart_rate")
    private Integer heartRate;

    @Column(name = "value")
    private String value;

    @Column(name = "description")
    private String descrpition;

    public Diagnosis() {
    }

    public Integer getDiagnosticId() {
        return diagnosticId;
    }

    public void setDiagnosticId(Integer diagnosticId) {
        this.diagnosticId = diagnosticId;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }
}
