package service.custom;

import dto.QuestionsDTO;
import observer.Subject;
import reservation.Reservation;
import service.SuperService;

import java.util.List;

public interface QuestionsService extends SuperService, Reservation, Subject {
    public boolean addQuestion(QuestionsDTO dto) throws Exception;
    public boolean deleteQuestion(QuestionsDTO dto) throws Exception;
    public boolean updateQuestion(QuestionsDTO dto) throws Exception;
    public QuestionsDTO searchQuestion(String id) throws Exception;
    public List<QuestionsDTO> getAllQuestions() throws Exception;
}
