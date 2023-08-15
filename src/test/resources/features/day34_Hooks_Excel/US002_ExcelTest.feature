Feature: US002 BlueRentalCar Excel Login
  Scenario: TC01 Costomer Login Test
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    Then kullanici 2 sn bekler
    And kullanici excel'deki "customer_info" sayfasindaki bilgiler ile giris yapip giris yapildigini test eder
    And sayfayi kapatir

  Scenario: TC02 Admin Login Test
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    Then kullanici 2 sn bekler
    And kullanici excel'deki "admin_info" sayfasindaki bilgiler ile giris yapip giris yapildigini test eder
    And sayfayi kapatir