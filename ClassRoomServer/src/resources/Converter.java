package resources;

import dto.LessonDTO;
import entity.Lesson;

public class Converter {

    public static <T,K> T getEntity(K dto){
        if(dto instanceof LessonDTO){
            LessonDTO lessonDTO= (LessonDTO) dto;
            return (T) new Lesson(lessonDTO.getLesId(), lessonDTO.getSubject());
        }
        return null;
    }

}
