package tests.day17_YeniDriverİlkClass;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_PageClassKullanımı {
    @Test
    public void test01() {
        FacebookPage facebookPage=new FacebookPage();

        //facebook anasayfaya gıdın
        Driver.getDriver().get("https://www.facebook.com");
        //cıkarsa cookies kabul edın

        //kullanıcı mail kutusuna rastgele nbır ısım yazdırın
        Faker faker=new Faker();
        facebookPage.mailKutusu.sendKeys(faker.internet().emailAddress());
        //kullanıcı sıfre kutusuna rastgele bır password yazdırın
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());
        //logın butonuna basun
        facebookPage.loginTusu.click();
        //gırıs yapılamadıgını test edın
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
