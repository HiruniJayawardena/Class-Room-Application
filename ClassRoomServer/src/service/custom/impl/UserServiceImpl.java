package service.custom.impl;

import business.BusinessFactory;
import business.custom.UserBusiness;
import dto.UserDTO;
import observer.Observer;
import service.custom.UserService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {

    private UserBusiness userBusiness;

    public UserServiceImpl() throws RemoteException {
        userBusiness=BusinessFactory.getInstance().getBusinessFor(BusinessFactory.BusinessTypes.USER);
    }


    @Override
    public boolean adUser(UserDTO dto) throws Exception {
        return userBusiness.addUser(dto);
    }

    @Override
    public boolean deleteUser(UserDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateUser(UserDTO dto) throws Exception {
        return false;
    }

    @Override
    public UserDTO searchUser(String id) throws Exception {
        return userBusiness.searchUser(id);
    }

    @Override
    public List<UserDTO> getAllUsers() throws Exception {
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
