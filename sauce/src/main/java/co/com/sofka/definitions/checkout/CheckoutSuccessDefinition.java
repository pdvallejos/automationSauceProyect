package co.com.sofka.definitions.checkout;

import co.com.sofka.pages.checkoutPages.CheckoutSuccessCasesPage;
import co.com.sofka.pages.loginPages.LoginSuccessCasesPage;
import co.com.sofka.setups.SetupWebUI;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import static co.com.sofka.utils.Enumerates.CHECKOUT_SUCCESS_EXPECTED;

public class CheckoutSuccessDefinition extends SetupWebUI {

    private static final Logger LOGGER = Logger.getLogger(CheckoutSuccessDefinition.class);
    LoginSuccessCasesPage loginSuccessCasesPage;
    CheckoutSuccessCasesPage checkoutSuccessCasesPage;

    @Dado("que ingresa a la tienda virtual seleccionando sus productos")
    public void queIngresaALaTiendaVirtualSeleccionandoSusProductos() {
        try{
            setUpLog4j2();
            setUpWebDriver();
            loginSuccessCasesPage = new LoginSuccessCasesPage(driver);
            loginSuccessCasesPage.fillLoginSuccess();

        } catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Cuando("realiza los pasos para el pago satisfactorio")
    public void realizaLosPasosParaElPagoSatisfactorio() {
        try {
        checkoutSuccessCasesPage = new CheckoutSuccessCasesPage(driver);
        checkoutSuccessCasesPage.fillCheckoutSuccess();
        } catch (Exception e){
            quiteDriver();
            Assertions.fail(e.getMessage(), e);
            LOGGER.error(e.getMessage(), e);
        }
    }
    @Entonces("se mostrara un mensaje de compra exitosa.")
    public void seMostraraUnMensajeDeCompraExitosa() {
        Assertions.assertEquals(CHECKOUT_SUCCESS_EXPECTED.getValue(), checkoutSuccessCasesPage.isSubject());
        quiteDriver();
    }

}
