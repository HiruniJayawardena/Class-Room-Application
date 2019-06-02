package business.custom.impl;

import business.custom.UserBusiness;
import dto.UserDTO;
import entity.User;
import org.hibernate.Session;
import repository.RepoFactory;
import repository.custom.UserRepo;
import resources.HibUtil;

import java.util.List;

public class UserBusinessImpl implements UserBusiness {

    private UserRepo userRepo;

    public UserBusinessImpl() {
        userRepo= RepoFactory.getInsatance().getRepositoryFor(RepoFactory.RepoTypes.USER);
    }

    @Override
    public boolean addUser(UserDTO dto) throws Exception {
        try(Session openSession= HibUtil.getSessionFactory().openSession()) {
            userRepo.setSession(openSession);
            openSession.getTransaction().begin();
            boolean response = userRepo.add(
                    new User(
                            dto.getUserName(),
                            dto.getPassword()
                    ));
            openSession.getTransaction().commit();
            return response;
        }
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
        try(Session openSession= HibUtil.getSessionFactory().openSession()) {
            userRepo.setSession(openSession);
            openSession.getTransaction().begin();
            User user=userRepo.search(id);

            openSession.getTransaction().commit();
            return new UserDTO(user.getUserName(),user.getPassword());
        }
    }

    @Override
    public List<UserDTO> getAllUsers() throws Exception {
        return null;
    }
}
