public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    static int numOfAccounts = 0;

    BankAccount(String accountNumber, double checkingBalance, double savingsBalance) {
        this.accountNumber = accountNumber;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        createAccount();
        checkBalance();
        checkSavings();
    }

    public static int createAccount() {
        double account = Math.random()*10000;
        numOfAccounts++;
        return numOfAccounts;
    }

    public void checkBalance(){
        System.out.println(checkingBalance);
    }

    public void checkSavings(){
        System.out.println(savingsBalance);
    }

    public void deposit(double amount){
        checkingBalance += amount;
    }
    public void withdraw(double amount){
        checkingBalance -= amount;
        if(checkingBalance<amount){
            System.out.println("insufficient funds");
        }
    }

    public void totalBalance(){
        double total = checkingBalance + savingsBalance;
        System.out.println(total);
    }
        
}