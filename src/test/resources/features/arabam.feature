  @arabam
  Feature:Kullanici arabam uygulamasinin gorevlerini gerceklestirir

Background:
  * Uygulamanin acildigi "com.dogan.arabam" dogrulanir
  * Ana sayfada 508 1520 750 508 332 1000 asagi kaydirilarak "Bana araç öner" butonuna dokunun
  * "Manuel" butonu sec
  * "Orta " butonunu sec
  * "Standart " butonu secilir
  * "Sonuçları marka/model üzerinden görüntüle" butonuna dokunun


    Scenario Outline:

      * "<marka>" degerine "<model>" bilgisine ait "<sayi>" kadar ilan oldugunu dogrulayin
      * sayfayi kapatir

      Examples:
      |        marka             |        model           |    sayi    |
      |       Daihatsu           |        Applause        |    6      |
      |         Fiat             |         500 X          |     18     |
      |         Honda            |        Civic           |     755    |