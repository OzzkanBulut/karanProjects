public class AccountManager {
    private Account account;

    public AccountManager(Account account){
        this.account = account;
    }

    public void withDrawMoney(Account account){
        account.withdrawMoney();
    }

    public void depositMoney(Account account){
        account.depositMoney();
    }

    public void showBalance(Account account){
        account.showBalance();
    }


}
