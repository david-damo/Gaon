package steps.dfinitions.com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Sanjeev on 7/27/2018.
 */
public class ConfigFileReader {
    static ConfigFileReader instance=new ConfigFileReader();
    static Properties hostConfig=new Properties();
    static  {
        //InputStream in=Object.class.getResourceAsStream("C:\\Amy\\flashAuto\\ratesust\\config\\configuration.properties");
        InputStream in=instance.getClass().getClassLoader().getResourceAsStream("configuration.properties");
        try {
            hostConfig.load(in);
            System.out.println(hostConfig.getProperty("reportConfigPath"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getReportConfigPath(){
        InputStream in=instance.getClass().getClassLoader().getResourceAsStream("configuration.properties");
        try {
            hostConfig.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String reportConfigPath = hostConfig.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}
