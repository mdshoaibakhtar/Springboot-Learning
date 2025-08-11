package com.learning.springboot.Learning.Spring.Boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;


@Component
@ConditionalOnProperty(name="payment.provider", havingValue = "paytm")
public class PaytmPayments implements PaymentService {
    public String pay(){
        return "Making payment through Paytm";
    }
}
