public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Default item");
        product.setCorePrice(1000);
        // Default
        product.setSalePrice(new DefaultPrice());
        product.executeSalePrice();
        product.showItem();
        // PreOrderPrice
        System.out.println("Pre Order Price: ");
        product.setSalePrice(new PreOrderPrice());
        product.executeSalePrice();
        product.showItem();
    }
}