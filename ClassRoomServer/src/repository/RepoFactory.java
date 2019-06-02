package repository;

import repository.custom.impl.*;

public class RepoFactory {
    public static RepoFactory repoFactory;

    public static RepoFactory getInsatance(){
        if(repoFactory==null){
            repoFactory=new RepoFactory();
        }
        return repoFactory;
    }

    public enum RepoTypes{
        LECTURER, LESSON, LESSONDETAILS, QUESTIONS, STUDENT;
    }

    public <T>T getRepositoryFor(RepoTypes types){
        switch (types){
            case LECTURER:
                return (T) new LecturerRepoImpl();
            case LESSON:
                return (T) new LessonRepoImpl();
            case LESSONDETAILS:
                return (T) new LessonDetailsRepoImpl();
            case QUESTIONS:
                return (T) new QuestionsRepoImpl();
            case STUDENT:
                return (T) new StudentRepoImpl();
                default:
                    return null;
        }
    }
}
