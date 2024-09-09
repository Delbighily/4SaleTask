package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.HomePage;
import pages.LandingPage;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    protected LandingPage landingPage;
    protected HomePage homePage;
    protected CartPage cartPage;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        landingPage =new LandingPage(driver);
        homePage=new HomePage(driver);
        cartPage=new CartPage(driver);
}
    @AfterMethod
    public void tearDown(){
        //driver.quit();
    }
}
