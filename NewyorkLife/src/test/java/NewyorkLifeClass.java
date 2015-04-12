import org.openqa.selenium.By;
import org.testng.annotations.Test;
/**
 * Created by JK on 4/11/2015.
 */
public class NewyorkLifeClass extends Base {

    @Test

    public void homePage()throws Exception {

        driver.findElement(By.cssSelector("#navigation > ul > li:nth-child(2) > a")).click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        //Thread.sleep(500);
        System.out.println(driver.getCurrentUrl());


    }

}
