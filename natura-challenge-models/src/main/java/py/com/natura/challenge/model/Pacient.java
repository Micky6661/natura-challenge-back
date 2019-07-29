package py.com.natura.challenge.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 29/07/19
 */

@Entity
@Table(name = "Pacient")
public class Pacient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pacient_id")
    private Integer pacientId;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    public Pacient() {
    }

    public Integer getPacientId() {
        return pacientId;
    }

    public void setPacientId(Integer pacientId) {
        this.pacientId = pacientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "pacientId=" + pacientId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
