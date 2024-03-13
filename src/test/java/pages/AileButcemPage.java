package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;
import java.util.logging.XMLFormatter;


import java.time.Duration;

public class AileButcemPage {

       public AileButcemPage(){
           PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);

    }


    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public WebElement successfulMessage;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement isimBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement soyIsimBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement sehirBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement yasBox;
    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public WebElement meslekBox;
    @FindBy(xpath = "//*[@text='Kaydet']")
    public WebElement kaydetButton;
    @FindBy(id = "android:id/button1")
    public WebElement okButonu;
    @FindBy(xpath = "//*[@text='Gelir eklendi.']")
    public WebElement gelirEklemeCheck;




    public void ilkGirisEkrani(int for1,int for2,int x1,int y1,int wait,int x2,int y2,int sleep,String text) throws InterruptedException {

        for (int i = for1; i <for2 ; i++) {
            ReusableMethods.scrollScreenMethod(x1,y1,wait,x2,y2,sleep);
        }
        ReusableMethods.scrollWithUiScrollable(text);
    }

    public void hesapBilgileri(String isim,String soyisim,String sehir,String yas,String meslek){
        isimBox.clear(); isimBox.sendKeys(isim);
        soyIsimBox.clear(); soyIsimBox.sendKeys(soyisim);
        sehirBox.clear(); sehirBox.sendKeys(sehir);
        yasBox.clear(); yasBox.sendKeys(yas);
        meslekBox.clear(); meslekBox.sendKeys(meslek);
        kaydetButton.click();
    }

    public void hesapBilgileriDogrula(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimBox.getText().contains(isim));
        Assert.assertTrue(soyIsimBox.getText().contains(soyisim));
        Assert.assertTrue(sehirBox.getText().contains(sehir));
        Assert.assertTrue(yasBox.getText().contains(yas));
        Assert.assertTrue(meslekBox.getText().contains(meslek));
    }

    public void burgerIcon() throws InterruptedException {
        ReusableMethods.wait(3);
        ReusableMethods.koordinatTiklamaMethodu(110,139,500);
    }

    public void textGonderme(String text, String sendText){
        AndroidDriver driver = (AndroidDriver)  Driver.getAndroidDriver();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"))");
        driver.findElementByXPath("//*[@text='" + text + "']").sendKeys(sendText);
    }

    public void setTarihKutusu(int x,int y,int wait) throws InterruptedException {
        ReusableMethods.koordinatTiklamaMethodu(409,1246,1000);

    }
    public void tarihEkranKaydirmaMethodu(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme) throws InterruptedException {
        for (int i = for1; i < forSart; i++) {
            ReusableMethods.scrollScreenMethod(x1, y1, wait, x2, y2, bekleme);

        }
    }

}
