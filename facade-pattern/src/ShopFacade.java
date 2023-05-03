public class ShopFacade {
    private static final ShopFacade INSANCE = new ShopFacade();
    private PaymentService paymentService;
    private ShippingService shippingService;
    private ShopFacade(){
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }
    public static ShopFacade getInsance(){
        return INSANCE;
    }
    public void buyProductByCashWithFreeship(){
        paymentService.paymentByCash();
        shippingService.freeShipping();
    }

    public void buyProductByCreditCardWithStandardShipping(){
        paymentService.paymentByCreditCard();
        shippingService.standardShipping();
    }
    public void buyProductByCreditCardWithExpressShipping(){
        paymentService.paymentByCreditCard();
        shippingService.expressShipping();
    }
}
