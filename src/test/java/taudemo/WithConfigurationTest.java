package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithConfigurationTest {

    private final BrowserGetter browserGetter=new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    static void beforeAll() {
        driver=browserGetter.getDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void justATest() {
        driver.get("https://www.example.com");
        assertEquals(driver.getTitle(),"Example domain");
    }
}
