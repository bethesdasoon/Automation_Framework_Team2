import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by JK on 4/12/2015.
 */

public class AmazonHome extends Base  {
    String search="computer";
    @Test
    public void homePageOfAmazon() throws InterruptedException {
        //Type in an item in search box
       typeAndEnterByCss("#twotabsearchtextbox",search);
        System.out.println("Search item ="+search);
        sleepFor(3);
        // Assgin search item text to serchResult variable.
        String searchResult =(String)driver.findElement(By.cssSelector("#bcKwText > span")).getAttribute("innerHTML");


        //searchResult=searchResult.substring(1,searchResult.length()-1);

       // System.out.println("search result item ="+searchResult);

        searchResult=searchResult.replace("\"","");

        sleepFor(5);

        // Validate search result
        if (search.equals(searchResult)){
        System.out.println("Search Result validated "+searchResult);
        }
        else{
            System.out.println("Search Result not validated "+searchResult);
        }
        sleepFor(5);
/*
        //Mouse Hover on my account and hover sign in link and click
       mouseHoverAndClick("#nav-tools #nav-link-yourAccount","#nav-flyout-ya-signin > a > span");
    //clickByCss("#nav-tools #nav-link-yourAccount ");

    sleepFor(2);
        // Type in email address in username
        typeByCss("#ap_email","bethesdasoon@yahoo.com");

        //Type in password
        typeByCss("#ap_password","******");

        // Click on sign In button.
        driver.findElement(By.id("signInSubmit-input")).click();
*/
}
}
