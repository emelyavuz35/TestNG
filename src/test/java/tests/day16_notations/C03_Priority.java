package tests.day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Priority extends TestBase {

    /*
    testNG test methodlarını isim sırasına gore calıstırır.eger isim sıralamasının dısında bır sıralama ıle
    calısmasını ıstersenız o zaman test methodlarına oncelık (priority )tanımlayabılırız

    Priority kucukten buyuge gore calısır
    eger bır test methoduna priority degerı atanmamıssa default olarak priority= 0 kabul edılır
     */
    @Test(priority =5)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test(groups = "grup1")
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
