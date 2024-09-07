import java.util.*;

class Account {

    float interest_rate = 7;
    long acc_no;
    double balance = 0;
    String cust_name;

    Scanner in = new Scanner(System.in);

    Account() {
        System.out.println("Enter your Account Number : ");
        acc_no = in.nextLong();
        System.out.println("Enter Your name : ");
        cust_name = in.nextLine();
        in.next();
    }

    void deposit() {
        System.out.println("Enter the Amount to Deposite = ");
        double money = in.nextDouble();
        balance += money;
        System.out.println("\nCurrent Balance = " + balance);
    }

    void withdraw() {
        System.out.println("Enter the Amount = ");
        double money = in.nextDouble();
        if (balance >= money) {
            balance -= money;
            System.out.println("\nCurrent Balance = " + balance);
        } else {
            System.out.println("\nNot enough money in your account.");
        }
    }

    void view_balance() {
        System.out.println("\nCurrent Balance = " + balance);
    }
}

class Savings_acc extends Account {
    String acc_type;
    Savings_acc(){
        System.out.println("Enter Your Acount Type : ");
        acc_type = in.nextLine();
        in.next();
    }

    void deposit() {
        System.out.println("Enter the Amount = ");
        double money = in.nextDouble();
        balance += money;
        System.out.println("\nCurrent Balance = " + balance);
    }

    void withdraw() {
        System.out.println("Enter the Amount to withdraw = ");
        double money = in.nextDouble();
        if (balance >= money) {
            balance -= money;
            System.out.println("\nCurrent Balance = " + balance);
        } else {
            System.out.println("\nNot enough money in your account.");
        }
    }

    public void close_acc() {

    }

}

class Recurring_acc extends Account {
    long tenure;

    Recurring_acc(){
        System.out.println("Enter the tenure : ");
        tenure= in.nextLong();
    }

    void deposit() {
        System.out.println("Enter the Amount = ");
        double money = in.nextDouble();
        balance += money;
        System.out.println("\nCurrent Balance = " + balance);
    }

    void withdraw(long accNo, double money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("\nCurrent Balance = " + balance);
        } else {
            System.out.println("\nNot enough money in your account.");
        }
    }

    public void close_acc() {

    }
}

class Bank {
    public static void main(String[] args) {

        Account myAccount = new Account();
        System.out.println("\n\n---deposit method----- \n\n");
        myAccount.deposit();
        System.out.println("\n\n---withdraw method----- \n\n");
        myAccount.withdraw();
        System.out.println("\n\n---view_balance method-----\n\n");
        myAccount.view_balance();

        


    }
}



