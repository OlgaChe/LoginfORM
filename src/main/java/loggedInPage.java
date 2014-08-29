import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loggedInPage {

    private WebDriver driver;

    public loggedInPage(WebDriver driver) {
        this.driver = driver;
    }

    public profilePage openProfile() {
       // driver.findElement(By.className("gb_d gb_e gb_f gb_sc")).click();
       driver.findElement(By.cssSelector("div [class=\"gb_9\"] a:nth-child(1)")).click();

        return new profilePage(driver);
    }

}
