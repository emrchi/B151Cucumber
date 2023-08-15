Feature: US001 Google Sayfasi Testi
  Background: Google Sayfasina Gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider
  @arac
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Then kullanici arama kutusunda properties ile "arac1" aratir
    And kullanici 2 sn bekler
    And kullanici sayfa basliginin properties ile "arac2" icerdigini test eder
    And sayfayi kapatir
  @arac
  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda properties ile "arac2" aratir
    * kullanici 2 sn bekler
    * kullanici sayfa basliginin properties ile "arac2" icerdigini test eder
    * sayfayi kapatir
  @arac
  Scenario: TC03 Arama Kutusunda Audi Aratilir
    * kullanici arama kutusunda properties ile "arac3" aratir
    * kullanici 2 sn bekler
    * kullanici sayfa basliginin properties ile "arac4" icerdigini test eder
    * sayfayi kapatir


    #TC01 ve TC03 de bilerek hata aliyoruz