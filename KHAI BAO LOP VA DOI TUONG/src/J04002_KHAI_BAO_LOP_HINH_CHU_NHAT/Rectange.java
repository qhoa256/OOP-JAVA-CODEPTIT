package J04002_KHAI_BAO_LOP_HINH_CHU_NHAT;

public class Rectange {
    private double width, height;
    String color;

    public Rectange() {
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void format() {
        String res = "";
        res += Character.toUpperCase(color.charAt(0));
        for (int i = 1; i < color.length(); i++) {
            res += Character.toLowerCase(color.charAt(i));
        }
        this.color = res;
    }

    double findArea() {
        return this.width * this.height;
    }

    double findPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        format();
        return (int) findPerimeter() + " " + (int) findArea() + " " + getColor();
    }
}
