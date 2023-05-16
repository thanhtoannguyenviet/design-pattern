public abstract class Logger {
    LogLevel logLevel;
    Logger nextlogger;
    public Logger(LogLevel logLevel){
        this.logLevel = logLevel;
    }
    public Logger setNext(Logger nextlogger){
        this.nextlogger = nextlogger;
        return nextlogger;
    }
    public void log(LogLevel severity, String msg){
        if(logLevel.getLevel()<=severity.getLevel()){
            writeMsg(msg);
        }
        if(nextlogger != null){
            nextlogger.log(severity,msg);
        }
    }
    abstract void writeMsg(String msg);
}
