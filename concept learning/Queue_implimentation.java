import java.util.Scanner;

class Queue{

    private class Node{
        String item;
        Node behind;

        Node(String str){
            this.item=str;
        }
        Node(){};
    }

    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        if(head == null) return true;
        return false;
    }

    public void enque(String str){
        if(head==null){
            head = new Node();
            head.item=str;
            tail=head;
            return;
        }
        tail.behind=new Node(str);
        tail = tail.behind;
    }

    public String deque(){
        if(isEmpty()) return "Queue is empty";
        String returnVal=head.item;
        head=head.behind;
        return returnVal;
    }

}
public class Queue_implimentation {
    public static void main(String []args){
        Queue queue = new Queue();

        System.out.println(queue.isEmpty());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items : ");
        int n = sc.nextInt();

        System.out.printf("Enter the %d items : \n",n);

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            queue.enque(str);
        }

        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.deque());
        System.out.println(queue.isEmpty());

    }
}
