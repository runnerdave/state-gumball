package net.runnerdave;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class NoQuarterState implements State {
    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Thanks for your business, you will have a gumball shortly.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You cannot eject a quarter, put one first.");
    }

    public void turnCrank() {
        System.out.println("No gumball, put quarter first.");
    }

    public void dispense() {
        System.out.println("Not possible to dispense from here.");
    }
}
