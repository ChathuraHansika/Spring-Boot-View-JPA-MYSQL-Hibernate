package springboot.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Chathura on 4/8/2019.
 */
@Entity
public class bags {
    @Id
    @Column(name = "bagid")
    int bagId;
    @Column(name = "bagname")
    String bagName;

    @ManyToOne
    @JoinColumn(name = "studentid")
    student student;

    @OneToMany(mappedBy = "bags")
     List<pencil> pencils;


    public bags() {
    }

    public int getBagId() {
        return bagId;
    }

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    public springboot.model.student getStudent() {
        return student;
    }

    public void setStudent(springboot.model.student student) {
        this.student = student;
    }
}
