Feature: US001 Amazon Sayfasi Testi
  Scenario: TC01 Arama kutusunda urun aratma
    Given kullanici amazon sayfasina gider
    Then kullanici arama kutusunda iphone aratir
    And sayfayi kapatir

    #stepleri yazdiktan sonra koyu oluyor ustunde courser'i tutarsak bize create method diyecek oradan
    # step definition sayfasinda o step'e ait methodu olustururuz.

    Scenario: TC02 Arama kutusunda urun aratma
      Given kullanici amazon sayfasina gider
      Then kullanici arama kutusunda samsung aratir
      And sayfayi kapatir




