public class EmailLogger extends Logger{
    public EmailLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    void writeMsg(String msg) {
        System.out.println("Email logger: "+msg);
    }
}
