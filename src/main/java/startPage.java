import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class startPage {

    private WebDriver driver;

    public startPage(WebDriver driver) {
        this.driver = driver;
    }

    public loggedInPage login(String login, String password) {

        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys();
        driver.findElement(By.id("Passwd")).clear();
        driver.findElement(By.id("Passwd")).sendKeys();
        driver.findElement(By.id("signIn")).click();

        return new loggedInPage(driver);
    }


}