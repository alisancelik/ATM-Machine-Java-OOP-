
public class Account {
    private String accountname;
    private String password;
    private int balance;

    public Account(String accountname, String password, int balance) {
        this.accountname = accountname;
        this.password = password;
        this.balance = balance;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void withdrawal(int amount){
    
      if (balance-amount<0){
      
          System.out.println("You can not do that action ");
      }
      else{
          balance-=amount;
          System.out.println("New balance="+" "+balance);
      
      }

      }
        public void charge(int deposit){
        balance+=deposit;
            System.out.println("New balance"+" "+balance);
        
        
        }
    }
    
    
    
    
