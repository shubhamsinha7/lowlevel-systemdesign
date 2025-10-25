package SystemDesign.DesignCricinfo;

public class Ball {
    private final int ballNumber;
    private final int bowler;
    private final int batsman;
    private final int result;

    public Ball(int ballNumber, int bowler, int batsman, int result) {
        this.ballNumber = ballNumber;
        this.bowler = bowler;
        this.batsman = batsman;
        this.result = result;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public int getBowler() {
        return bowler;
    }

    public int getBatsman() {
        return batsman;
    }

    public int getResult() {
        return result;
    }
}
