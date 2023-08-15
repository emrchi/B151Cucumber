package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)   //--> Scenario calistirici notasyonu. Cucumber ile Junit entegrasyonunu saglar
@CucumberOptions(plugin = {"pretty",
        "html:target/html-reports/default-cucumber-reports.html",
        "json:target/json-reports/cucumber1.json",    //Calistirdigimiz birden fazla runner icin bir report'da bu birden fazla scenarionun reportlarini gorebilmek icin json yolumuzun isimleri birbirinden farkli olmali onun icin buraya cucumber1 yazdik bir tane daha runner olusturur isek 2,3 ... gibi eklemeler yapmaliyiz.
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutPut/failed_scenario.txt"},      //rerun ile berlittigimiz dosyada fail olan senaryolar tutulur.
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@positive",
        dryRun = false,         //-->true secersek browser'i calistirmaz
        monochrome = false      //-->true kullanirsak konsoldaki ciktilar tek renk(siyah) olur
)

public class Runner1 {
}
