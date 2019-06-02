package repository.custom;

import entity.Student;
import repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, String> {
}
