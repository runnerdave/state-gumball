package net.runnerdave;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Cannot insert quarter, already one inside.");
    }

    public void ejectQuarter() {
        System.out.println("Too late the gumball is coming.");
    }

    public void turnCrank() {
        System.out.println("Already turned the crank once.");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            System.out.println("Here is your gumball.");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("no more gumballs sorry");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
