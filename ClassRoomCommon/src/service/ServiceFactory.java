package service;

import java.rmi.Remote;

public interface ServiceFactory extends Remote {
    public enum ServiceTypes{
        LECTURER, LESSON, QUESTIONS, STUDENT;
    }

    public <T>T getSuperService(ServiceTypes types) throws Exception;
}
