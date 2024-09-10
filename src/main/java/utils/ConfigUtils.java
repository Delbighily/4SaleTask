package utils;

import java.util.Properties;

public class ConfigUtils {

    private Properties properties;
    private static ConfigUtils configUtils;
    public ConfigUtils(){
        properties =PropertiesUtils.loadProperties("src/main/java/config/TestData.properties");
    }

    public static ConfigUtils getInstance(){
        if(configUtils==null){
            configUtils=new ConfigUtils();
        }
        return configUtils;
    }

    public String getUserName(){
        return properties.getProperty("username");
    }
    public String getPassword(){
        return properties.getProperty("password");
    }
    public String getFname(){
        return properties.getProperty("firstName");
    }
    public String getLname(){return properties.getProperty("lastName");}
    public String getPostalCode(){return properties.getProperty("postalcode");}
}
