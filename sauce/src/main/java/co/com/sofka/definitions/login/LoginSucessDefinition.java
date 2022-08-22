package co.com.sofka.definitions.login;

import co.com.sofka.pages.loginPages.LoginSuccessCasesPage;
import co.com.sofka.setups.SetupWebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.utils.Enumerates.LOGIN_SUCCESS_EXPECTED;

public class LoginSucessDefinition extends SetupWebUI {

    private static final Logger LOGGER = Logger.getLogger(LoginSucessDefinition.class);
    LoginSuccessCasesPage loginSuccessCasesPage;
    @Dado("que navega hasta el login de la web")
    public void queNavegaHastaElLoginDeLaWeb() {
        try{
            setUpLog4j2();
            setUpWebDriver();

        } catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Cuando("ingresa las credenciales correctas e ingresa")
    public void ingresaLasCredencialesCorrectasEIngresa() {
        try {
        loginSuccessCasesPage = new LoginSuccessCasesPage(driver);
        loginSuccessCasesPage.fillLoginSuccess();
        } catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Entonces("se visualizaran los productos de la tienda virtual.")
    public void seVisualizaranLosProductosDeLaTiendaVirtual() {
        Assertions.assertEquals(LOGIN_SUCCESS_EXPECTED.getValue(), loginSuccessCasesPage.isSubject());
        quiteDriver();
    }
}
