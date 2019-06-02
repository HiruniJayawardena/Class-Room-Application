package service.custom;

import dto.LecturerDTO;
import observer.Subject;
import reservation.Reservation;
import service.SuperService;

import java.util.List;

public interface LecturerService extends SuperService, Reservation, Subject {
    public boolean addLecturer(LecturerDTO dto) throws Exception;
    public boolean deleteLecturer(LecturerDTO dto) throws Exception;
    public boolean updateLecturer(LecturerDTO dto) throws Exception;
    public LecturerDTO searchLecturer(String id) throws Exception;
    public List<LecturerDTO> getAllLecturers() throws Exception;
}
