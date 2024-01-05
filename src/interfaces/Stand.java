package interfaces;

import classes.Entity;
import classes.Place;

public interface Stand {
    public void stand(Entity smth, boolean neg);
    public void stand_where(Entity smth, Place.Direction direction, boolean neg);
}
