package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.io.IOException;

public class aileButcem {

    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

    AileButcemPage aileButcemPage=new AileButcemPage();

    @Given("ilk ekran ayarlarini yapin {int} {int} {int} {int} {int} {int} {int} {int} ve ardindan login {string} sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(int for1,int for2,int x1,int y1, int wait, int x2,int y2,int sleep, String text) throws InterruptedException {

        ReusableMethods.wait(5);

        aileButcemPage.ilkGirisEkrani(for1,for2,x1,y1,wait,x2,y2,sleep,text);
    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail, String password, String girisYap) {

        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.scrollWithUiScrollable(girisYap);


    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        ReusableMethods.wait(3);
        Assert.assertTrue(aileButcemPage.successfulMessage.isDisplayed());

    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String text) throws InterruptedException {
        aileButcemPage.burgerIcon();
        ReusableMethods.scrollWithUiScrollable(text);
    }
    @Given("hesabim sayfasindaki {string} {string} {string} {string} {string} bilgileri degistirerek degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String isim, String soyisim, String sehir, String yas, String meslek) {

        aileButcemPage.hesapBilgileri(isim,soyisim,sehir,yas,meslek);
        aileButcemPage.hesapBilgileriDogrula(isim,soyisim,sehir,yas,meslek);

    }

    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {

        Driver.quitAppiumDriver();
    }


    @Given("anasayfadaki arti butonuna {int} {int} {int} tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin(int int1,int int2, int wait) throws InterruptedException {

        ReusableMethods.koordinatTiklamaMethodu(int1,int2,wait);
    }
    @Given("{string} Butonuna tiklayın")
    public void anasayfadaki_arti_Butonuna_tiklayin(String text){

       ReusableMethods.scrollWithUiScrollable(text);
    }

    @Given("Gelir Ekle sayfasinda {string} aciklama kismina {string} deger girilir")
    public void gelir_ekle_sayfasinda_aciklama_kismina_deger_girilir(String text,String deger) {

       aileButcemPage.textGonderme(text,deger);
    }

    @Given("Gelir Ekle sayfasinda {int} {int} {int} Gelir tipi {string} secilir")
    public void gelir_ekle_sayfasinda_gelir_tipi_secilir(int x,int y,int wait, String string) throws InterruptedException {

        ReusableMethods.koordinatTiklamaMethodu(x,y,wait);
        ReusableMethods.wait(2);
        ReusableMethods.scrollWithUiScrollable(string);
    }

    @Given("Gelir Ekle sayfasinda {int} {int} {int} Kategori {string} secilir")
    public void gelir_ekle_sayfasinda_kategori_secilir(int x,int y,int wait, String string2) throws InterruptedException {

        ReusableMethods.koordinatTiklamaMethodu(x,y,wait);
        ReusableMethods.wait(2);
        ReusableMethods.scrollWithUiScrollable(string2);
    }

    @Given("Gelir Ekle sayfasinda Tarih belirlemesi {int} {int} {int} {int} {int} {int} {int} {int} ve gun secimi {string} {int} {int} {int} yapilir")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_ve_gun_secimi_yapilir(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7, Integer int8, String string, Integer int9, Integer int10, Integer int11) throws InterruptedException {

       aileButcemPage.setTarihKutusu(int9,int10,int11);
       aileButcemPage.tarihEkranKaydirmaMethodu(int1,int2,int3,int4,int5,int6,int7,int8);
       ReusableMethods.scrollWithUiScrollable(string);
       aileButcemPage.okButonu.click();

    }

    @Given("Gelir Ekle sayfasinda {string} {string} bilgisi girilir")
    public void gelir_ekle_sayfasinda_tutar_bilgisi_girilir(String string,String string1) {

        aileButcemPage.textGonderme(string,string1);
    }

    @Given("{string} Butonuna text uzerinden Tiklanir")
    public void butonuna_text_uzerinden_tiklanir(String string) {

        ReusableMethods.scrollWithUiScrollable(string);
    }

    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() throws IOException {

        Assert.assertTrue(aileButcemPage.gelirEklemeCheck.isDisplayed());
        ReusableMethods.getScreenshot("son");
    }
}
