package creational.singleton;

public class Logger {

    private static volatile Logger logger;

    private Logger() {}

    public static Logger getlogger(){
        if(logger == null){
            synchronized (Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void error(String msg){
        System.out.println(msg);
    }
    public void warn(String msg){
        System.out.println(msg);
    }


}
