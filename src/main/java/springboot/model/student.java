package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Chathura on 4/8/2019.
 */
@Entity
public class student {
@Id
    @Column(name = "studentid")
    int studentId;
    @Column(name = "studentname")
    String studentName;

    @OneToMany(mappedBy = "student")
    List<bags> bagss;

    public student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<bags> getBagss() {
        return bagss;
    }

    public void setBagss(List<bags> bagss) {
        this.bagss = bagss;
    }
}
