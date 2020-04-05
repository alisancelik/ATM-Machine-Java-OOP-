
import java.util.Scanner;

public class ATM {

public void work(Account account){
    Login login=new Login();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Welcome to out BANK");
    System.out.println("******************");
    System.out.println("Login ");
    System.out.println("******************");
    
    int accesstologin=3;
       
        while (true) {
            if (login.login(account)) {
                System.out.println("Login is successful");
                break;
                
                
            }
            else {
                System.out.println("Login is not successful");
                accesstologin -= 1;
                System.out.println("Your Right to login : " + accesstologin);
            }
            if (accesstologin == 0 ){
                System.out.println("Access is over");
                
                return;
                
            }
             
            
            
        }
        
        System.out.println("*********************************");
        String operations = "1. Check Balance\n"
                          + "2. Money Deposit\n"
                          + "3. Money witdrawal\n"
                          + " q' for Logging out";
        System.out.println(operations);
        System.out.println("**********************************");
        
        
        while (true) {
            System.out.println("Choice operation : ");
            String operation = scanner.nextLine();
            
            if (operation.equals("q")){
                
                break;
                
            }
            else if (operation.equals("1")){
                System.out.println("Balance : " + account.getBalance());
            }
            else if (operation.equals("2")){
                
                System.out.print("Money to Deposit : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.charge(amount);
                
            }
            else if (operation.equals("3")) {
                
                System.out.print("Money to Get : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdrawal(amount);
                
            }
            else {
                
                System.out.println("Wrong operation");
            }
            
            
            
        }
    }
    
}