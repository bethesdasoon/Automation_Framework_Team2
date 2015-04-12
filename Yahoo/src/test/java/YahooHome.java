import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by JK on 4/11/2015.
 */
public class YahooHome extends Base {
    @Test
    public void homepage() throws Exception{
        driver.findElement(By.cssSelector("#default-p_30345789-bd > ul.navlist > li:nth-child(1)  > a > span")).click();
       // driver.findElement(By.xpath("//*[@id='default-p_30345789-bd']/ul[1]/li[1]/a/span")).click();
        System.out.println(driver.getCurrentUrl());

    }
}
