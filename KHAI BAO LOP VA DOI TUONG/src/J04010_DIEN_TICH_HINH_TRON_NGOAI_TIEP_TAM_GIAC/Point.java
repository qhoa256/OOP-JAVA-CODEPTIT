package J04010_DIEN_TICH_HINH_TRON_NGOAI_TIEP_TAM_GIAC;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point secondPoint){
        return Math.sqrt(Math.pow(secondPoint.x - this.x, 2) + Math.pow(secondPoint.y - this.y, 2));
    }
}
