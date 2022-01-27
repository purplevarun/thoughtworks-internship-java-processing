import processing.core.PApplet;

public class BallGame extends PApplet {
    private static int WIDTH = 800, HEIGHT = 800;
    private static Ball Ball1, Ball2, Ball3, Ball4;

    public static void main(String[] args) {
        PApplet.main("BallGame");
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        colorCircleRed();
        colorOutlineWhite();
        Ball1 = new Ball(1);
        Ball2 = new Ball(2);
        Ball3 = new Ball(3);
        Ball4 = new Ball(4);
    }

    public void colorOutlineWhite() {
        stroke(255);
    }

    public void colorCircleRed() {
        fill(255, 0, 0);
    }

    @Override
    public void draw() {
        clearBg();
        drawEllipse();
        update();
    }

    private void drawEllipse() {
        ellipse(Ball1.X, Ball1.distanceFromTop, Ball1.DIAMETER, Ball1.DIAMETER);
        ellipse(Ball2.X, Ball2.distanceFromTop, Ball2.DIAMETER, Ball2.DIAMETER);
        ellipse(Ball3.X, Ball3.distanceFromTop, Ball3.DIAMETER, Ball3.DIAMETER);
        ellipse(Ball4.X, Ball4.distanceFromTop, Ball4.DIAMETER, Ball4.DIAMETER);
    }

    private void update() {
        Ball1.X += Ball1.speed;
        Ball2.X += Ball2.speed;
        Ball3.X += Ball3.speed;
        Ball4.X += Ball4.speed;
    }

    private void clearBg() {
        background(0);
    }
}
