package net.runnerdave;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by davidajimenez on 1/01/2017.
 */
public class GumballMachineMonitorTestDrive {
    public static void main(String[] args) {
        String location = "santafe.mightygumball.com";
        Registry myRego = null;
        try {
            myRego = LocateRegistry.getRegistry("127.0.0.1", 1099);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        System.out.println("Registry acquired!!!");


        try {
            GumballMachineRemote machine =
                    (GumballMachineRemote) myRego.lookup(location);
            GumballMonitor monitor = new GumballMonitor(machine);
            System.out.println(monitor);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

