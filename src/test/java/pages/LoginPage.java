package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public String ENDPOINT ="/auth/login";

    public By NAME_SELECTOR = By.id("name");
    public By PSW_SELECTOR = By.id("password");
    public By BUTTON_SELECTOR = By.id("button_primary");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage (){
        driver.get(BASE_URL+ENDPOINT);
    }

    public boolean isOpenedPage (){
        return driver.findElement(BUTTON_SELECTOR).isDisplayed();
    }

    private WebElement getName(){
        return driver.findElement(NAME_SELECTOR);

    }

    private WebElement getPassword(){
        return driver.findElement(PSW_SELECTOR);
    }

    private WebElement getButton(){
        return driver.findElement(BUTTON_SELECTOR);
    }

    public void setName( String username){
       getName().sendKeys(username);

    }

    public void setPsw( String psw){
        getPassword().sendKeys(psw);
    }

    public void setButton(){
        getButton().click();
    }
}
