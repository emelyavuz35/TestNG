package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SouceDemo {
    public  SouceDemo(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
