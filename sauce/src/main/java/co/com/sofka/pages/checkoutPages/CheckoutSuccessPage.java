package co.com.sofka.pages.checkoutPages;

import co.com.sofka.commons.CommonActionsOnPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutSuccessPage extends CommonActionsOnPage {

    @CacheLookup
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    protected WebElement productSelector;

    @CacheLookup
    @FindBy(id = "shopping_cart_container")
    protected WebElement cartButton;

    @CacheLookup
    @FindBy(id = "checkout")
    protected WebElement checkoutButton;

    @CacheLookup
    @FindBy(id = "first-name")
    protected WebElement nameForm;

    @CacheLookup
    @FindBy(id = "last-name")
    protected WebElement lastnameForm;

    @CacheLookup
    @FindBy(id = "postal-code")
    protected WebElement zipCodeForm;

    @CacheLookup
    @FindBy(id = "continue")
    protected WebElement continueButton;

    @CacheLookup
    @FindBy(id = "finish")
    protected WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    protected WebElement successMessenge;

    public CheckoutSuccessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
