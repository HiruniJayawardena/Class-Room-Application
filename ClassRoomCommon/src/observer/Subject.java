package observer;

import java.rmi.Remote;

public interface Subject extends Remote {
    public void register(Observer observer) throws Exception;
    public void unRegister(Observer observer) throws Exception;
    public void notifyAllObservers(String message)throws Exception;
}
