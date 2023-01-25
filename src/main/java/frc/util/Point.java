package frc.util;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getNorm() {
        return Math.sqrt(x * x + y * y);
    }
    
    public Point add(Point other) {
        return new Point(x + other.getX(), y + other.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
