

public class Computer {
    private int imaginedNumber;
    private int score;
    private int minimalNumber;
    private int maximalNumber;

    // Setters

    public void setMinimalNumber(int minimalNumber) {
        this.minimalNumber = minimalNumber;
    }

    public void setMaximalNumber(int maximalNumber) {
        this.maximalNumber = maximalNumber;
    }

    public void setImaginedNumber() {
        this.imaginedNumber = (int)(Math.random() * (maximalNumber - minimalNumber + 1) + minimalNumber);
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getters

    public int getScore() {
        return score;
    }

    public int getImaginedNumber() {
        return imaginedNumber;
    }

    public int getMinimalNumber() {
        return minimalNumber;
    }

    public int getMaximalNumber() {
        return maximalNumber;
    }
}
