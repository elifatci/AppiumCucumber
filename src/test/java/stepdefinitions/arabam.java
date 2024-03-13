package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ArabamPage;
import utils.Driver;
import utils.ReusableMethods;

public class arabam {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();
    ArabamPage arabamPage=new ArabamPage();

    @Given("Uygulamanin acildigi {string} dogrulanir")
    public void uygulamanin_acildigi_dogrulanir(String string) {

        Assert.assertTrue(arabamPage.alirkenSatarkenText.isDisplayed());

    }
    @Given("Ana sayfada {int} {int} {int} {int} {int} {int} asagi kaydirilarak {string} butonuna dokunun")
    public void ana_sayfada_asagi_kaydirilarak_butonuna_dokunun(int x1,int y1,int wait,int x2,int y2,int sleep,String string) throws InterruptedException {
        ReusableMethods.scrollScreenMethod(x1,y1,wait,x2,y2,sleep);
        ReusableMethods.scrollWithUiScrollable(string);

    }
    @Given("{string} butonu sec")
    public void butonu_sec(String string) {

        ReusableMethods.scrollWithUiScrollable(string);
        ReusableMethods.wait(1);
    }

    @Given("{string} butonunu sec")
    public void butonunu_sec(String string) {

        ReusableMethods.scrollWithUiScrollable(string);
        ReusableMethods.wait(1);
    }
    @Given("{string} butonu secilir")
    public void butonu_secilir(String string) {

        ReusableMethods.scrollWithUiScrollable(string);
        ReusableMethods.wait(1);
    }

    @Given("{string} butonuna dokunun")
    public void butonuna_dokunun(String string) {

        ReusableMethods.scrollWithUiScrollable(string);

    }
    @Given("{string} degerine {string} bilgisine ait {string} kadar ilan oldugunu dogrulayin")
    public void degerine_bilgisine_ait_kadar_ilan_oldugunu_dogrulayin(String marka, String model, String sayi) {

        ReusableMethods.scrollWithUiScrollable(marka);
        ReusableMethods.scrollWithUiScrollable(model);
        ReusableMethods.wait(2);
        Assert.assertTrue(arabamPage.ilanSayisi.getText().contains(sayi));


    }

    @Given("sayfayi kapatir")
    public void sayfayi_kapatir() {

     Driver.quitAppiumDriver();
    }
}
