import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    public static final int BALL_DIAMETER = 10;

    private int xCoordinateOfBalls[] = {0, 0, 0, 0};
    private int yCoordinateOfBalls[] = {WINDOW_HEIGHT / 5, WINDOW_HEIGHT * 2 / 5, WINDOW_HEIGHT * 3 / 5, WINDOW_HEIGHT * 4 / 5};
    private int speedPerFrameOfBalls[] = {1, 2, 3, 4};

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        for (int ballIndex = 0; ballIndex < 4; ballIndex++) {
            drawBall(ballIndex);
            moveBallRight(ballIndex);
        }
    }

    private void drawBall(int ballIndex) {
        ellipse(xCoordinateOfBalls[ballIndex], yCoordinateOfBalls[ballIndex], BALL_DIAMETER, BALL_DIAMETER);
    }

    private void moveBallRight(int ballIndex) {
        xCoordinateOfBalls[ballIndex] += speedPerFrameOfBalls[ballIndex];
    }
}


