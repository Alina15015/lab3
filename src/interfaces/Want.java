package interfaces;

import classes.Entity;
import enums.Moves;

public interface Want {
    void want_to_do(Moves move, boolean neg);
    void want_to(Moves move, Entity smth, boolean neg);
}
