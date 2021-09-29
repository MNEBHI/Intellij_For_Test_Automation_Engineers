package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class BrowserGetter {
    private WebDriver driver;

    public WebDriver getWinChromeDriver() {
        setProperty("webdriver.chrome.driver", "src/test/resources/browser");
        return null;
    }

    public WebDriver getChromeDriver() {
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public WebDriver getDriver() {
        return null;
    }
}
