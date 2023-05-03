package virtualproxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Init proxy image:");
        ProxyImage proxyImage = new ProxyImage("http://image.png/avatar.png");
        System.out.println("Call service 1st:");
        proxyImage.showImage();
        System.out.println("Call service 2nd:");
        proxyImage.showImage();
    }
}