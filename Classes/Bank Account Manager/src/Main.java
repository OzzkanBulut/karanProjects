public class Main {
    public static void main(String[] args) {

        Account business = new BusinessAccount(1, 300);
        Account savings = new SavingsAccount(2,222);
        AccountManager businessManager = new AccountManager(business);
        AccountManager savingsManager = new AccountManager(savings);
        businessManager.depositMoney(business);
        savingsManager.showBalance(savings);


    }
}