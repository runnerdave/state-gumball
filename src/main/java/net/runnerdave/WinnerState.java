package net.runnerdave;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("No need to add quarter, because you are a winner.");
    }

    public void ejectQuarter() {
        System.out.println("You cannot eject the quarter, because you are a winner.");
    }

    public void turnCrank() {
        System.out.println("your second gumball is comming");

    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            System.out.println("you get an extra gumball, because you are a winner.");
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("no more gumballs sorry");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }

    }
}
