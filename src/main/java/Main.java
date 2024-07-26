import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\37529\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // implicit expectation
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://google.com");

        //to find element
        // WebElement input = driver.findElement(By.xpath("//textarea[@aria-label='Найти']"));
        //input.click();

       /* driver.get("https://www.avito.ru/");
        WebElement element = driver.findElement(By.xpath("//h2[@data-marker='bx-recommendations-block-title']"));
        String text = element.getText();
        System.out.println(text); */

       /* driver.get("https://dev.by/");
        WebElement element1 = driver.findElement(By.xpath("//a[text()='#Польша']"));
        String ccsValue = element1.getCssValue("display");
        /*css in different browsers are different so, that's why we need to do it for all browsers in project.
         we can cheek css by hands in styles, just cheeking the class and necessary elements
        System.out.println(ccsValue);
        element1.click(); // just clicking on element for next actions */

        // to cheek if the field for input works also we can use sendKeys when we want to give the files or pictures to the server
       /* driver.get("https://www.udemy.com/");
        WebElement element2 = driver.findElement(By.xpath("//input[@name='q']"));
        element2.sendKeys("Java", Keys.ENTER); // if we want to give the file to the server we can instead of Java write the full path in our computer to this file/picture
        // element.clear() clears everything what we entered */

        /*Actions action = new Actions();
        /* action.contextClick();  click with the right muse button
        action.clickAndHold(); just click and hold .doubleHold
       action
               .moveToElement()
               .keyDown() // pinch the button
               .keyUp() // opposite to pinch
               .release() // let the button
               .build() // build what we did before
               .pause() // waiting
               .perform();// to perform what we build */

        /*try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000); // after launching the site we need to wait before all element launch
            WebElement element3 = driver.findElement(By.id("draggable"));
            WebElement element4 = driver.findElement(By.id("droppable"));
            Actions action = new Actions(driver);
            action.moveToElement(element3).clickAndHold().moveToElement(element4).release().build().perform(); // or action.dragAndDrop(elem1, elem2)
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            Thread.sleep(20000);
            driver.quit(); // closing the driver
        } */

        // waiting for the element to disappear
       /* driver.get("https://pagination.js.org/");
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
        List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));
        String text = elements.get(5).getText();
        System.out.println(text);
        pages.get(2).click();
        wait.until(ExpectedConditions.stalenessOf(elements.get(5))); //stalenessOf() for which element we are waiting to disappear
        elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li")); // reload
        text = elements.get(5).getText();
        System.out.println(text);
        // we have the different answers because we change the page and on the next page numbers are started from 11

        // there are a lot of methods to wait for something (attribute, elementToBe.., invisibility/visibility, mot, numberOf, presentsOf, stalenessOf, textToBe, title, url
        */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        /*try {
            driver.get("file:///C:/Users/37529/Desktop/html-css-course/test2.html");
            Thread.sleep(5000);

            WebElement element = driver.findElement(By.id("a"));
            WebElement element1 = driver.findElement(By.id("b"));
            WebElement element2 = driver.findElement(By.id("c"));

            element.click();
            //model window alert
            Alert alert = wait.until(alertIsPresent());
            alert.accept();

            element1.click();
            // model window prompt for input
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Super!");
            prompt.accept();

            Alert alert1 = wait.until(alertIsPresent());
            Thread.sleep(4000);
            alert1.accept();

            element2.click();
            Alert alert2 = wait.until(alertIsPresent());
            alert2.dismiss();

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            driver.quit();
        }

        //Selenium can work only with windows not with tabs
         */

        // we are switches between windows i
       /* JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("file:///C:/Users/37529/Desktop/html-css-course/test2.html");
            Thread.sleep(5000);

            String window1 = driver.getWindowHandle(); // descriptor of window now as string in the window1

            js.executeScript("window.open()"); //with js we open new window, because selenium can't

            Set<String> currentWindows = driver.getWindowHandles(); // now there are two open windows, we get set of strings

            String window2 = null;

            for(String window: currentWindows) {
                if(!window.equals(window1)) {
                    window2 = window; //now in window2 is description of window
                    break;
                }
            }
            driver.switchTo().window(window2); // we need to switch into a new window to work with it
            Thread.sleep(5000);
            driver.get("file:///C:/Users/37529/Desktop/html-css-course/test2.html");
            driver.close();
            driver.switchTo().window(window1); // switches to open window

        } catch(InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            driver.quit();
        }
    */

        // on pages can pe inputs which we can't to see, to work with them we need to find by path (//input) input type="file" and change styles (switch
        // display from none to block, opacity to 1, height and width raise)
        // only now we can work with this input with senKeys
       /* JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            driver.get("file:///C:/Users/37529/Desktop/html-css-course/test2.html");
            Thread.sleep(5000);
            WebElement element = driver.findElement(By.id("a"));
            js.executeScript("querySelector('#a').setAttribute('style', 'opacity:1')");

        }catch(InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            driver.quit();
        }
        */

    }

}