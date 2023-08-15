Feature: US001 TecproEducation Arama Testi
  @g
  Scenario: TC01 Arama Kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda qa aratir
    And sayfayi kapatir

    #birden fazla step yazdik ve daha once bu stepler icin methodlar olusturmadiysak ustune corser'i getiririz.
    #burada more option tiklar create all steps tiklar file name degistiririz, file type java secilir file location da
    #step definition klasoru secilir ve ok e tiklariz. Intelij step definition package i altinda verdigimiz isim ile
    # bir class olusturur ve bu class'in icine stepler icin methodlari olusturur. Biz bu methodlarin icini doldururuz.

  @techpro
  Scenario: TC02 Arama Kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda mobile aratir
    But cikan dropdown menuden mobile developer secenegini tiklar
    And basligin Mobile icerdigini test eder
    And sayfayi kapatir

  Scenario: TC03 Arama Kutusunda bolum aratma
    Given kullanici techproEducation sayfasina gider
    Then kullanici arama kutusunda java aratir
    But cikan dropdown menuden Free Java secenegini tiklar
    And basligin Free icerdigini test eder
    And sayfayi kapatir
