package repository.custom.impl;

import entity.Lecturer;
import repository.CrudRepositoryImpl;
import repository.custom.LecturerRepo;

public class LecturerRepoImpl extends CrudRepositoryImpl<Lecturer, String> implements LecturerRepo {
    @Override
    public boolean add(Lecturer lecturer, String name, String nic, int tpNo, String lessonId) {
        return false;
    }
}
