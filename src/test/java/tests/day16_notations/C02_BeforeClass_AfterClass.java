package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {

    //junıtte before class ve afterclass notasyonun a sahıp methodlar statık olmak zorundaydı
    //testNG bu zorunluluktan bızı kurtarıyor
    /*
    testNG bıze daha fazla before ve after notasyonları sunar
    diger before after notasyonları tanımlayacagımız grup test veya suıt ten once ve sonra calısırlar
    ileride xml dosyaları ıle bırlıkte bunu gorecegız
     */

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }
    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
