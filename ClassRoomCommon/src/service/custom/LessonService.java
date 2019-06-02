package service.custom;

import dto.LessonDTO;
import observer.Subject;
import reservation.Reservation;
import service.SuperService;

import java.util.List;

public interface LessonService extends SuperService, Reservation, Subject {
    public boolean addLesson(LessonDTO dto) throws Exception;
    public boolean deleteLesson(LessonDTO dto) throws Exception;
    public boolean updateLesson(LessonDTO dto) throws Exception;
    public LessonDTO searchLesson(String id) throws Exception;
    public List<LessonDTO> getAllLessons() throws Exception;
}
