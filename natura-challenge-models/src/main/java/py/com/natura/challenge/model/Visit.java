package py.com.natura.challenge.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 29/07/19
 */

@Entity
@Table(name = "Visit")
public class Visit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_id")
    private Integer visitId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pacient_id", nullable = false)
    private Integer pacientId;

    @Column(name = "blood_presure")
    private Integer bloodPressure;

    @Column(name = "heart_rate")
    private Integer heartRate;

    @Column(name = "observation")
    private String observation;

    @Column(name = "visit_date")
    private Date visitDate;

    public Visit() {
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public Integer getPacientId() {
        return pacientId;
    }

    public void setPacientId(Integer pacientId) {
        this.pacientId = pacientId;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
