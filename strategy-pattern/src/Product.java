public class Product {
    private String name;
    private long corePrice;
    private PriceProduct salePrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCorePrice() {
        return corePrice;
    }

    public void setCorePrice(long corePrice) {
        this.corePrice = corePrice;
    }

    public PriceProduct getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(PriceProduct salePrice) {
        this.salePrice = salePrice;
    }
    public void executeSalePrice(){
        //Execute  Strategy
        corePrice = salePrice.price(corePrice);
    }
    public void showItem(){
        System.out.println("Product: "+ name);
        System.out.println("Price:"+ corePrice);
    }
}
