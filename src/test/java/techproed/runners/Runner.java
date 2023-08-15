package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)   //--> Scenario calistirici notasyonu. Cucumber ile Junit entegrasyonunu saglar
@CucumberOptions(plugin = {"pretty",
                           "html:target/html-reports/default-cucumber-reports.html",
                           "json:target/json-reports/cucumber.json",
                           "junit:target/xml-report/cucumber.xml",
                           "rerun:TestOutPut/failed_scenario.txt"},      //rerun ile berlittigimiz dosyada fail olan senaryolar tutulur.
                 features = "src/test/resources/features",
                 glue = {"techproed/stepDefinition"},
                 tags = "@negative",
                 dryRun = false,         //-->true secersek browser'i calistirmaz
                 monochrome = false      //-->true kullanirsak konsoldaki ciktilar tek renk(siyah) olur
)

/*
@CucumberOptions() notasyonuna parametre olarak
    features-->features package'inin yolunu belirtiriz(Content Root)
    glue-->stepdefinition package'inin yolunu belirtiriz(Source Root)
    tags-->calistirmak istedigimiz scenariolari bu parametrede belirtiriz.
    Birden fazla scenario calistirmak istersek "@tag1 or @tag2" gibi or kullanmaliyiz.
    Tum Feature' i calistirmak istersek Feature uzerine yazdigimiz tag'i belirtmeliyiz.

    @CucumberOptions() notasyonu Scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı
    ile alakalı seçanekleri bu notasyonda belirtiriz

    @CucumberOptions() notasyonu içerisine plugin parametresi ile yukarıdaki gibi almak istediğimiz rapor çeşidini
    seçip ekliyoruz.
    pretty-->konsolda calistirdigimiz scenario ile ilgili ayrintili bilgi verir.

    Biz detayli raporu sadece Runner'da calistirinca alabildik. Feature'da detayli rapor almak icin:
    https://reports.cucumber.10 adresinden raporlamalari alabiliriz. Ancak resources altinda cucumber.properties
    isimli bir dosya olusturmaliyiz.
    cucumber.properties dosyasi icine cucumber.publish.enabled=true yaziyoruz. File'dan SaveAll ve cekic sekline
    tiklayarak build yapiyoruz
    Testi calistirinca console'de View your Cucumber Report at altinda mavi renkli linke tiklayinca detayli
    raporu gorduk. Sag ust kosede Log in with Github'i gorduk
    Testi bir Feature file'dan calistirinca console'de View your Cucumber Report at altinda mavi renkli
    linke tiklayinca detayli raporu gorduk. Sag ust kosede Log in with Github'i gorduk.
    Log in with GitHub'a tiklayinca Collections ve devamini alt alta sirali olarak gorduk.
    gitHub ile ilisklilendirdikten sonra Create a collection'a gelecegiz ve Collections altinda Name icine
    B151CucumberNT yazdik ve create new collection'i tikladik. Bize bir TOKEN verilir. Bu sifre ya da link
    gibi yazili TOKEN'i alacagiz. Bu bizim icin bir adres olacak. Kopyaladiktan sonra projemizi aciyoruz ve
    cucumber.properties dosyasina gelip icine CUCUMBER_PUBLISH_TOKEN'i yapistiriyoruz
    Daha sonra File'dan SAVE ALL ve sonra build yapinca istedigimiz Feature'i calistirabiliriz.
    test calistiktan sonra console'deki linke tiklayinca raporumuzu aliyoruz.
 */


public class Runner {

}
