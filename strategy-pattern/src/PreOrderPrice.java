
public class PreOrderPrice implements PriceProduct{
    @Override
    public long price(long price) {
        return (long) (price*0.8);
    }

}
