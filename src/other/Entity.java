package other;

import interfaces.*;

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

    public void addThing(Thing smth) {
        currentThings.add(smth);
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

    public void changeStatus(String status) {
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

    public void stand_where(Entity smth, Places place, boolean neg) {
        if (neg) {
            System.out.print(getName() + " не стоит ");
        }
        else {
            System.out.print(getName() + " стоит ");
        }
        switch (place) {
            case LEFT -> System.out.println("слева от " + smth.getName());
            case RIGHT -> System.out.println("справа от " + smth.getName());
            case CENTER -> System.out.println("в центре " + smth.getName());
            case FRONT -> System.out.println("перед " + smth.getName());
            case BEHIND -> System.out.println("позади  " + smth.getName());
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