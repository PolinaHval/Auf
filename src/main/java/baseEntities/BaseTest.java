package baseEntities;

import browserService.BrowserService;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private static String BROWSER_TYPE = "chrome";
    public WebDriver driver;

    public BaseTest() {
    }


    @BeforeClass
    public void setUp(){
        this.driver = new BrowserService(BROWSER_TYPE).getDriver();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
