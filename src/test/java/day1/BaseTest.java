package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    protected WebDriver driver;
    String browser = "chrome";

    @BeforeClass
    public void setup() {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }


        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
