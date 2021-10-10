package baseEntities;

import browserService.ReadProperties;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;
    public ReadProperties readProperties;
    public String BASE_URL;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.readProperties = new ReadProperties();
        this.BASE_URL = readProperties.getURL();
    }

    public void openPage (){
    }

    public boolean isOpenedPage (){
        return true;
    }
}
