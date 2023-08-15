Feature: US003 BlueRentalCar Login Islemi

  Scenario: TC01 BlueRentalCar Pozitif Test
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    Then kullanici login sayfasina gider
    But kullanici 2 sn bekler
    And kullanici tabloda verilen bilgiler ile map kullanarak login olur
      | email                         | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
      | kate.brown@bluerentalcars.com | tad1$Fas  |
    And sayfayi kapatir