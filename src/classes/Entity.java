package classes;

import exceptions.TooManyThingsException;
import interfaces.*;
import exceptions.AlreadyHaveStatusException;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity implements Stand, Leak, Was, Have, Status{
    private String name;
    private List<Thing> currentThings = new ArrayList<>();
    private String currentStatus = null;

    public Entity(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void addThing(Thing smth) throws TooManyThingsException {
        currentThings.add(smth);
        if (currentThings.size() > 5) throw new TooManyThingsException(getName() +
                " имеет слишком много вещей");
    }

    public void removeThing(Thing smth) {
        currentThings.remove(smth);
    }

    public void printThings() {
        if (currentThings.isEmpty()) {
            System.out.println(getName() + " ничего не имеет");
        } else {
            for(Thing thing : currentThings) {
                System.out.println(getName() + " имеет " + thing.getName());
            }
        }
    }

    public void addStatus(String status) throws AlreadyHaveStatusException {
        if (currentStatus != null) throw new AlreadyHaveStatusException(getName() +
                " уже имеет статус");
        currentStatus = status;
    }

    public void removeStatus() {
        currentStatus = null;
    }

    public void printStatus() {
        if (currentStatus == null) {
            System.out.println(getName() + " не имеет статуса");
        } else {
            System.out.println(getName() + " " + currentStatus);
        }
    }

    public String getStatus() {
        return null;
    }

    public void stand(Entity smth, boolean neg) {
        if (neg) {
            System.out.println(getName() + " не стоит на " + smth.getName());
        }
        else {
            System.out.println(getName() + " стоит на " + smth.getName());
        }
    }

    public void stand_where(Entity smth, Place.Direction direction, boolean neg) {
        if (neg) {
            System.out.println(getName() + " не стоит " + direction.getValue() + " " + smth.getName());
        }
        else {
            System.out.println(getName() + " стоит " + direction.getValue() + " " + smth.getName());
        }
    }

    public void leak(boolean neg) {
        if (neg) {
            System.out.println(getName() + " не текут");
        }
        else {
            System.out.println(getName() + " текут");
        }
    }

    public void was(Entity smth, boolean neg) {
        if (neg) {
            System.out.println(getName() + " раньше не была в " + smth.getName());
        }
        else {
            System.out.println(getName() + " раньше была в " + smth.getName());
        }
    }
}