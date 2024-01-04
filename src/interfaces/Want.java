package interfaces;

import other.*;

public interface Want {
    public void want_to_do(Moves move);
    public void want_to_do_with(Moves move, Thing smth);
    public void want_smth_to_do(Thing smth1, Moves move);
    public void want_smth_to_do_with(Thing smth1, Moves move, Thing smth);
}
