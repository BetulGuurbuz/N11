package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Properties;

public class DriverFactory {


    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver(String browser){

        properties = ConfigReader.getProperties();
        if (browser.equals("Chrome")) {
           driver = new ChromeDriver();

        } else if (browser.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new EdgeDriver();
        }
        String url = properties.getProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
        return getDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }


}
