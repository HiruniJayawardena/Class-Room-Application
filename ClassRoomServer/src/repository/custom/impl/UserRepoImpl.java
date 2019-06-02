package repository.custom.impl;

import entity.User;
import repository.CrudRepositoryImpl;
import repository.custom.UserRepo;

public class UserRepoImpl extends CrudRepositoryImpl<User, String> implements UserRepo {
}
