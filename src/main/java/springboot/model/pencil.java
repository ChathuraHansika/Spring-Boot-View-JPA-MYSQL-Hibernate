package springboot.model;

import javax.persistence.*;

/**
 * Created by Chathura on 4/8/2019.
 */
@Entity
public class pencil {
    @Id
    @Column(name = "pid")
    int PID;

    @Column(name = "pencilname")
    String PencilName;

    @ManyToOne
    @JoinColumn(name = "bagid")
    bags  bags;



    public pencil() {
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getPencilName() {
        return PencilName;
    }

    public void setPencilName(String pencilName) {
        PencilName = pencilName;
    }

    public springboot.model.bags getBags() {
        return bags;
    }

    public void setBags(springboot.model.bags bags) {
        this.bags = bags;
    }
}
