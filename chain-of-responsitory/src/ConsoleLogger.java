public class ConsoleLogger extends Logger{
    public ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    void writeMsg(String msg) {
        System.out.println("Console logger: "+ msg);
    }
}
