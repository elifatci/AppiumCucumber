
Feature: Kullanici aileButcem gorevlerini gerceklestirir


  Background:
    *  ilk ekran ayarlarini yapin 0 6 946 1005 750 150 1005 500 ve ardindan login "Giriş Yap" sayfasina ulasin
    *  "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap" giris yapin
    *  uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin


  Scenario Outline: Kullanici test gorevlerini yerine getirir

  *  sol kisimdaki menuden "Hesabım" bolumune gidin
  *  hesabim sayfasindaki "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" bilgileri degistirerek degisikleri kaydedin ve dogrulayin
  *  kullanici uygulamayi kapatir

    Examples:
    | isim |soyisim | sehir | yas | meslek |
    | t127 |  test  | Turkey| 30  | QA     |
    |deneme| tester | Poland| 20  |Engineer|



    @ab
    Scenario:
      * anasayfadaki arti butonuna 541 1680 750 tiklayin
      * "Gelir Ekle" Butonuna tiklayın
      * Gelir Ekle sayfasinda "Açıklama" aciklama kismina "Ilk gelir degeri " deger girilir
      * Gelir Ekle sayfasinda 153 997 1000 Gelir tipi "Düzensiz" secilir
      * Gelir Ekle sayfasinda 197 1132 1000 Kategori "Serbest Gelir" secilir
      * Gelir Ekle sayfasinda Tarih belirlemesi 0 1 771 1056 500 270 1056 1000 ve gun secimi "25" 975 1245 1000 yapilir
      * Gelir Ekle sayfasinda "Tutar" "10000" bilgisi girilir
      * "Kaydet" Butonuna text uzerinden Tiklanir
      * basariyla eklendigini dogrulayin
      * kullanici uygulamayi kapatir