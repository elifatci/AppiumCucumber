package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class ArabamPage {


    public ArabamPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }

    @FindBy(id = "com.dogan.arabam:id/tvShowroomInfo")
    public WebElement alirkenSatarkenText;

    @FindBy(id = "com.dogan.arabam:id/texViewSubtitle")
    public WebElement ilanSayisi;


    public boolean appInstallVerified(String id){
        Driver.getAndroidDriver().isAppInstalled(id);
        return true;
    }

}
