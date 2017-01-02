package net.runnerdave;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    private int count = 5;
    private String location;

    @Override
    public String toString() {
        return "\nGumballMachine{" +
                "state=" + state +
                ", count=" + count +
                ", location=" + location +
                '}';
    }

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;
    private State state;

    public GumballMachine(int totalGumballs, String location) throws RemoteException {
        setSoldOutState(new SoldOutState(this));
        setNoQuarterState(new NoQuarterState(this));
        setHasQuarterState(new HasQuarterState(this));
        setSoldState(new SoldState(this));
        setWinnerState(new WinnerState(this));

        this.count = totalGumballs;
        this.location = location;

        if (totalGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void refill(int numberOfBalls) {
        this.setCount(this.count + numberOfBalls);
        this.setHasQuarterState(new HasQuarterState(this));
        this.setState(this.getNoQuarterState());
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (getCount() != 0) {
            setCount(getCount() - 1);
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }
}
