package techproed.stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;

import java.io.File;


public class Hooks {

    /*
            Hooks:
        Hooks nedir?
        Hooks her bir Scenario yada Scenario Outline dan ONCE yada SONRA calistirilan bir classdir.
        Neden hooks kullanilir?
        Raporlamalarda (After metottaki kod ile)
        After metotumuzda bulunan kod ile otomatik olarak ekran goruntusu alma ve rapora ekleme
        Hooks da ne tur kodlar var?
        Before ve After metot lari. After da ekran goruntusu almak icin kullandigim kodlar vardir

        Hooks class'inin kullanim amaci scenario'lardan once veya sonra calismasini istedigimiz kodlari
        belirttigimiz classtir. Bunu @Before ve @After notasyonuna sahip methodlar ile yapariz.
        Bu notasyonlarin import'u io.cucumber dan olmalidir.
        Bu class'in scenario'lar tarafindan gorulup buradaki @Before, @After methodlarini isleme alabilmesi
        icin runner class'indaki glue parametresine ya Hooks class'ini farkli bir package da olusturmak istersek
        Runner class'indaki glue parametresine bu package'i tanimlamamiz gerekir. Ancak Hooks class'ini direk
        stepDefinition package'i altinda olusturursak Runner class'indaki glue parametresinde stepDefinition
        package'i tanimli oldugu icin baska bir islem yapmaya gerek kalmaz.
   */

    @Before                            //importunu import io.cucumber.java.Before; dan almamiz gerek javadan degil
    public void setUp() throws Exception {
        System.out.println("Scenariolar calismaya basladi");
    }

    @Before("@arac2")
    public void setUp2(){
        System.out.println("Google'da Ford aratildi");
    }
    @Before("@arac3")
    public void setUp3(){
        System.out.println("Google'da Audi aratildi");
    }
    /*
    Scenario'dan önce çalışmasını istediğimiz @Before methodunun notasyonuna parametre
    olarak scenario'ya tanımladığımız tag'ı belirte biliriz. Dolayısıyla sadece
    parametre olarak belirttiğimiz @Before methodu Scenario'dan önce çalışacaktır
     */

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/jpeg", "scenario_"+scenario.getName());
            Driver.closeDriver();
        }

    }
    //Bu method fail olan scenario'larda fail olan kismin resmini rapora ekleyecektir.
}
