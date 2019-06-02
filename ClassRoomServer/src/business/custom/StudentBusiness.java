package business.custom;

import business.SuperBusiness;
import dto.StudentDTO;

import java.util.List;

public interface StudentBusiness extends SuperBusiness {

    public boolean addStudent(StudentDTO dto) throws Exception;

    public boolean deleteStudent(StudentDTO dto) throws Exception;

    public boolean updateStudent(StudentDTO dto) throws Exception;

    public StudentDTO searchStudent(String id) throws Exception;

    public List<StudentDTO> getAllStudents() throws Exception;
}
