import processing.core.PApplet;

public class popApproach extends PApplet {
    private static final int width = 800, height = 800, diameter = 50;
    private static int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

    public static void main(String[] args) {
        PApplet.main("popApproach", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }

    @Override
    public void setup() {
        super.setup();
        drawEllipsis();
    }


    @Override
    public void draw() {
        clearBg();
        drawEllipsis();
        increaseXCoordinate();
    }

    private void clearBg() {
        background(255);
    }

    private void increaseXCoordinate() {
        x1 += 1;
        x2 += 2;
        x3 += 3;
        x4 += 4;
    }

    private void drawEllipsis() {
        ellipse(x1, height * (1.0f / 5.0f), diameter, diameter);
        ellipse(x2, height * (2.0f / 5.0f), diameter, diameter);
        ellipse(x3, height * (3.0f / 5.0f), diameter, diameter);
        ellipse(x4, height * (4.0f / 5.0f), diameter, diameter);
    }
}
