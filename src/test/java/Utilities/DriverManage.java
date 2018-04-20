package Utilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManage {
    protected  static WebDriver driver;

    @BeforeClass
    public static void Setup(){
        System.out.println("Inside the Setup");
        System.setProperty("webdriver.gecko.driver", "E:\\GitRepos\\FoodMeAppTest\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void Cleanup(){
        System.out.println("Inside CleanUp");
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void TearDown(){
        System.out.println("Inside TearDown");
        driver.close();
    }
}
