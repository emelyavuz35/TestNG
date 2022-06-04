package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.List;

public class C07_SoftAssert extends TestBase {
    @Test
    public void test01() {

            // 1. “http://zero.webappsecurity.com/” Adresine gidin
             driver.get("http://zero.webappsecurity.com/");
            // 2. Sign in butonuna basin
            driver.findElement(By.id("signin_button")).click();
            // 3. Login kutusuna “username” yazin
        WebElement logınKutusu= driver.findElement(By.id("//input[@name='user_login']"));
        logınKutusu.sendKeys("username");

            // 4. Password kutusuna “password” yazin
        WebElement passwordKutusu= driver.findElement(By.id("//input[@name='user_password']"));
        passwordKutusu.sendKeys("password");

            // 5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@name='submit']")).click();

            // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']"));
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
            // 7. “Purchase Foreign Currency” tusuna basin
driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();
            // 8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm=driver.findElement(By.xpath("//select[@name='currency]"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Eurozone ()euro");

            // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        String secılenOptıon=select.getFirstSelectedOption().getText();
        String expectedOptıon="Eurozone ()Euro";
        softAssert.assertEquals(secılenOptıon,expectedOptıon,"secılen optıon uygun degıl");

            // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
           List<WebElement> optıonList=select.getOptions();



        }
}
