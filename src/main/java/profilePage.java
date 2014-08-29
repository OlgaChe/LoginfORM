import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class profilePage {

    private WebDriver driver;

    public profilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {

        return driver.findElement(By.className("Ld")).getText();
    }
}