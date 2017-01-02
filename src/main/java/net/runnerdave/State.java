package net.runnerdave;

import java.io.Serializable;

/**
 * Created by davidajimenez on 6/08/2016.
 */
public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
