package service.custom;

import dto.UserDTO;
import observer.Subject;
import reservation.Reservation;
import service.SuperService;

import java.util.List;

public interface UserService extends SuperService, Reservation, Subject {
    public boolean adUser(UserDTO dto) throws Exception;
    public boolean deleteUser(UserDTO dto) throws Exception;
    public boolean updateUser(UserDTO dto) throws Exception;
    public UserDTO searchUser(String id) throws Exception;
    public List<UserDTO> getAllUsers() throws Exception;
}
