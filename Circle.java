package week;

public class Circle extends Shape{
    public int radius ;

    public Circle(String color, int area,int radius) {
        super(color, area);
        this.radius=radius;
    }
    public void showInfo(){
        System.out.println(this.radius);



        showColor(color);
        showArea(this.area*3.14);
    }
}
