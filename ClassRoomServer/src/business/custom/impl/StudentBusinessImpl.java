package business.custom.impl;

import business.custom.StudentBusiness;
import dto.StudentDTO;

import java.util.List;

public class StudentBusinessImpl implements StudentBusiness {
    @Override
    public boolean addStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateStudent(StudentDTO dto) throws Exception {
        return false;
    }

    @Override
    public StudentDTO searchStudent(String id) throws Exception {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() throws Exception {
        return null;
    }
}
