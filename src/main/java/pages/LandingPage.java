package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigUtils;

public class LandingPage {
    private WebDriver driver;
    public LandingPage(WebDriver driver){this.driver=driver;}
    ConfigUtils configUtils=new ConfigUtils();


    //Element Locators
    private By UserNameField= By.id("user-name");
    private By PasswordField= By.id("password");
    private By LoginBtn= By.id("login-button");

    //Methods for interactions
    public void fillUserName(){driver.findElement(UserNameField).sendKeys(configUtils.getUserName());}
    public void fillpassword(){driver.findElement(PasswordField).sendKeys(configUtils.getPassword());}
    public HomePage clickLogin(){
        driver.findElement(LoginBtn).click();
        return new HomePage(driver); }
    }



