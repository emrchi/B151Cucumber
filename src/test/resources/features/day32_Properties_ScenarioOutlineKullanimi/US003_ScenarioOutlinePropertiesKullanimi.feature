#US002 TC01 senaryoyu birde config.properties den cektigimiz veriler ile yapalim
Feature: US003 Google Sayfasi Testi

Scenario Outline: TC02 Arama Kutusunda Properties ile Araclar Aratilir

Given kullanici "googleUrl" sayfasina properties ile gider
Then kullanici arama kutusunda properties ile "<aranacakAraclar>" aratir
And kullanici 2 sn bekler
And kullanici sayfa basliginin properties ile "<aranacakAraclar>" icerdigini test eder
And sayfayi kapatir

Examples:
| aranacakAraclar |
| arac1           |
| arac2           |
| arac3           |
| arac4           |