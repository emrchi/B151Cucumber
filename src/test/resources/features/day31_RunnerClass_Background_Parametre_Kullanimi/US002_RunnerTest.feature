@techpro
Feature: US002 TecproEducation Arama Testi
  Scenario: TC01 Arama Kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda qa aratir
    And sayfayi kapatir
  @g1
  Scenario: TC02 Arama Kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder
    And sayfayi kapatir

  @techpro
  Scenario: TC03 Arama Kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda java aratir
    But cikan dropdown menuden Free Java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir