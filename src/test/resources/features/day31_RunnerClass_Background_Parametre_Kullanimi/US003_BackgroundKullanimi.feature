

#Feature file'daki scenario'larimizda ortak adimlarimiz var ise bunu Feature; yapisindan sonra
#Background: yapisi ile kullanabiliriz. Boylece scenario'dan once Background: step calisacaktir.
@hepsi
Feature: US003 TecproEducation Arama Testi
  Background: Kullanici Techproeducation Sayfasina Gider
    Given kullanici techproEducation sayfasina gider

  Scenario: TC01 Arama Kutusunda bolum aratma
    #Given kullanici techproEducation sayfasina gider       bunlari yoruma aldik cunku background kullandigimiz icin silebiliriz gerek kalmadi.
    Then kullanici arama kutusunda qa aratir
    #And sayfayi kapatir                                    bunlari yoruma aldik boylece tek bir browser'da butun senaryolar calisir ve son senaryodan sonra browser kapanir.

  Scenario: TC02 Arama Kutusunda bolum aratma
    #Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder
    #And sayfayi kapatir

  Scenario: TC03 Arama Kutusunda bolum aratma
    #Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda java aratir
    But cikan dropdown menuden Free Java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir