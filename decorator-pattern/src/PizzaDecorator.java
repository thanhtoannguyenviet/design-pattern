public class PizzaDecorator {
    protected IPizza iPizza;

    public IPizza getiPizza() {
        return iPizza;
    }

    public void setiPizza(IPizza iPizza) {
        this.iPizza = iPizza;
    }

    public PizzaDecorator(IPizza iPizza){
        this.iPizza = iPizza;
    }
}
