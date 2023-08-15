package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablesPage;

public class DataTablesStepDefinition {


    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablesPage.newButton.click();
    }

    @And("kullanici verilen bilgileri {string}, {string}, {string}, {string}, {string},{string}, {string}, girer")
    public void kullaniciVerilenBilgileriGirer(String name, String lastname, String position, String office, String extention, String date, String salary) {
        dataTablesPage.firstName.sendKeys(name, Keys.TAB, lastname, Keys.TAB, position, Keys.TAB, office, Keys.TAB, extention, Keys.TAB, date, Keys.TAB, salary);
    }

    @And("kullanici Create butonuna basar")
    public void kullaniciCreateButonunaBasar() {
        dataTablesPage.createButton.click();
    }

    @Then("kullanici search bölümüne {string} bilgisini girer")
    public void kullaniciSearchBölümüneBilgisiniGirer(String name) {
        dataTablesPage.searchBox.sendKeys(name);
    }


    @And("kullanici {string} ile basarili bir sekilde giris yapildigini dogrular")
    public void kullaniciIleBasariliBirSekildeGirisYapildiginiDogrular(String name) {
        Assert.assertTrue(dataTablesPage.nameBox.getText().contains(name));
    }
}
