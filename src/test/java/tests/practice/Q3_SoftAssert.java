package tests.practice;

import org.testng.annotations.Test;
import utilities.TestBase;

public class Q3_SoftAssert extends TestBase {
    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the user name  as standard_user
     * Enter the password as   secret_sauce
     * Click on login button
     *     T1 : Choose price low to high with soft Assert
     *     T2 : Verify item prices are sorted from low to high with hard Assert
     */

    @Test
    public void souceDemoSoft() {
        driver.get(" https://www.saucedemo.com/");


    }
}
