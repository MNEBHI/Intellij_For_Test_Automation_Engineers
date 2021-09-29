package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SeleniumTest {

    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle() {
        String expectedComTitle = "Example title";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
        Assertions.assertEquals(1, 2);
    }

    @Test
    public void openTheOrgPageAndCheckTheTitle() {
        String expectedTitle = "Example title";
        driver.get("https://www.example.org");
        assertEquals(expectedTitle, driver.getTitle());
        Assertions.assertEquals(1, 2);
    }


}
