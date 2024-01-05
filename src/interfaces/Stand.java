package interfaces;

import classes.Entity;
import classes.Place;

public interface Stand {
    void stand(Entity smth, boolean neg);
    void stand_where(Entity smth, Place.Direction direction, boolean neg);
}
