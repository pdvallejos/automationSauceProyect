package co.com.sofka.pages.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.utils.Enumerates.USER_NAME;
import static co.com.sofka.utils.Enumerates.USER_PASSWORD;

public class LoginSuccessCasesPage extends LoginSuccessPage{

    public LoginSuccessCasesPage(WebDriver driver) {
    super(driver);
}

    public void fillLoginSuccess() {

        clickOn(userName);
        typeOn(userName, USER_NAME.getValue());

        clickOn(password);
        typeOn(password, USER_PASSWORD.getValue());

        scrollOn(loginButton);
        clickOn(loginButton);

        explicitWait(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
    }

    public String isSubject() {
        return getText(assertionOk);
    }
}