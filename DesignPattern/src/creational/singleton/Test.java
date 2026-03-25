package creational.singleton;

public class Test {

    public static void main(String [] args){
        Logger log = Logger.getlogger();
        DBConfig  config = DBConfig.getInstance();
        log.warn("this is warning for you");

        log.error( config.getUrl());

    }
}
