package co.com.sofka.pages.checkoutPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.utils.Enumerates.*;

public class CheckoutSuccessCasesPage extends CheckoutSuccessPage{

    public void fillCheckoutSuccess () {

        scrollOn(productSelector);
        clickOn(productSelector);

        scrollOn(cartButton);
        clickOn(cartButton);

        clickOn(checkoutButton);

        scrollOn(nameForm);
        typeOn(nameForm, FORM_NAME.getValue());
        typeOn(lastnameForm, FORM_LASTNAME.getValue());
        typeOn(zipCodeForm, ZIP_CODE.getValue());

        clickOn(continueButton);

        scrollOn(finishButton);
        clickOn(finishButton);

        explicitWait(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));

    }
    public CheckoutSuccessCasesPage(WebDriver driver) {
        super(driver);
    }

    public String isSubject() {
        return getText(successMessenge);
    }
}
