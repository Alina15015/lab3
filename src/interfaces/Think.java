package interfaces;

import classes.Entity;
import enums.Moves;

public interface Think {
    void think(Moves move, Entity smth1, Entity smth2);
}
