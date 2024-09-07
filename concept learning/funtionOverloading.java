

class Pen{
    String color;
    String type;
    
   void printInfo(){
        System.out.println("1");
        System.out.println("color : "+this.color+", type : "+this.type);
    }

    //--> ask to teacher  if the return type is different then why this showing error
    /* According to chatGPT  
      It looks like there's a small issue in your code. You have two methods with the same name printInfo(), but they differ in their return types. In Java, methods with the same name must have different parameter lists or different return types. In your case, both methods have the same parameter list, but one returns void and the other returns a String. This will result in a compilation error.

     */

    // String printInfo(){      
    //     System.out.println("color : "+this.color+", type : "+this.type);
    //     return this.color;
    // }

    void printInfo(Pen p){
        System.out.println("2");
        System.out.println("color : "+p.color+", type : "+p.type);
    }

    void printInfo(String s, String c){
        System.out.println("3");
        System.out.println("color : "+s+", type : "+c);
    }
}


public class funtionOverloading {
    public static void main (String args[]) {
        Pen pen1= new Pen();
        pen1.color="Black";
        pen1.type="Gel";
        
        

        Pen pen2= new Pen();
        pen2.color="Red";
        pen2.type="Bollpen";

        // function overloading -> compile time polymorphism
        pen1.printInfo();
        pen1.printInfo(pen2);
        pen1.printInfo(pen2.color,pen2.type);
    }
}