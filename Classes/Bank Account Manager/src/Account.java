import java.util.Scanner;

public abstract class Account {
    Scanner scan = new Scanner(System.in);
    public abstract void showBalance();
    public abstract void withdrawMoney();
    public abstract void depositMoney();


}
