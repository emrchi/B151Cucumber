Feature: US002 BlueRentalCar Login Islemi

  Scenario: TC01 BlueRentalCar Pozitif Test
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    Then kullanici login sayfasina gider
    But kullanici 2 sn bekler
    And kullanici tabloda verilen bilgiler ile login olur
      | email | password |
      | mail1 | sifre1   |
      | mail2 | sifre2   |
    And sayfayi kapatir
