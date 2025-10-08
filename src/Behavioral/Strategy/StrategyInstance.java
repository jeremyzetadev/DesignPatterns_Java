package Behavioral.Strategy;

public class StrategyInstance {

    void main(){
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }
}
