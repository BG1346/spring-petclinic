package org.springframework.samples.petclinic.model;

public class CreditCard implements Payment{

    Payment cash = new Cash();

    @Override
    public void pay(int amount){
        if(amount >= 100) {
            System.out.println(amount + " 카드결제");
        }else{
            cash.pay(amount);
        }
    }
}
