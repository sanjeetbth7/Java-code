// package bank;

class Account {
    public String name;
    protected String email ;
    private String password;

    // getters & setters --> for access and modify the private

    public String getPassword(){
        return this.password;
    }

    public void setPassword( String pass){
        this.password=pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account a1= new Account();
        a1.name = "Sanjeet";
    }
    
}
