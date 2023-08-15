Feature: US001 Google Sayfasi Testi
  Background: Google Sayfasina Gidildi
    Given kullanici "googleUrl" sayfasina properties ile gider
  @volvo
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Then kullanici arama kutusunda properties ile "arac1" aratir
    And kullanici 2 sn bekler
    And kullanici sayfa basliginin properties ile "arac1" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Arama Kutusunda Ford Aratilir
    * kullanici arama kutusunda properties ile "arac2" aratir
    * kullanici 2 sn bekler
    * kullanici sayfa basliginin properties ile "arac2" icerdigini test eder
    * sayfayi kapatir

  Scenario: TC03 Arama Kutusunda Audi Aratilir
    * kullanici arama kutusunda properties ile "arac3" aratir
    * kullanici 2 sn bekler
    * kullanici sayfa basliginin properties ile "arac3" icerdigini test eder
    * sayfayi kapatir