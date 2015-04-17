import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by JK on 4/14/2015.
 */
public class CharacterArcadeHome extends Base {

    @Test

    public void homePage () throws Exception {
        String email="test@test001.com";
        String passWrd="test@test001.com";



        sleepFor(3);
        //Switch to iframe1
        clickByCss("#user_group.module div div.user_logged_out div.user_info div.user_buttons a.login_btn");
        WebElement element1=driver.findElement(By.cssSelector("#surf-xdm iframe"));
        driver.switchTo().frame(element1);

        //Switch to iframe2
        WebElement element2=driver.findElement(By.cssSelector("#display-frame"));
        driver.switchTo().frame(element2);

        typeByCss("#input_username.full",email);
        typeByCss("#input_password.full", passWrd);
        clickByCss("#button_submit.button");

        driver.switchTo().defaultContent();
        sleepFor(3);
        if ((driver.findElement(By.cssSelector("#user_group.module div.user_inner div.user_logged_in div.user_info ul.user_ident li a.logout_btn.logout_link"))).isDisplayed()) {
            System.out.println("Sign in validated.");
        }
        else {
            System.out.println("Sign in not validated.");
        }

        clickByCss("#user_group.module div.user_inner div.user_logged_in div.user_info ul.user_ident li a.logout_btn.logout_link");
        sleepFor(3);
        clickByCss("#logout-dialog.dialog_container.simplemodal-data div.dialog_footer div.button_container div.dialog_button.submit.simplemodal-close");

        sleepFor(3);
        if ((driver.findElement(By.cssSelector("#user_group.module div div.user_logged_out div.user_info div.user_buttons a.login_btn"))).isDisplayed()) {
            System.out.println("Sign out validated.");
        }
        else {
            System.out.println("Sign out not validated.");
        }
    }
}
