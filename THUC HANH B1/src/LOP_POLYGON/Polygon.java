package LOP_POLYGON;

public class Polygon {
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }

    public String getArea() {
        double area = 0.0;
        for (int i = 0; i < p.length; i++) {
            int j = (i + 1) % p.length;
            area += 0.5 * (p[i].x * p[j].y - p[j].x * p[i].y);
        }
        return String.format("%.3f", area);
    }
}
