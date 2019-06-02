package server;

import service.impl.ServiceFactoryImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerStart {
    public static void main(String[] args) throws Exception {
        try {
            Registry registry=LocateRegistry.createRegistry(7070);
            registry.rebind("ijse",ServiceFactoryImpl.getInstance());
            System.out.println("Server has been Started...");

        }catch (RemoteException ex){
            Logger.getLogger(ServerStart.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex){
            Logger.getLogger(ServerStart.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
