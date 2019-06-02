package service.custom.impl;

import business.BusinessFactory;
import business.custom.StudentBusiness;
import dto.StudentDTO;
import observer.Observer;
import resrevation.impl.ReservationsImpl;
import service.custom.StudentService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {

    StudentBusiness businessFor=BusinessFactory.getInstance().getBusinessFor(BusinessFactory.BusinessTypes.STUDENT);
    private static ArrayList<Observer> allStudentObservers=new ArrayList<>();
    private static ReservationsImpl<StudentService> studentReservations=new ReservationsImpl<>();

    public StudentServiceImpl() throws Exception {
    }

    @Override
    public boolean addStudent(StudentDTO dto) throws Exception {
        notifyAllObservers(dto.getStId() + "is Added...!");
        return businessFor.addStudent(dto);
    }

    @Override
    public boolean deleteStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public StudentDTO searchStudent(String id) throws Exception {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() throws Exception {
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
