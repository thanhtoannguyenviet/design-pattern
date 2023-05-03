public class Main {
    public static void main(String[] args) {
        ShopFacade.getInsance().buyProductByCashWithFreeship();
        System.out.println("/****\\");
        ShopFacade.getInsance().buyProductByCreditCardWithStandardShipping();
        System.out.println("/****\\");
        ShopFacade.getInsance().buyProductByCreditCardWithExpressShipping();
    }
}