package interfaces;

import classes.Thing;
import exceptions.TooManyThingsException;

public interface Have {
    public void addThing(Thing smth) throws TooManyThingsException;
    public void removeThing(Thing smth);
    public void printThings();
}