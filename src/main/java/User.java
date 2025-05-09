import java.util.Scanner;

public class User extends Player{
    User(String name) {
        this.name = name;
    }

    public void createInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите ваш выбор: Камень/Ножницы/Бумага \nДля выхода введите Выход, Для перезапуска введите Перезапуск");
        input = sc.nextLine().toLowerCase();
    }

}
