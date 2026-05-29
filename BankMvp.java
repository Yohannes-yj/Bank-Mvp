abstract class BankAccount {
    
    private String accountHolder;
    private double balance;

    // constuctor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // getters and setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // abstract method
    public abstract void calaculateInterest();

    public void displayInfo() {
        System.out.println("Holder: " + accountHolder + " | Balance: $" + balance);
    }
   
}

class SavingsAccount extends BankAccount {
private float interestRate;

public SavingsAccount(String accountHolder, double balance, float interestRate) {
    super(accountHolder, balance);
    this.interestRate = interestRate;
}

@Override
public void calaculateInterest() {
    double interest = getBalance() * (interestRate / 100);
    System.out.println("Savings Interest Earned: $" + interest);
    setBalance(getBalance() + interest);
}
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void calaculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }   
}
public class BankMvp {
   public static void main(String[] args) {
        System.out.println("--- BITS College OOP MVP Execution ---");
        
        // Polymorphism (Upcasting): A parent array holding child objects
        BankAccount[] accounts = {
            new SavingsAccount("Abebe", 5000.0, 8.4f), 
            new CurrentAccount("Kebede", 2000.0)
        };

        for (BankAccount acc : accounts) {
            acc.displayInfo();
            
            // Dynamic Method Dispatch: Java decides at runtime which calculation to use
            acc.calaculateInterest(); 
            System.out.println("-------------------------");
        }
        
        System.out.println("System Execution Complete.");
    }
}