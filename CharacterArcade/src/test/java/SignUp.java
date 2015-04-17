import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by JK on 4/15/2015.
 */
public class SignUp extends Base {
    @Test

    public void homePage() throws Exception {
        String userId = "testuser1";
        String email = "test@test001.com";
        String passWrd = "test@test001.com";
        String month = "May";
        String day = "30";
        String year = "1980";
        String city = "City of Test";
        String state = "Maryland";
        String country = "United States";
        String zipCode = "20904";


        sleepFor(3);
        //Switch to iframe1
        clickByCss("#user_group.module div.user_inner div.user_logged_out div.user_info div.user_buttons a.register_btn cufon canvas");
        WebElement element1 = driver.findElement(By.cssSelector("#surf-xdm iframe"));
        driver.switchTo().frame(element1);

        //Switch to iframe2
        WebElement element2 = driver.findElement(By.cssSelector("#display-frame"));
        driver.switchTo().frame(element2);


        typeByCss("#field_username div input", userId);
        typeByCss("#field_email div input", email);
        typeByCss("#field_password div input", passWrd);
        clickByCss("#show_password");
        dropDownSelect("#month select", month);
        dropDownSelect("#day select", day);
        dropDownSelect("#year select", year);
        typeByCss("#field_city div.input_container input", city);
        dropDownSelect("#field_state div select", state);
        dropDownSelect("#field_country div select", country);
        typeByCss("#field_postalcode div input", zipCode);
        clickByCss("#button_submit.button");
        driver.switchTo().defaultContent();
        if ((driver.findElement(By.cssSelector("#user_group.module div.user_inner div.user_logged_in div.user_info ul.user_ident li a.logout_btn.logout_link"))).isDisplayed()) {
            System.out.println("Sign up validated.");
        }
            else {
            System.out.println("Sign up not validated.");

            }


    }
}
