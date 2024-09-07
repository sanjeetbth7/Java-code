
class Stack{
    
    class Node{
        String item;
        Node next;

        Node(String str){
            this.item=str;
        }
        Node(){};
    }

    protected Node top = null;

    public boolean isEmpty(){
        if(top==null) return true;
        else return false;
    }

    public void push(String str){
        Node oldTop=top;
        top = new Node(str);
        top.next=oldTop;
    }

    public String pop(){
        String str= top.item;
        top=top.next;
        return str;
    }
}

public class Stack_implemaintation {
    public static void main (String []args){
        Stack stack = new Stack();
        
        System.out.println(stack.isEmpty());
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        String s =stack.pop();
        System.out.println("Poped data = "+s);
        System.out.println(stack.isEmpty());

    }
}
