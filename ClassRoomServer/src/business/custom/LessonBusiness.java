package business.custom;

import business.SuperBusiness;
import dto.LessonDTO;

import java.util.List;

public interface LessonBusiness extends SuperBusiness {

    public boolean addLesson(LessonDTO dto) throws Exception;

    public boolean deleteLesson(LessonDTO dto) throws Exception;

    public boolean updateLesson(LessonDTO dto) throws Exception;

    public LessonDTO searchLesson(String id) throws Exception;

    public List<LessonDTO> getAllLessons() throws Exception;
}
