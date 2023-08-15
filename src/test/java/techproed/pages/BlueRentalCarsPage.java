package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalCarsPage {
    public BlueRentalCarsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailBox;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement customerButton;
    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement profileButton;
    @FindBy(xpath = "//em")
    public WebElement profileMail;
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOutButton;
    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;


}
