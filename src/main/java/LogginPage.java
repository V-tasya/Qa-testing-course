import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// class with page object pattern (logics in one class, realisation in another), just example
public class LogginPage {

    WebDriver driver = new ChromeDriver();

    WebElement login = driver.findElement(By.id("login"));
    WebElement password = driver.findElement(By.id("pass"));
    WebElement enter = driver.findElement(By.id("enter"));


    public void login(String loggin, String pass) {
        login.sendKeys(loggin);
        password.sendKeys(pass);
        enter.click();
    }

}
