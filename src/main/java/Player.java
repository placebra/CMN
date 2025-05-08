public abstract class Player {
    public Player() {
        score = 0;
    }

    String name;
    String input;
    int score;

    public int getScore() {
        return score;
    }
    abstract void createInput();
}
