package tests.day17_YeniDriverİlkClass;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PagesClassKullanımı {
    @Test
    public void test01() {

        AmazonPage amazonPage=new AmazonPage();
        //amazona gıdelım
        Driver.getDriver().get("https://www.amazon.com");
        //nutella aratalım
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        //sonuc yazısnın nutella ıcerdıgını test edelım
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";
        Assert.assertTrue(actualSonuc.contains(arananKelime));

    }
}
