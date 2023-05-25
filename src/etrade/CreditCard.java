package etrade;

import etrade.User;

public class CreditCard {
    private String cardNumber;
    private User cardUser;
    private String expirationDate;
    private String securityCode;
    private int cardBalance;


    public CreditCard(String cardNumber, User cardUser, String expirationDate, String securityCode, int cardBalance){
        this.cardNumber = cardNumber;
        this.cardUser = cardUser;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.cardBalance = cardBalance;
    }

    //Getters and Setters


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public User getCardUser() {
        return cardUser;
    }

    public void setCardUser(User cardUser) {
        this.cardUser = cardUser;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }
}
