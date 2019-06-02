package business.custom.impl;

import business.custom.QuestionsBusiness;
import dto.QuestionsDTO;

import java.util.List;

public class QuestionsBusinessImpl implements QuestionsBusiness {
    @Override
    public boolean addQuestion(QuestionsDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteQuestion(QuestionsDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateQuestion(QuestionsDTO dto) throws Exception {
        return false;
    }

    @Override
    public QuestionsDTO searchQuestion(String id) throws Exception {
        return null;
    }

    @Override
    public List<QuestionsDTO> getAllQuestions() throws Exception {
        return null;
    }
}
