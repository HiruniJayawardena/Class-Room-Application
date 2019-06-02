package dto;

public class LessonDTO implements SuperDTO{
    private String lesId;
    private String subject;

    public LessonDTO() {
    }

    public LessonDTO(String lesId, String subject) {
        this.lesId = lesId;
        this.subject = subject;
    }

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

    @Override
    public String toString() {
        return "LessonDTO{" +
                "lesId='" + lesId + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
