import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

// class with page object pattern (logics in one class, realisation in another), just example
public class MainLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\37529\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        try {
            driver.get("file:///C:/Users/37529/Desktop/html-css-course/test2.html");
            Thread.sleep(5000);

            LogginPage lp = new LogginPage();
            lp.login("admin", "admin");

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
