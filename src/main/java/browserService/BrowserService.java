package browserService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BrowserService {

    private WebDriver driver =null;

    public BrowserService() {
        String browserName = new ReadProperties().getBrowserName();

        switch(browserName.toLowerCase()){
            case "chrome":

                ClassLoader classLoader = getClass().getClassLoader();
                File file = new File(classLoader.getResource("drivers/chromedriver.exe").getFile());
                String absolutePath = file.getAbsolutePath();

                System.setProperty("webdriver.chrome.driver",absolutePath);


                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.setHeadless(new ReadProperties().isHeadless());

                driver = new ChromeDriver(chromeOptions);

                break;
            case "firefox":
                break;
            case "ie":
                break;
            case "edge":
                break;
            default:
                System.out.println("Browser is not supported");
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
