package interfaces;

import classes.Entity;
import enums.Moves;

public interface Want {
    public void want_to_do(Moves move, boolean neg);
    public void want_to(Moves move, Entity smth, boolean neg);
}
