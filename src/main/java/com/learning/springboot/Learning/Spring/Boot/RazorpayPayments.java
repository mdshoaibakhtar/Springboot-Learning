package com.learning.springboot.Learning.Spring.Boot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

// With the help of @Component/@Service/@RestController/@Repository/@Controller, we can create beans.
// Beans give us the flexibility to make the loose coupling.
@Component
@ConditionalOnProperty(name="payment.provider", havingValue = "razorpay")
public class RazorpayPayments implements PaymentService{
    public String pay(){
        return "Making payment through Razorpay";
    }
}
