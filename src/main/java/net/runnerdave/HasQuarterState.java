package net.runnerdave;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class HasQuarterState implements State {
    private transient GumballMachine gumballMachine;
    private int randomWinner;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Already inserted a quarter");
    }

    public void ejectQuarter() {
        System.out.println("You can take your quarter back.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        randomWinner = (int) (Math.random() * 10 + 1);
        System.out.println("You will receive your gumball shortly. Winning number:" + randomWinner);
        if (5 == randomWinner && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("This operation is not allowed from has quarter state.");
    }
}
