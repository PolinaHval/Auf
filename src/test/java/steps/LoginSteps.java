package steps;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver) {
        this.driver= driver;
    }

    public void login (String username, String psw){
        LoginPage loginPage = new LoginPage(driver, true);
        loginPage.getLogin().sendKeys(username);
        loginPage.getPassword().sendKeys(psw);
        loginPage.getButton().click();
    }
}
