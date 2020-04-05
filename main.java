
public class main {
    public static void main(String[] args) {
        
        ATM atm=new ATM();
        Account account=new Account("alisan","1",1500);
        atm.work(account);
        System.out.println("Program is closing");
        
    }
    
}
