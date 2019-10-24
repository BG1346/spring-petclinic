package org.springframework.samples.petclinic.model;

public class Store {

    Payment payment;

    public Store(Payment payment) {
        this.payment = payment;
    }

    public void buySomething(){
        payment.pay(100);
    }
}
