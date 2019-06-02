package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lesson {
    @Id
    private String lesId;
    private String subject;
//    @OneToMany(mappedBy = "lessonId", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Lecturer> lecturers=new ArrayList<>();

    public Lesson(String lesId, String subject) {
        this.lesId=lesId;
        this.subject=subject;
    }

//    public Lesson(String lesId, String subject, List<Lecturer> lecturers) {
//        this.lesId = lesId;
//        this.subject = subject;
//        this.lecturers = lecturers;
//    }

    public String getLesId() {
        return lesId;
    }

    public void setLesId(String lesId) {
        this.lesId = lesId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

//    public List<Lecturer> getLecturers() {
//        return lecturers;
//    }
//
//    public void setLecturers(List<Lecturer> lecturers) {
//        this.lecturers = lecturers;
//    }
}
