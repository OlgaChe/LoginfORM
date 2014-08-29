import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class testPage {
    private WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://accounts.google.com/ServiceLogin?hl=en&continue=https://www.google.com.ua/");
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }


    @Test
    public void testProfileUserName() {
        startPage home = new startPage(driver);
        loggedInPage loggedin = home.login("olgache73", "Wywh1975");
        profilePage profile = loggedin.openProfile();
        assertTrue(profile.getUserName().equals("olgache73@gmail.com"));

    }


}