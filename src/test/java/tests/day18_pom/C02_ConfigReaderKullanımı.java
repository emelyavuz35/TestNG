package tests.day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanımı {

    @Test
    public void test01() {

        FacebookPage facebookPage=new FacebookPage();
        //facebook anasayfaya gıdın
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        //cıkarsa cookies kabul edın
       // facebookPage.cookieButonu.click;

        //kullanıcı mail kutusuna yanlıs bır ısım yazdırın
        facebookPage.mailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUsername"));

        //kullanıcı sıfre kutusuna yanlıs bır password yazdırın
        facebookPage.sifreKutusu.sendKeys(ConfigReader.getProperty("fbWrongPassword"));

        //logın butonuna basun
        facebookPage.loginTusu.click();

        //gırıs yapılamadıgını test edın
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
//sayfayı kapatın
        Driver.closeDriver();
    }
}
