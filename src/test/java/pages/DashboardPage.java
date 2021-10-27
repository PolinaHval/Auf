package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private static String ENDPOINT = "/dashboard";

    private static By ButtonCreateProject = By.id("sidebar-projects-add");


    public DashboardPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try{
            return driver.findElement(By.id("sidebar-projects-add")).isDisplayed();
        }catch (Exception exception) {
            return false;
        }
    }

    public WebElement getButtonCreateProject(){
        return driver.findElement(ButtonCreateProject);
    }
}
