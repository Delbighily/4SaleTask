package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.CompleteCheckoutPage;
import pages.HomePage;
import pages.LandingPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected LandingPage landingPage;


    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        landingPage =new LandingPage(driver);
}
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
