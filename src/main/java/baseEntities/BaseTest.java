package baseEntities;

import browserService.BrowserService;
import browserService.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public WebDriver driver;

    public BaseTest() {
    }


    @BeforeClass
    public void setUp(){
        this.driver = new BrowserService().getDriver();
        driver.get(new ReadProperties().getURL());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
