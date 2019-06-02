package business.custom;

import business.SuperBusiness;
import dto.QuestionsDTO;

import java.util.List;

public interface QuestionsBusiness extends SuperBusiness {

    public boolean addQuestion(QuestionsDTO dto) throws Exception;

    public boolean deleteQuestion(QuestionsDTO dto) throws Exception;

    public boolean updateQuestion(QuestionsDTO dto) throws Exception;

    public QuestionsDTO searchQuestion(String id) throws Exception;

    public List<QuestionsDTO> getAllQuestions() throws Exception;
}
