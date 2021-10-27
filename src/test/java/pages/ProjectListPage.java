package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectListPage extends BasePage {

    private static String ENDPOINT = "/admin/projects/overview";

    private static By PROJECT_BY = By.linkText("Polina");
    private static By NEW_NAME = By.id("name");
    private static By BUTTON = By.id("accept");
    private static By DELETE = By.xpath("//a[text()=\"Polya\"]/ancestor::tr[@class=\"odd hoverSensitive\"]" +
            "/descendant::div[@class=\"icon-small-delete\"]");
    private static By CHECKBOX = By.xpath("//span[@class=\"dialog-confirm-busy\"]/../input[@type=\"checkbox\"]");
    private static By OK_CHECKBOX = By.xpath("//*[@class='icon-progress-inline']/following::a[1]");


    public ProjectListPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return driver.findElement(By.id("navigation-sub-overview")).isDisplayed();
        } catch (Exception exception) {
            return false;

        }
    }

    public WebElement getProject(){
        return driver.findElement(PROJECT_BY);
    }

    public WebElement getNewName(){
        return driver.findElement(NEW_NAME);
    }

    public WebElement getButtonSaveProject(){
        return driver.findElement(BUTTON);
    }

    public WebElement getButtonDelete(){
        return driver.findElement(DELETE);
    }

    public WebElement getCheckbox(){
        return driver.findElement(CHECKBOX);
    }

    public WebElement getOKCheckbox(){
        return driver.findElement(OK_CHECKBOX);
    }


}
