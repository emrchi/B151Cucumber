@emre
Feature: US004 TecproEducation Arama Testi
  @parametre
  Scenario: TC01 Arama Kutusunda bolum aratma
    Given kullanici "https://techproEducation.com" sayfasina gider
    Then kullanici arama kutusunda "Mobile" aratir
    And kullanici 2 sn bekler
    But cikan dropdown menuden mobile developer secenegini tiklar
    And kullanici 1 sn bekler
    And basligin "Mobile" icerdigini test eder
    And sayfayi kapatir

  Scenario: TC02 Google sayfasina gidilir
    Given kullanici "https://google.com" sayfasina gider

  Scenario: TC03 Facebook sayfasina gidilir
    Given kullanici "https:facebook.com" sayfasina gider
    And sayfayi kapatir

  Scenario: TC04 Arama Kutusunda bolum aratma
    Given kullanici "https://techproEducation.com" sayfasina gider
    Then kullanici arama kutusunda "java" aratir
    And sayfayi kapatir