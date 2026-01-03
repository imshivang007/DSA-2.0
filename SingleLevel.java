class Shape{
    String color;
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing a circle of color: " + color);
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color = "red";
        circle.draw();

    }
}
