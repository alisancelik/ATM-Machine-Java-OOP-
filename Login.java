
import java.util.Scanner;


public class Login {
public boolean login(Account account){

    Scanner scanner=new Scanner(System.in);
    String accountname;
    String password;
    
    System.out.println("Please Enter your username");
    accountname=scanner.nextLine();
    System.out.println("Please enter your password");
    password=scanner.nextLine();
    
    if (account.getAccountname()==accountname && account.getPassword()==password){
    
        return true;

    }
    else{
    
    return false;}

}
    
}
