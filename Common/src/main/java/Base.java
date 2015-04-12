import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

/**
 * Created by JK on 4/11/2015.
 */
public class Base {
    public WebDriver driver = null;
    @Parameters ({"url","url1"})     // We can have mutiple parameters.

    @BeforeMethod
    public void setUp(String url, String url1 ) {
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
   // public void cleanup() throws InterruptedException{
      //      driver.quit();
      //  }

    public void typeByCss(String locator,String value ){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }
    public void typeByXpath(String locator,String value ){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }
    public void clickByCss(String locator ){
        driver.findElement(By.cssSelector(locator)).click();
        }
    public void clickByXpath(String locator){
        driver.findElement(By.cssSelector(locator)).click();
        }
    public void typeAndEnterByXpath(String locator,String value ){
         driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
         }
    public void typeAndEnterByCss(String locator,String value ) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void getTextByCss(String locator){
     return;
    }
    public void sleepFor(int second) throws  InterruptedException{
        Thread.sleep(second * 1000);
    }
    public void mouseHover(String locator){

    }
   }




