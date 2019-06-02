package business.custom.impl;

import business.custom.LecturerBusiness;
import dto.LecturerDTO;
import entity.Lecturer;
import org.hibernate.Session;
import repository.RepoFactory;
import repository.custom.LecturerRepo;
import resources.HibUtil;

import java.util.List;

public class LecturerBusinessImpl implements LecturerBusiness {

    LecturerRepo repositoryFor=RepoFactory.getInsatance().getRepositoryFor(RepoFactory.RepoTypes.LECTURER);

    public LecturerBusinessImpl() {
    }

    @Override
    public boolean addLecturer(LecturerDTO dto) throws Exception {
        Session openSession=HibUtil.getSessionFactory().openSession();
        repositoryFor.setSession(openSession);
        openSession.getTransaction().begin();
        boolean response=repositoryFor.add(new Lecturer(dto.getLecid()), (dto.getName()), (dto.getNic()), (dto.getTpNo()), (dto.getLessonId()));
        openSession.getTransaction().commit();
        openSession.close();
        return response;
    }

    @Override
    public boolean deleteLecturer(LecturerDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateLecturer(LecturerDTO dto) throws Exception {
        return false;
    }

    @Override
    public LecturerDTO searchLecturer(String id) throws Exception {
        return null;
    }

    @Override
    public List<LecturerDTO> getAllLecturers() throws Exception {
        return null;
    }
}
