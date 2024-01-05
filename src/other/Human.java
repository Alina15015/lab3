package other;

import interfaces.*;

public class Human extends Entity implements Read, See, Know, Want, Think {
    public Human(String name) {
        super(name);
    }

    public void want_to_do(Moves move, boolean neg){
        if (neg) {
            System.out.print(getName() + " не хочет");
        }
        else {
            System.out.print(getName() + " хочет");
        }
        switch (move) {
            case STAND -> System.out.println(" стоять");
            case THINK -> System.out.println(" думать");
            case INVITE -> System.out.println(" позвать");
            case SEE -> System.out.println(" видеть");
            case BE -> System.out.println(" быть");
            case READ -> System.out.println(" читать");
            case END -> System.out.println(" закончиться");
        }
    }

    public void want_to(Moves move, Entity smth, boolean neg){
        if (neg) {
            System.out.print(getName() + " не хочет, чтобы ");
        }
        else {
            System.out.print(getName() + " хочет, чтобы ");
        }
        switch (move) {
            case STAND -> System.out.println("стояли на " + smth.getName());
            case THINK -> System.out.println("думали о " + smth.getName());
            case INVITE -> System.out.println("позвали к " + smth.getName());
            case SEE -> System.out.println("видели " + smth.getName());
            case BE -> System.out.println("были в " + smth.getName());
            case READ -> System.out.println("читали о " + smth.getName());
            case END -> System.out.println(smth.getName() + " закончился ");
        }
    }

    public void know(Moves move, Entity smth, boolean neg) {
        if (neg) {
            System.out.print(getName() + " не знает, как");
        }
        else {
            System.out.print(getName() + " знает, как");
        }
        if (smth.getName() == null) {
            switch (move) {
                case STAND -> System.out.println(" стоять");
                case THINK -> System.out.println(" думать");
                case INVITE -> System.out.println(" позвать");
                case SEE -> System.out.println(" видть");
                case BE -> System.out.println(" быть");
                case READ -> System.out.println(" читать");
                case CALL -> System.out.println(" называть");
            }
        } else {
            switch (move) {
                case STAND -> System.out.println(" стоять на " + smth.getName());
                case THINK -> System.out.println(" думать " + smth.getName());
                case INVITE -> System.out.println(" позвать " + smth.getName());
                case SEE -> System.out.println(" видеть " + smth.getName());
                case BE -> System.out.println(" быть " + smth.getName());
                case READ -> System.out.println(" читается " + smth.getName());
                case CALL -> System.out.println(" называется " + smth.getName());
            }
        }
    }

    public void think(Moves move, Entity smth1, Entity smth2) {
        System.out.print(getName() + " думает: ");
        switch (move) {
            case STAND -> System.out.println(smth1.getName() + " стоит на " + smth2.getName());
            case THINK -> System.out.println(smth1.getName() + " думает о " + smth2.getName());
            case INVITE -> System.out.println(smth1.getName() + " зовет к " + smth2.getName());
            case SEE -> System.out.println(smth1.getName() + " видит " + smth2.getName());
            case READ -> System.out.println(smth1.getName() + " читает " + smth2.getName());
            case HAVE -> System.out.println(smth1.getName() + " имеет " + smth2.getName());
        }
    }

    public void read(Entity smth, boolean neg) {
        if (neg) {
            System.out.println(getName() + " не читала про " + smth.getName());
        }
        else {
            System.out.println(getName() + " читала про " + smth.getName());
        }
    }

    public void see(Entity smth, boolean neg) {
        if (neg) {
            System.out.println(getName() + " не рассматривала " + smth.getName());
        }
        else {
            System.out.println(getName() + " рассматривала " + smth.getName());
        }
    }
}
