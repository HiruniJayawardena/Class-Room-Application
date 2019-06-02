package business.custom;

import business.SuperBusiness;
import dto.UserDTO;

import java.util.List;

public interface UserBusiness extends SuperBusiness {
    public boolean addUser(UserDTO dto) throws Exception;

    public boolean deleteUser(UserDTO dto) throws Exception;

    public boolean updateUser(UserDTO dto) throws Exception;

    public UserDTO searchUser(String id) throws Exception;

    public List<UserDTO> getAllUsers() throws Exception;
}
