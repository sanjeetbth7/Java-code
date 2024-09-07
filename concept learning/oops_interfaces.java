interface Animal{
    int eye=2;
    void walk();
}

interface Herbivore{
    String property = "Eat grass";
}

class Horse implements Animal, Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
    
    public void printInfo(){
        System.out.println(eye+ " eyes and "+ property);
    }

}

public class oops_interfaces {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
        h1.printInfo();
    }
}
