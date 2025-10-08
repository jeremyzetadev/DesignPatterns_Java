package Behavioral.Strategy;

public class PaymentByCreditCard implements PaymentStrategy{
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardNumber","ExpirayDate", "cvv");
    }

    @Override
    public boolean validatePaymentDetails() {
        return false;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}
