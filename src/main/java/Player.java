public abstract class Player {
    public Player() {
        score = 0;
    }

    String name;
    String input;
    int score;

    public String getScore() {
        return name + " " + score;
    }
    abstract void createInput();
}
