package interfaces;

import classes.Thing;
import exceptions.TooManyThingsException;

public interface Have {
    void addThing(Thing smth) throws TooManyThingsException;
    void removeThing(Thing smth);
    void printThings();
}