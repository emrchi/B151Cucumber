Feature: US002 Google Sayfasi Testi

  Scenario Outline: TC01 Arama Kutusunda Araclar Aratilir

    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici google arama kutusunda "<aranacakAraclar>" aratir
    And kullanici 2 sn bekler
    And kullanici sayfa basliginin "<aranacakAraclar>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | aranacakAraclar |
      | volvo           |
      | ford            |
      | audi            |
      | mercedes        |


        #Scenario Outline kullanimi testNG deki data provider mantiği ile ayni çalışır.
#Scenario Outline yapısını kullandıktan sonra birden fazla veri ile arama işlemi yapmak yada login işlemi yapmak
#istiyorsak aratmak istediğimiz kelimeyi "< >" içine belirtiriz. Daha önce parametreli method oluşturduğumuz için
#tekrar parametreli method oluşturmaya gerek kalmadan Scenari Outline yapısına tıklayarak alt kısımda çıkan
#Examples bolümünde yukarıdaki örnekteki gibi belirttiğimiz başlık altına istediğimiz verileri girerek sırasiyla
#arama işlemlerini gerçekleştirmiş oluruz

