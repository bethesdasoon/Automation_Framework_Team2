import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by JK on 4/11/2015.
 */
public class Base {
    public WebDriver driver = null;

    @Parameters({"url", "url1"})     // We can have mutiple parameters.

    @BeforeMethod
    public void setUp(String url, String url1) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
       /*
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url1);     // you can open multiple browser.
*/

    @AfterMethod
    public void cleanup() throws InterruptedException {
        //      driver.quit();
    }
    public void typeByCss (String locator, String value){

            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void clickByCss(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXpath(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void typeAndEnterByXpath(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void typeAndEnterByCss(String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }

    public void getTextByCss(String locator) {
        return;
    }

    public void sleepFor(int second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

    public void mouseHover(String locator) {
        WebElement element= driver.findElement(By.cssSelector(locator));
        Actions action=new Actions(driver);
        action.moveToElement(element).perform();
    }
    public void mouseHoverAndClick(String locator1,String locator2) {
        WebElement element1 = driver.findElement(By.cssSelector(locator1));
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
        WebElement element2 = driver.findElement(By.cssSelector(locator2));
        actions.moveToElement(element2).build().perform();
        actions.click();
        actions.perform();

    }
public void mouseHoverAndClickXpath(String locator1,String locator2) throws InterruptedException {
    WebElement element1 = driver.findElement(By.cssSelector(locator1));
    Actions actions = new Actions(driver);
    actions.moveToElement(element1).perform();
    Thread.sleep(3000);

    WebElement element2 = driver.findElement(By.xpath(locator2));
    actions.moveToElement(element2);
    Thread.sleep(5000);
    actions.click();
    actions.perform();

    //driver.findElement(By.xpath(locator2)).click();
}



    public void dropDownSelect (String locator, String select) {
        WebElement ddl = driver.findElement(By.cssSelector(locator));
        Select clickthis = new Select(ddl);
        clickthis.selectByVisibleText(select);
    }
}




