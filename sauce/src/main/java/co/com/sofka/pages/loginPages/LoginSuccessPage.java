package co.com.sofka.pages.loginPages;

import co.com.sofka.commons.CommonActionsOnPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSuccessPage extends CommonActionsOnPage {

    @CacheLookup
    @FindBy(id = "user-name")
    protected WebElement userName;

    @CacheLookup
    @FindBy(id = "password")
    protected WebElement password;

    @CacheLookup
    @FindBy(id = "login-button")
    protected WebElement loginButton;


    public LoginSuccessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //validation

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    protected WebElement assertionOk;
}
