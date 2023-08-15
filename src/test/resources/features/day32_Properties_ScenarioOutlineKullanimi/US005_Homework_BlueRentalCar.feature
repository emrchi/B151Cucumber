#USER STORY : US167854_manager_login_test
#NAME:kullanici tum manager login bilgileriyle giriş yapabilmeli
#AC:
#Given kullanici ana sayfada
#When kullanici login sayfasina gider
#And kullanıcı adini girer->>>>>parametre
#And sifreyi girer->>>>>parametre
#And login buttoning basar
#Then login islemi gerçekleşir
#ARTIFACT:
#url : https://www.bluerentalcars.com/
#Credentials:
#{"sam.walker@bluerentalcars.com","c!fas_art"},
#{"kate.brown@bluerentalcars.com","tad1$Fas"},
#{"raj.khan@bluerentalcars.com","v7Hg_va^"},
#{“pam.raymond@bluerentalcars.com”,"Nga^g6!"}
#NOT: scenario outline kullanalim

Feature: US167854 Manager Login Test

  Scenario Outline: TC01 Bluerentalcars Login Islemi
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    When kullanici login sayfasina gider
    And kullanıcı email ve sifre "<email>", "<sifre>"  girer ve login butonuna basar
    And kullanici 2 sn bekler
    Then login islemi gerçekleştigi dogrulanir
    And sayfayi kapatir
    Examples:
      | email | sifre  |
      | mail1 | sifre1 |
      | mail2 | sifre2 |
      | mail3 | sifre3 |
      | mail4 | sifre4 |