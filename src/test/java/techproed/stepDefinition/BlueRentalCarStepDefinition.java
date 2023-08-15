package techproed.stepDefinition;

import com.google.common.collect.Maps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarsPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlueRentalCarStepDefinition {

    BlueRentalCarsPage blueRentalCarsPage = new BlueRentalCarsPage();

    @When("kullanici login sayfasina gider")
    public void kullaniciLoginSayfasinaGider() {
        blueRentalCarsPage.loginButton.click();
    }

    @And("kullanıcı email ve sifre {string}, {string}  girer ve login butonuna basar")
    public void kullanıcıEmailVeSifreGirerVeLoginButonunaBasar(String email, String sifre) {
        blueRentalCarsPage.emailBox.sendKeys(ConfigReader.getProperty(email), Keys.TAB,
                                             ConfigReader.getProperty(sifre), Keys.TAB, Keys.ENTER);
    }

    @Then("login islemi gerçekleştigi dogrulanir")
    public void loginIslemiGerçekleştigiDogrulanir() {
        Assert.assertTrue(blueRentalCarsPage.customerButton.isDisplayed());
    }

    @And("kullanici tabloda verilen bilgiler ile login olur")
    public void kullaniciTablodaVerilenBilgilerIleLoginOlur(DataTable data) {
        blueRentalCarsPage.emailBox.sendKeys(ConfigReader.getProperty(data.row(1).get(0)), Keys.TAB, ConfigReader.getProperty(data.row(1).get(1)), Keys.ENTER);
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(2);
        blueRentalCarsPage.emailBox.sendKeys(ConfigReader.getProperty(data.row(2).get(0)), Keys.TAB, ConfigReader.getProperty(data.row(2).get(1)), Keys.ENTER);
        ReusableMethods.bekle(2);
    }

    @And("kullanici tabloda verilen bilgiler ile map kullanarak login olur")
    public void kullaniciTablodaVerilenBilgilerIleMapKullanarakLoginOlur(DataTable data) {
        List<Map<String, String>> emailPassword = data.asMaps();
        for(Map<String,String> w : emailPassword) {
            blueRentalCarsPage.emailBox.sendKeys(w.get("email"), Keys.TAB, w.get("password"), Keys.ENTER);
            ReusableMethods.bekle(2);
            Driver.getDriver().navigate().back();
        }

    }

    @And("kullanici excel'deki {string} sayfasindaki bilgiler ile giris yapip giris yapildigini test eder")
    public void kullaniciExcelDekiSayfasindakiBilgilerIleGirisYapipGirisYapildiginiTestEder(String sayfaIsmi) {
        String dosyaYolu = "src/test/resources/mysmoketestdata (1).xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu, sayfaIsmi);
        for (int i = 1; i <excelReader.RowCount(); i++) {
            String email = excelReader.getCellData(i,0);
            String password = excelReader.getCellData(i,1);
            blueRentalCarsPage.loginButton.click();
            ReusableMethods.bekle(2);
            blueRentalCarsPage.emailBox.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            ReusableMethods.bekle(2);
            blueRentalCarsPage.customerButton.click();
            ReusableMethods.bekle(2);
            blueRentalCarsPage.profileButton.click();
            ReusableMethods.bekle(2);
            Assert.assertEquals(blueRentalCarsPage.profileMail.getText(),email);
            ReusableMethods.bekle(2);
            blueRentalCarsPage.customerButton.click();
            ReusableMethods.bekle(2);
            blueRentalCarsPage.logOutButton.click();
            ReusableMethods.bekle(2);
            blueRentalCarsPage.okButton.click();
            ReusableMethods.bekle(2);
        }
    }
}
