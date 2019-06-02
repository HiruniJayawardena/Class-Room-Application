package repository.custom;

import entity.User;
import repository.CrudRepository;

public interface UserRepo  extends CrudRepository<User, String> {
}
