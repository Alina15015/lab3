import classes.Human;
import enums.Moves;
import enums.Places;
import classes.Thing;
import exceptions.AlreadyHaveStatusException;
import exceptions.TooManyThingsException;

public class Main {
    public static void main(String[] args) {
        Human alice = new Human("Алиса");
        Human solider1 = new Human("Первый солдат");
        Human solider2 = new Human("Второй солдат");
        Human jack = new Human("Червонный Валет");
        Human king = new Human("Король");
        Human rabbit = new Human("Белый Кролик");
        Human judge = new Human("Судья");
        Thing throne = new Thing("судейский трон");
        Thing chains = new Thing("цепи");
        Thing pipe = new Thing("трубка");
        Thing scroll = new Thing("пергаментный свиток");
        Thing court = new Thing("суд");
        Thing judgment = new Thing("судебный зал");
        Thing dish = new Thing("блюдо");
        Thing pies = new Thing("пирожки");
        Thing table = new Thing("стол");
        Thing spit = new Thing("слюнки");
        Thing wig = new Thing("парик");
        Thing surrounding = new Thing("окружение");
        Thing everything = new Thing("все");

        try {
            jack.stand_where(throne, Places.FRONT, false);
            jack.addThing(chains);
            jack.printThings();
            solider1.stand_where(jack, Places.LEFT, false);
            solider2.stand_where(jack, Places.RIGHT, false);
            rabbit.stand_where(king, Places.RIGHT, false);
            rabbit.leftArm.addThing(pipe);
            rabbit.leftArm.printThings();
            rabbit.rightArm.addThing(scroll);
            rabbit.rightArm.printThings();
            table.stand_where(judgment, Places.CENTER, false);
            dish.stand(table, false);
            dish.addThing(pies);
            dish.printThings();
            pies.addStatus("имеют аппетитный вид");
            pies.printStatus();
            alice.addThing(spit);
            alice.printThings();
            spit.leak(false);
            alice.want_to(Moves.END, court, false);
            alice.want_to(Moves.INVITE, table, false);
            alice.see(surrounding, false);
            alice.was(court, true);
            alice.read(court, false);
            alice.know(Moves.CALL, everything, false);
            alice.think(Moves.HAVE, judge, wig);
        } catch (AlreadyHaveStatusException | TooManyThingsException e) {
            e.printStackTrace(System.out);
        }
    }
}