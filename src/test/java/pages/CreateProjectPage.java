package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateProjectPage extends BasePage {

    private static String ENDPOINT = "/admin/projects/add";

    private static By NAME_BY = By.id("name");
    private static By  ADD_PROJECT= By.id("accept");

    public CreateProjectPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try{
            return driver.findElement(By.id("accept")).isDisplayed();
        }catch (Exception exception) {
            return false;
        }
    }

    public WebElement getNameProject(){
        return driver.findElement(NAME_BY);
    }

    public WebElement getButtonAddProject(){
        return driver.findElement(ADD_PROJECT);
    }
}
