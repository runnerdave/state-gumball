package net.runnerdave;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
