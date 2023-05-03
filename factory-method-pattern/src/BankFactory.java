public class BankFactory {
    public enum BankType{
        VIETCOMBANK, TECHCOMBANK
    }
    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TECHCOMBANK -> {
                return new TechcomBank();
            }
            case VIETCOMBANK -> {
                return new VietcomBank();
            }
            default -> throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
