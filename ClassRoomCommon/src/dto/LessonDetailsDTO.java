package dto;

public class LessonDetailsDTO {
    private String lessonId;
    private String studentId;

    public LessonDetailsDTO() {
    }

    public LessonDetailsDTO(String lessonId, String studentId) {
        this.lessonId = lessonId;
        this.studentId = studentId;
    }

    public String getLessonId() {
        return lessonId;
    }

    public void setLessonId(String lessonId) {
        this.lessonId = lessonId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "LessonDetailsDTO{" +
                "lessonId='" + lessonId + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
