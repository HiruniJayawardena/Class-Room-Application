package business.custom.impl;

import business.custom.LessonBusiness;
import dto.LessonDTO;
import entity.Lesson;
import org.hibernate.Session;
import repository.RepoFactory;
import repository.custom.LessonRepo;
import resources.HibUtil;

import java.util.List;

public class LessonBusinessImpl implements LessonBusiness {

    LessonRepo repositoryFor=RepoFactory.getInsatance().getRepositoryFor(RepoFactory.RepoTypes.LESSON);

    public LessonBusinessImpl() {
    }

    @Override
    public boolean addLesson(LessonDTO dto) throws Exception {
        Session openSession=HibUtil.getSessionFactory().openSession();
        repositoryFor.setSession(openSession);
        openSession.getTransaction().begin();

        boolean response=repositoryFor.add(new Lesson(dto.getLesId(), (dto.getSubject())));

        openSession.getTransaction().commit();
        openSession.close();
        return response;
    }

    @Override
    public boolean deleteLesson(LessonDTO dto) throws Exception {
        return false;
    }

    @Override
    public boolean updateLesson(LessonDTO dto) throws Exception {
        return false;
    }

    @Override
    public LessonDTO searchLesson(String id) throws Exception {
        return null;
    }

    @Override
    public List<LessonDTO> getAllLessons() throws Exception {
        return null;
    }
}
