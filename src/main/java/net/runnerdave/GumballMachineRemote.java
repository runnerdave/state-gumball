package net.runnerdave;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by davidajimenez on 31/12/2016.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
