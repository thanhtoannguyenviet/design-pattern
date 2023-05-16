public class ChessPizza extends PizzaDecorator{
    public ChessPizza(IPizza iPizza) {
        super(iPizza);
    }
    public void doPizaa(){
        iPizza.doPizza();
        addChess();
    }
    private void addChess(){
        System.out.print(" have chess");
    }


}
