package BoneshakerEstore;

public class CreditCardInformation extends BillingInformation {
    private String cardCvv;
    private String cardExpirationYear;
    private String cardExpirationMonth;
    private String nameOfCard;
    private enum cardType{MASTER_CARD, VISA_CARD, VERVE_CARD, AMERICA_EXPRESS}
}
