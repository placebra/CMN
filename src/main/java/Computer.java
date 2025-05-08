import java.util.Random;

public class Computer extends Player{
    Computer() {
        name = "Computer";
    }
    public void createInput() {
        switch (new Random().nextInt(3)) {
            case 0 -> input = "Камень";
            case 1 -> input = "Ножницы";
            case 2 -> input = "Бумага";
        }
    }
}
