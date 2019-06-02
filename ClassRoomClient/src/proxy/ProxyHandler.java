package proxy;

import service.ServiceFactory;
import service.custom.LecturerService;
import service.custom.LessonService;
import service.custom.impl.LessonServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProxyHandler implements ServiceFactory {
    private static ProxyHandler proxyHandler;
    private LessonService lessonService;
    private LecturerService lecturerService;

    public static ProxyHandler getInstance() throws Exception{
        if(proxyHandler==null){
            proxyHandler=new ProxyHandler();
        }
        return proxyHandler;
    }

    public ProxyHandler() throws Exception {

        try {
            ServiceFactory serviceFactory= null;
            serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:7070/ijse");
            lessonService=serviceFactory.getSuperService(ServiceTypes.LESSON);
            lecturerService=serviceFactory.getSuperService(ServiceTypes.LECTURER);
        } catch (NotBoundException e) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, e);
        } catch (MalformedURLException e) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, e);
        } catch (RemoteException e) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, e);
        }


    }

    @Override
    public <T> T getSuperService(ServiceTypes types) throws Exception {
        switch (types){
            case LESSON:
                return (T) lessonService;
            case LECTURER:
                return (T) lecturerService;
                default:
                    return null;
        }
    }
}
