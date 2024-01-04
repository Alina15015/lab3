import other.Human;
import other.Moves;
import other.Thing;

public class Main {
    public static void main(String[] args) {
        Human alice = new Human("Алиса");
        Human solider1 = new Human("Первый солдат");
        Human solider2 = new Human("Второй солдат");
        Human jack = new Human("Червонный Валет");
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
        Thing surrounding = new Thing("окружение");
        Thing everything = new Thing("все");



        table.doing(Moves.STAND, judgment, false);
        dish.doing(Moves.STAND_BEAUTIFUL, table, false);
        pies.addStatus("имеют аппетитный вид");
        pies.printStatus();
        spit.doing(Moves.LEAK, alice, false);
        alice.want(Moves.END, court);
        alice.want(Moves.INVITE, table);
        alice.seeing(surrounding);
        alice.doing(Moves.BE, judgment, true);
        alice.reading(judgment);
        alice.know(Moves.CALL, everything);
    }
}