public class Ball {
    public int speed;
    public int DIAMETER = 50;
    public float distanceFromTop;
    private int HEIGHT = 800;
    public int X = 0;
    Ball(int speed) {
        this.speed = speed;
        this.distanceFromTop = (float) speed / 5.0f * (float) HEIGHT;
    }
}
