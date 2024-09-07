
import java.util.*;

class Student{
    String name;

    void printInfo(){
        System.out.println("Parrent called");
    }
}

class Boy extends Student{

    void printInfo(){
        System.out.println("Child called");
    }

}

public class Runtime_polymorphism {
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // int arr2[] = {1,2,3,5};
        
        // ArrayList<Integer> a = new ArrayList<Integer>(5); 
        // a.add(1);
        // a.add(2);
        // a.remove(0);

        // for (int e : a) {
        //     System.out.println(e);
        // }
        // for (int index = 0; index < a.size(); index++) {
        //     System.out.println(a.get(index));
        // }

        Boy b = new Boy();
        b.printInfo();

        Student s = new Boy(); // Dynamic methods dispatch
        Student s2 = new Student();
        
        s2.printInfo();

        s.printInfo();

        // Boy b2 = new Student();  // Child class can't acess parrent class constructor 

    }
}
