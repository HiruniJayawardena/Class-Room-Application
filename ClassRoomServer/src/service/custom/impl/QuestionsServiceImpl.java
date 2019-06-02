package service.custom.impl;

import business.BusinessFactory;
import business.custom.QuestionsBusiness;
import dto.QuestionsDTO;
import observer.Observer;
import resrevation.impl.ReservationsImpl;
import service.custom.QuestionsService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class QuestionsServiceImpl extends UnicastRemoteObject implements QuestionsService {
    QuestionsBusiness businessFor=BusinessFactory.getInstance().getBusinessFor(BusinessFactory.BusinessTypes.QUESTIONS);
    private static ArrayList<Observer> allQuestionObservers=new ArrayList<>();
    private static ReservationsImpl<QuestionsService> questionsReservations=new ReservationsImpl<>();

    public QuestionsServiceImpl() throws Exception {
    }

    @Override
    public boolean addQuestion(QuestionsDTO dto) throws Exception {
        notifyAllObservers(dto.getqCode() + "is Added...!");
        return businessFor.addQuestion(dto);
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

    @Override
    public void register(Observer observer) throws Exception {

    }

    @Override
    public void unRegister(Observer observer) throws Exception {

    }

    @Override
    public void notifyAllObservers(String message) throws Exception {

    }

    @Override
    public boolean reserved(Object id) throws Exception {
        return false;
    }

    @Override
    public boolean released(Object id) throws Exception {
        return false;
    }
}
