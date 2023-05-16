public class TPBank extends Bank{
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void openAccount() {
        System.out.println("Welcome to TPBANK");
        account.openAccount();
    }
}
