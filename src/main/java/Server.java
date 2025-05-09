public class Server {

    public static void playGame(Player p1, Player p2) {
        System.out.println("Добро пожаловать в игру");

        INNER: while (true) {
            p1.createInput();
            p2.createInput();
            if (p1.input.equals("перезапуск") || p2.input.equals("перезапуск")) {
                p1.score = 0;
                p2.score = 0;
                System.out.println("Счета обнулены");
                continue INNER;
            }
            if(p1.input.equals("выход") || p2.input.equals("выход")) {
                System.out.println("Игра закончена \n Счет \n" + p1.getScore() +  " | " + p2.getScore());
                break INNER;
            } switch (p1.input) {
                case "камень" -> {
                    switch (p2.input) {
                        case "камень" -> {
                            System.out.println("Ничья");
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        case "ножницы" -> {
                            System.out.println("Победил " + p1.name);
                            p1.score += 1;
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        case "бумага" -> {
                            System.out.println("Победил " + p2.name);
                            p2.score += 1;
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        default -> {
                            System.out.println("Выбор введен некоректно");
                            continue INNER;
                        }
                    }
                }
                case "ножницы" -> {
                    switch (p2.input) {
                        case "камень" -> {
                            System.out.println("Победил " + p2.name);
                            p2.score += 1;
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        case "ножницы" -> {
                            System.out.println("Ничья");
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        case "бумага" -> {
                            System.out.println("Победил " + p1.name);
                            p1.score += 1;
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        default -> {
                            System.out.println("Выбор введен некоректно");
                            continue INNER;
                        }
                    }
                }
                case "бумага" -> {
                    switch (p2.input) {
                        case "камень" -> {
                            System.out.println("Победил " + p1.name);
                            p1.score += 1;
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        case "ножницы" -> {
                            System.out.println("Победил " + p2.name);
                            p2.score += 1;
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        case "бумага" -> {
                            System.out.println("Ничья");
                            System.out.println("Счет " + p1.getScore() + " | " + p2.getScore());
                            continue INNER;
                        }
                        default -> {
                            System.out.println("Выбор введен некоректно");
                            continue INNER;
                        }
                    }
                }
                default -> {
                    System.out.println("Выбор введен некоректно");
                    continue INNER;
                }
            }

        }
    }

    public static void main(String[] args) {

        User u1 = new User("Artem");
        Computer u2 = new Computer();
        Server.playGame(u1, u2);
        System.out.println("Это была игра " + u1.name + " против " + u2.name);
    }
}


