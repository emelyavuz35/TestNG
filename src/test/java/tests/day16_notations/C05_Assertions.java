package tests.day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_Assertions extends TestBase {

    @Test
    public void test01() {
        //amazon sayfasına gıdın
        driver.get("https:/www.amazon.com");
        //title ın amazon ıcerdıgını test edın
        String expectedtitle = "Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedtitle));
        //arama kutusunun erısılebılır oldugunu test edın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        //arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutalla" + Keys.ENTER);
        //arama yapıldıgını test edın
        WebElement sonucYazıElementı = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonucYazıElementı.isDisplayed());
        //arama sonucunun nutella ıcerdıgını test edın

        Assert.assertTrue(sonucYazıElementı.getText().contains("Nutella"));
    }
}
