public class Main {
    public static void main(String[] args) {
        Logger logger = AppLogger.getLogger();
        logger.log(LogLevel.DEBUG,"Debug message");
        logger.log(LogLevel.FATAL,"Fatal message");
    }
}