package experiment_4;

class Bank {
    private double balance;

    public Bank(double initialBalance){
        this.balance=initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposited: $"+amount);
        }else{
            System.out.println("invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0&&amount<=balance){
            System.out.println("Withdrawn: $"+amount);
            balance=balance-amount;

        }else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    void checkBalance(){
        System.out.println("Current Balance: $"+balance);
    }

    
}
public class bankdemo{
    public static void main(String[] args) {
        Bank Newaccount=new Bank(5000);
        Newaccount.deposit(1500);
        Newaccount.checkBalance();
        Newaccount.withdraw(1200);
        Newaccount.checkBalance();
    }
}
