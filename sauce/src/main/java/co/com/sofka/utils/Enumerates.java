package co.com.sofka.utils;

public enum Enumerates {

    FORM_NAME("Pablo"),
    FORM_LASTNAME("Landa"),
    ZIP_CODE("16533"),
    USER_NAME("standard_user"),
    USER_PASSWORD("secret_sauce"),
    LOGIN_SUCCESS_EXPECTED("PRODUCTS"),
    CHECKOUT_SUCCESS_EXPECTED("THANK YOU FOR YOUR ORDER");

    private final String value;

    public String getValue(){return value;}

    Enumerates(String value) {
        this.value = value;
    }


}
