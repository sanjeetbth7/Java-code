
class Shape{
    protected String color;

    void printColor(){
        System.out.println(this.color);
    }
}

class Triangle extends Shape {
    String type;
    int base;
    int height;

    double area(){
        double a = .5 * this.base * this.base;
        System.out.println("Area of "+this.type +" ="+a);
        return a;
    }
}

class Circle extends Shape {
    String type;
    int radius;

    double area(){
        double a = 2 * 3.1414 * this.radius * this.radius;
        System.out.println("Area of "+this.type +" ="+a);
        return a;
    }
}

public class inheritance {
    public static void main ( String []args){
      
        Triangle t = new Triangle();
        t.color = "Black";
        t.type = "Triangle";
        t.base = 4;
        t.height = 5;

        Circle c = new Circle();
        c.type = "Small Circle";
        c.color = "Blue";
        c.radius = 5;

        t.printColor();
        t.area();

        c.printColor();
        c.area();
    }
}
