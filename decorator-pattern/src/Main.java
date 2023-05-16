public class Main {
    public static void main(String[] args) {
        IPizza defaultPizza = new DefaultPizza();
        defaultPizza.doPizza();
        ChessPizza chessPizza = new ChessPizza(defaultPizza);
        chessPizza.doPizaa();
    }
}