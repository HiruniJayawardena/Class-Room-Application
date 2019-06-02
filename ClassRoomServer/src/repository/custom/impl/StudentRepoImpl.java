package repository.custom.impl;

import entity.Student;
import repository.CrudRepositoryImpl;
import repository.custom.StudentRepo;

public class StudentRepoImpl extends CrudRepositoryImpl<Student, String> implements StudentRepo {
}
