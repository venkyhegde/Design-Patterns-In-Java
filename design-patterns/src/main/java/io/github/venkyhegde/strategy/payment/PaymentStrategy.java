package io.github.venkyhegde.strategy.payment;

// this is the strategy interface.
public interface PaymentStrategy {
    boolean pay(double amount);
}

class CreditCardStrategy implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;

    public CreditCardStrategy(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean pay(double amount) {
        // logic goes here;
        if (amount <= 0)
            return false; // or throw an exception
        System.out.println("Credit Card Payment successful. Amount paid - "+amount);
        return true;
    }
}

class PayPalStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        // logic goes here;
        if (amount <= 0)
            return false; // or throw an exception
        System.out.println("Pay pal Payment successful. Amount paid - "+amount);
        return true;
    }
}
