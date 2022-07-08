
public class Player {
    private String name;
    private int score;
    private int numberOfGuess;

    // Setters

    public void setNumberOfGuess(int numberOfGuess) {
        this.numberOfGuess = numberOfGuess;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getters

    public int getNumberOfGuess() {
        return numberOfGuess;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // regular methods
    public void increaseScore() {
        this.score += 1;
    }
    public void reduceNumberOfGuess(){
        this.numberOfGuess -=1;
    }
}
