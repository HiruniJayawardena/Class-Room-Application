package repository.custom;

import entity.Lecturer;
import repository.CrudRepository;

public interface LecturerRepo extends CrudRepository<Lecturer, String> {
    boolean add(Lecturer lecturer, String name, String nic, int tpNo, String lessonId);
}
