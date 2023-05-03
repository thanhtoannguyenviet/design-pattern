package virtualproxy;

public class RealImage implements Image{
    private String url;
    public RealImage(String url){
        this.url = url;
        System.out.println("virtualproxy.Image loaded: "+ this.url);
    }
    @Override
    public void showImage() {
        System.out.println("virtualproxy.Image showed: " + this.url);
    }
}
