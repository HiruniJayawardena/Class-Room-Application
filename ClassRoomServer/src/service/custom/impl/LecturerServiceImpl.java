package service.custom.impl;

import business.BusinessFactory;
import business.custom.LecturerBusiness;
import dto.LecturerDTO;
import observer.Observer;
import resrevation.impl.ReservationsImpl;
import service.custom.LecturerService;


import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class LecturerServiceImpl extends UnicastRemoteObject implements LecturerService {

    LecturerBusiness businessFor=BusinessFactory.getInstance().getBusinessFor(BusinessFactory.BusinessTypes.LECTURER);
    private static ArrayList<Observer> allLecturerObservers=new ArrayList<>();
    private static ReservationsImpl<LecturerService> lecturerReservations=new ReservationsImpl<>();

    public LecturerServiceImpl() throws Exception {
    }

    @Override
    public boolean addLecturer(LecturerDTO dto) throws Exception {
        notifyAllObservers(dto.getLecid() + "is Added..!");
        return businessFor.addLecturer(dto);
    }

    @Override
    public boolean deleteLecturer(LecturerDTO dto) throws Exception {
        if(lecturerReservations.reserve(dto.getLecid(), this, true)){
            boolean deleteLecturer=businessFor.deleteLecturer(dto);
            if(deleteLecturer){
                if(lecturerReservations.checkState(dto.getLecid(),this)){
                    lecturerReservations.release(dto.getLecid(), this);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean updateLecturer(LecturerDTO dto) throws Exception {
        if(lecturerReservations.reserve(dto.getLecid(), this, true)){
//            boolean
        }
        return false;
    }

    @Override
    public LecturerDTO searchLecturer(String id) throws Exception {
        return null;
    }

    @Override
    public List<LecturerDTO> getAllLecturers() throws Exception {
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
