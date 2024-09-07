
class Pen{
    String color;
    String type;
    
    void write(){
        System.out.println("color : "+this.color+", type : "+this.type);
    }
}

public class oops {
    public static void main (String args[]){
        Pen pen1= new Pen();
        pen1.color="Black";
        pen1.type="Gel";
        
        pen1.write();

        Pen pen2= new Pen();
        pen2.color="Red";
        pen2.type="Bollpen";

        pen2.write();
    }
}