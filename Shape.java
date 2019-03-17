package week;

public class Shape {
    public String color;
    public int area;

    public Shape(String color, int area) {
        this.color = color;
        this.area = area;
    }

    public void showColor(String color){
        System.out.println(color);
    }
    public void showArea(double x){
        System.out.println(x);
    }
}
