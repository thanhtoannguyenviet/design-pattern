public class Main {
    public static void main(String[] args) {
        DocumentInvoker instance = new DocumentInvoker();
        instance.write("Hello world");
        instance.read();

        instance.undo();
        instance.read();
        instance.redo();
        instance.read();
    }
}