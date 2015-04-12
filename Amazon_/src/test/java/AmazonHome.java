import org.testng.annotations.Test;

/**
 * Created by JK on 4/12/2015.
 */
public class AmazonHome extends Base  {
    @Test
    public void homePageOfAmazon() throws InterruptedException {

    //clickByCss("#nav-link-yourAccount");
        clickByCss("#nav-tools #nav-link-yourAccount > span");
    sleepFor(2);

}
}
