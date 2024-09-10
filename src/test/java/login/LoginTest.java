package login;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.annotations.Test;


@Feature("Login feature")
public class LoginTest extends BaseTest {
    @Description("In the this test the user will try to log in using valid user name and valid password")

    @Test (description = "Test login with credentials provided by the website")
    public void testSuccessfullLogin(){
        landingPage.fillUserName();
        landingPage.fillpassword();
        landingPage.clickLogin();
    }
}
