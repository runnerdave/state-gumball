package net.runnerdave;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("No more gumballs, your quarter will be returned shortly.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Take your quarter back, apologies.");
    }

    public void turnCrank() {
        System.out.println("Nothing happens, there is no more gumballs.");
    }

    public void dispense() {
        System.out.println("Not possible at this time.");
    }
}
