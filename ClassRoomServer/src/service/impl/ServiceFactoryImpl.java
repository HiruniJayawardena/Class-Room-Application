package service.impl;

import service.ServiceFactory;
import service.custom.impl.LecturerServiceImpl;
import service.custom.impl.LessonServiceImpl;
import service.custom.impl.QuestionsServiceImpl;
import service.custom.impl.StudentServiceImpl;

import java.rmi.server.UnicastRemoteObject;

public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    public ServiceFactoryImpl() throws Exception {
    }

    public static ServiceFactoryImpl serviceFactory;

    public static ServiceFactoryImpl getInstance() throws Exception{
        if(serviceFactory==null){
            serviceFactory=new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public <T> T getSuperService(ServiceTypes types) throws Exception {
        switch (types){
            case LECTURER:
                return (T) new LecturerServiceImpl();
            case LESSON:
                return (T) new LessonServiceImpl();
            case QUESTIONS:
                return (T) new QuestionsServiceImpl();
            case STUDENT:
                return (T) new StudentServiceImpl();
                default:
                    return null;
        }
    }
}
