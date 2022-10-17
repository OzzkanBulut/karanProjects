public class CheckingAccount extends Account {

    private int id;
    private int balance;

    public CheckingAccount(int id, int balance){
        this.id = id ;
        this.balance = balance;
    }

    @Override
    public void showBalance() {
        System.out.println("Checking Account Balance : "+balance);


    }

    @Override
    public void withdrawMoney() {
        System.out.println("Enter the amount of withdraw : ");
        int withdraw = scan.nextInt();
        balance  = balance-withdraw;
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
