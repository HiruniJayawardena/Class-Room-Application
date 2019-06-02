package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lecturer {
    @Id
    private String lecid;
    private String name;
    private String nic;
    private int tpNo;
//    private String lessonId;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name ="lessonId", referencedColumnName = "lesId")
    private Lesson lessonId;
    @OneToMany(mappedBy = "lecturerId", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Questions> questions=new ArrayList<>();

    public Lecturer() {
    }

    public Lecturer(String lecid, String name, String nic, int tpNo, Lesson lessonId) {
        this.lecid = lecid;
        this.name = name;
        this.nic = nic;
        this.tpNo = tpNo;
        this.lessonId = lessonId;
    }


    public Lecturer(String lecid) {
    }

    public String getLecid() {
        return lecid;
    }

    public void setLecid(String lecid) {
        this.lecid = lecid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getTpNo() {
        return tpNo;
    }

    public void setTpNo(int tpNo) {
        this.tpNo = tpNo;
    }

    public Lesson getLessonId() {
        return lessonId;
    }

    public void setLessonId(Lesson lessonId) {
        this.lessonId = lessonId;
    }
}
