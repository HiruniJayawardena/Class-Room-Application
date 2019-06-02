package service.custom;

import dto.StudentDTO;
import observer.Subject;
import reservation.Reservation;
import service.SuperService;

import java.util.List;

public interface StudentService extends SuperService, Reservation, Subject {
    public boolean addStudent(StudentDTO dto) throws Exception;
    public boolean deleteStudent(StudentDTO dto) throws Exception;
    public boolean updateStudent(StudentDTO dto) throws Exception;
    public StudentDTO searchStudent(String id) throws Exception;
    public List<StudentDTO> getAllStudents() throws Exception;
}
