package dto;

import java.util.Date;

public class QuestionsDTO {
    private String qCode;
    private String question;
    private Date date;
    private String lecturerId;

    public QuestionsDTO() {
    }

    public QuestionsDTO(String qCode, String question, Date date, String lecturerId) {
        this.qCode = qCode;
        this.question = question;
        this.date = date;
        this.lecturerId = lecturerId;
    }

    public String getqCode() {
        return qCode;
    }

    public void setqCode(String qCode) {
        this.qCode = qCode;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    @Override
    public String toString() {
        return "QuestionsDTO{" +
                "qCode='" + qCode + '\'' +
                ", question='" + question + '\'' +
                ", date=" + date +
                ", lecturerId='" + lecturerId + '\'' +
                '}';
    }
}
