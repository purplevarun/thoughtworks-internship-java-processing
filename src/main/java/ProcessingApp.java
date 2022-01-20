import processing.core.PApplet;
public class ProcessingApp extends PApplet {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    private static final int DIAMETER = 100;
    private static int x = 0;
    public static void main(String[] args) {
        PApplet.main("ProcessingApp",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        ellipse(WIDTH/2,HEIGHT/2, DIAMETER,DIAMETER);
    }

    @Override
    public void draw() {
        paintWhite();
        drawEllipse();
    }

    private void drawEllipse() {
        ellipse(x++,HEIGHT/2,100,100);
    }

    private void paintWhite() {background(255);
    }
}
