package business.custom;

import business.SuperBusiness;
import dto.LecturerDTO;

import java.util.List;

public interface LecturerBusiness extends SuperBusiness {

    public boolean addLecturer(LecturerDTO dto) throws Exception;

    public boolean deleteLecturer(LecturerDTO dto) throws Exception;

    public boolean updateLecturer(LecturerDTO dto) throws Exception;

    public LecturerDTO searchLecturer(String id) throws Exception;

    public List<LecturerDTO> getAllLecturers() throws Exception;
}
