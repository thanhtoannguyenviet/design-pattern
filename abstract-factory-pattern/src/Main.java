public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = new ModernFactory();
        Chair chair =factory.createChair();
        chair.create();
    }
}