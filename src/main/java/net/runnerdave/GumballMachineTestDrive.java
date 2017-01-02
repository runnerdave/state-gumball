package net.runnerdave;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        if (args.length == 2) {
            try {
                String location = args[1];
                int numberOfBalls = Integer.parseInt(args[0]);
                gumballMachine = new GumballMachine(numberOfBalls, location);
                Registry myRego = LocateRegistry.createRegistry(1099);
                myRego.rebind(location, gumballMachine);

                System.out.println("Server is ready!!");
            } catch (RemoteException e) {
                e.printStackTrace();
            }

//            GumballMonitor monitor = new GumballMonitor(gumballMachine);
//            monitor.report();
//
//            System.out.println(gumballMachine);
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.ejectQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            gumballMachine.ejectQuarter();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.refill(2);
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            gumballMachine.insertQuarter();
//            gumballMachine.turnCrank();
//            System.out.println(gumballMachine);
//
//            System.out.println();
//
//            monitor.report();
        } else {
            System.out.println("Bad setup, please run the class with two values: int, String");
        }
    }
}
