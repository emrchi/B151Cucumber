Feature: US001 Google Testi

  @arac1
  Scenario: TC01 Arama Kutusunda Volvo Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici arama kutusunda properties ile "arac1" aratir
    And kullanici 2 sn bekler
    And kullanici sayfa basliginin properties ile "arac2" icerdigini test eder
    And sayfayi kapatir
  @arac2
  Scenario: TC02 Arama Kutusunda Ford Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici arama kutusunda properties ile "arac2" aratir
    And kullanici 2 sn bekler
    And kullanici sayfa basliginin properties ile "arac2" icerdigini test eder
    And sayfayi kapatir
  @arac3
  Scenario: TC03 Arama Kutusunda Audi Aratilir
    Given kullanici "googleUrl" sayfasina properties ile gider
    Then kullanici arama kutusunda properties ile "arac3" aratir
    And kullanici 2 sn bekler
    And kullanici sayfa basliginin properties ile "arac3" icerdigini test eder
    And sayfayi kapatir