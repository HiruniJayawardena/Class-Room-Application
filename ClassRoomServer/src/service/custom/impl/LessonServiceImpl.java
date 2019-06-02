package service.custom.impl;

import business.BusinessFactory;
import business.custom.LessonBusiness;
import dto.LessonDTO;
import observer.Observer;
import resrevation.impl.ReservationsImpl;
import service.custom.LessonService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class LessonServiceImpl extends UnicastRemoteObject implements LessonService {

    LessonBusiness businessFor=BusinessFactory.getInstance().getBusinessFor(BusinessFactory.BusinessTypes.LESSON);
    private static ArrayList<Observer> allLessonObservers=new ArrayList<>();
    private static ReservationsImpl<LessonService> lessonReservations=new ReservationsImpl<>();

    public LessonServiceImpl() throws Exception {
    }

    @Override
    public boolean addLesson(LessonDTO dto) throws Exception {
        notifyAllObservers(dto.getLesId() + "is Added..!");
        return businessFor.addLesson(dto);
    }

    @Override
    public boolean deleteLesson(LessonDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateLesson(LessonDTO dto) throws Exception {
        return false;
    }

    @Override
    public LessonDTO searchLesson(String id) throws Exception {
        return null;
    }

    @Override
    public List<LessonDTO> getAllLessons() throws Exception {
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
