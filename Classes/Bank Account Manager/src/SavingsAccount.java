import java.util.Scanner;

public class SavingsAccount extends Account{

    private int id;
    private int balance;

    public SavingsAccount(int id, int balance){
        this.id = id ;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void showBalance() {
        System.out.println("Savings Account Balance : "+balance);

    }

    @Override
    public void withdrawMoney() {
        System.out.println("Enter the amount of withdraw : ");
        int withdraw = scan.nextInt();
        balance = balance-withdraw;
        System.out.println("New Balance : " + balance);
    }


    @Override
    public void depositMoney() {
        System.out.println("Enter the amount of deposit : ");
        int deposit = scan.nextInt();
        balance = balance+deposit;
        System.out.println("New Balance : " + balance);

    }
}
