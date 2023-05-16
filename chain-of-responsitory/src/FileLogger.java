public class FileLogger extends Logger{
    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    void writeMsg(String msg) {
        System.out.println("File logger: "+msg);
    }
}
