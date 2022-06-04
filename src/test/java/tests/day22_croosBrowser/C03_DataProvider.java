package tests.day22_croosBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {


    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();
        //amazon anasayfaya gıdelım
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella icin arama yapalım
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //sonucların nutella ıcerdıgını test edelım
        String expectedKelime="Nutella";
        String actualSonucYazısı=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazısı.contains(expectedKelime));
        Driver.closeDriver();
    }


    @DataProvider
    public static Object[][] AranacakKelimeler() {
       Object[][] arananKelimeArrayi={{"Nutella"}, {"Java"}, {"Cigdem"}, {"Netherlands"}};
        return arananKelimeArrayi;
    }


    @Test(dataProvider = "AranacakKelimeler")

    //arayaagımız kelımlerı bır lıste gıbı tutup bana yollayacak bır verı saglayıcısı olusturacagız
    public void dataProviderTesti(String arananKelime) {
        AmazonPage amazonPage=new AmazonPage();
        //amazon anasayfaya gıdelım
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //nutella,java,cigdem,netherlands icin arama yapalım
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);
        //sonucların aradıgımız kelıme ıcerdıgını test edelim
        String expectedKelime=arananKelime;
        String actualSonucYazısı=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazısı.contains(expectedKelime));
        //sayfayı kapatalım
        Driver.closeDriver();
    }
}
