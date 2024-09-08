package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;

    //Element Locators
    private By FilterDropDown= By.className("product_sort_container");

    public HomePage(WebDriver driver) {this.driver=driver;}


    //Methods for interactions
    public void sortLowToHigh(){
    Select objSelect =new Select(driver.findElement(By.className("product_sort_container")));
    objSelect.selectByVisibleText("Price (low to high)");
}}
