public class Main {
    public static void main(String[] args) {
        //Checking
        Bank checkingBank = new TPBank(new CheckingAccount());
        checkingBank.openAccount();

        //Saving
        Bank savingBank = new TPBank(new SavingAccount());
        savingBank.openAccount();
    }
}