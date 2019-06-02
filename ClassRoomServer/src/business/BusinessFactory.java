package business;

import business.custom.impl.LecturerBusinessImpl;
import business.custom.impl.LessonBusinessImpl;
import business.custom.impl.QuestionsBusinessImpl;
import business.custom.impl.StudentBusinessImpl;

public class BusinessFactory {
    public static BusinessFactory businessFactory;

    public static BusinessFactory getInstance(){
        if(businessFactory==null){
            businessFactory=new BusinessFactory();
        }
        return businessFactory;
    }

    public enum BusinessTypes{
        LECTURER, LESSON, QUESTIONS, STUDENT;
    }

    public <T>T getBusinessFor(BusinessTypes types){
        switch (types){
            case LECTURER:
                return (T) new LecturerBusinessImpl();
            case LESSON:
                return (T) new LessonBusinessImpl();
            case QUESTIONS:
                return (T) new QuestionsBusinessImpl();
            case STUDENT:
                return (T) new StudentBusinessImpl();
                default:
                    return null;
        }
    }
}
