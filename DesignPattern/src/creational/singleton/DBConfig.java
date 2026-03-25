package creational.singleton;

public class DBConfig {

    private static volatile DBConfig instance;
    private String dbName;

    private DBConfig(){
        reloadConfig();
    }

    public static DBConfig getInstance(){
        if(instance == null){
            synchronized(DBConfig.class){
                if(instance == null){
                    instance = new DBConfig();
                }
            }
        }
        return instance;
    }

    public void reloadConfig(){
        dbName = "mysql";
    }


    public String getUrl(){
        dbName = "mysql";
        return dbName;
    }
}
