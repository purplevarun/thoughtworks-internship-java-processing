import processing.core.PApplet;

public class oopApproach{
    public static void main(String[] args) {
        new Ball(1.0f/5.0f,1);
        new Ball(2.0f/5.0f,2);
        new Ball(3.0f/5.0f,3);
        new Ball(4.0f/5.0f,4);
    }
}
class Ball extends PApplet{
    private static final int width = 800, height = 800, diameter=50;
    private static int speed = 0, x = 0;
    private static float distanceFromTop = 0.0f;
    Ball (float distanceFromTop0, int speed0){
        distanceFromTop=distanceFromTop0;
        speed=speed0;
    }

    public static void main(String[] args) {
        PApplet.main("oopApproach",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void setup() {
        super.setup();
        drawEllipse();
    }

    @Override
    public void draw() {
        clearBg();
        drawEllipse();
        x+=speed;
    }
    private void drawEllipse() {
        ellipse(x,height*distanceFromTop,diameter,diameter);
    }
    private void clearBg() {
        background(255);
    }
}