import java.util.Random;

public class Computer extends Player{
    Computer() {
        name = "Computer";
    }
    public void createInput() {
        switch (new Random().nextInt(3)) {
            case 0 -> input = "камень";
            case 1 -> input = "ножницы";
            case 2 -> input = "бумага";
        }
    }
}
