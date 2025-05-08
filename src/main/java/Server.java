public class Server {

    public static void playGame(Player p1, Player p2) {
        System.out.println("Добро пожаловать в игру");
        INNER: while (true) {
            p1.createInput();
            p2.createInput();
            if(p1.input.equals("Выход") || p2.input.equals("Выход")) {
                System.out.println("Игра закончена \n Счет \n" + p1.name + " " + p1.score + " | " + p2.name + " " + p2.score);
                break INNER;
            } switch (p1.input) {
                case "Камень" -> {
                    switch (p2.input) {
                        case "Камень" -> {
                            System.out.println("Ничья");
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        case "Ножницы" -> {
                            System.out.println("Победил " + p1.name);
                            p1.score += 1;
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        case "Бумага" -> {
                            System.out.println("Победил " + p2.name);
                            p2.score += 1;
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        default -> {
                            System.out.println("Выбор введен некоректно");
                            continue INNER;
                        }
                    }
                }
                case "Ножницы" -> {
                    switch (p2.input) {
                        case "Камень" -> {
                            System.out.println("Победил " + p2.name);
                            p2.score += 1;
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        case "Ножницы" -> {
                            System.out.println("Ничья");
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        case "Бумага" -> {
                            System.out.println("Победил " + p1.name);
                            p1.score += 1;
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        default -> {
                            System.out.println("Выбор введен некоректно");
                            continue INNER;
                        }
                    }
                }
                case "Бумага" -> {
                    switch (p2.input) {
                        case "Камень" -> {
                            System.out.println("Победил " + p1.name);
                            p1.score += 1;
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        case "Ножницы" -> {
                            System.out.println("Победил " + p2.name);
                            p2.score += 1;
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        case "Бумага" -> {
                            System.out.println("Ничья");
                            System.out.println("Счет " + p1.name + ": " + p1.score + " | " + p2.name + ": " + p2.score);
                            continue INNER;
                        }
                        default -> {
                            System.out.println("Выбор введен некоректно");
                            continue INNER;
                        }
                    }
                }
            }

        }
    }

    public static void main(String[] args) {

        User u1 = new User("Artem");
        User u2 = new User("Irina");
        Server.playGame(u1, u2);
    }
}


