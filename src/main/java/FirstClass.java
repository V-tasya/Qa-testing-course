import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstClass {
    // Assert tests
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\37529\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        try {
            driver.get("file:///C:/Users/37529/Desktop/html-css-course/test2.html");
            Thread.sleep(5000);
            String title = driver.getTitle();
            Assert.assertEquals(title, "Document");

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            driver.quit();
        }
    }
    //the test finds title Document
}
