package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {

    TechproPage techproPage = new TechproPage();

    @Given("kullanici techproEducation sayfasina gider")
    public void kullaniciTechproEducationSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }
    @Then("kullanici arama kutusunda qa aratir")
    public void kullaniciAramaKutusundaQaAratir() {
        techproPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }
    @Then("kullanici arama kutusunda mobile aratir")
    public void kullaniciAramaKutusundaMobileAratir() {
        techproPage.aramaKutusu.sendKeys("mobile");
        ReusableMethods.bekle(2);
    }
    @But("cikan dropdown menuden mobile developer secenegini tiklar")
    public void cikanDropdownMenudenMobileDeveloperSeceneginiTiklar() {
        techproPage.mobileDeveloperLink.click();
        ReusableMethods.bekle(2);
    }
    @And("basligin Mobile icerdigini test eder")
    public void basliginMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Then("kullanici arama kutusunda java aratir")
    public void kullaniciAramaKutusundaJavaAratir() {
        techproPage.aramaKutusu.sendKeys("java");
        ReusableMethods.bekle(2);
    }
    @But("cikan dropdown menuden Free Java secenegini tiklar")
    public void cikanDropdownMenudenFreeJavaSeceneginiTiklar() {
        techproPage.freeJavaLink.click();
        ReusableMethods.bekle(2);
    }
    @And("basligin Free icerdigini test eder")
    public void basliginFreeIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Free"));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("kullanici arama kutusunda {string} aratir")
    public void kullaniciAramaKutusundaAratir(String str) {
        techproPage.aramaKutusu.sendKeys(str);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @And("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
