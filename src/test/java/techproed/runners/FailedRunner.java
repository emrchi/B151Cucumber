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
        features = "@TestOutPut/failed_scenario.txt",    //Dosya yolu oldugu icin basina @ koyariz
        glue = {"techproed/stepDefinition"},
        dryRun = false,         //-->true secersek browser'i calistirmaz
        monochrome = false      //-->true kullanirsak konsoldaki ciktilar tek renk(siyah) olur
)

public class FailedRunner {

}
/*
    FailedRunner class'ını oluşturma amacımız rerun ile belirttiğimiz yolda fail olan scenarioları
tekrar bu class'dan tüm scenario'ları tekrar çalıştırmak yerine sadece fail olanları çalıştırmak
için kullanırız. @CucumberOptions() parametresi içine belirttiğimiz features tag'ına bu class'da
fail olan scenarioları tutan txt dosyasının yolunu belirtiriz. Dosya yolu belirttiğimiz için
önüne @ işareti koymamız gerekir
Hata aldigimiz scenario'lari düzelttikten sonra FailRunnerClass'tan Run yaptigimizda,
sadece önceden hata aldigimiz scenariolari çalistirir, diger passed olanlara dokunmaz.
Tum hatalar duzeltilip tekrar rerun yaparsak failed_scenario.txt ici bos olarak doner.
 */
