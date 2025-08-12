package com.learning.springboot.Learning.Spring.Boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningSpringBootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        System.out.println("Spring Boot Application Started");
        SpringApplication.run(LearningSpringBootApplication.class, args);
    }

    @Autowired
    PaymentService paymentService;

    /*
     * There are two main ways to inject dependencies (beans) in Spring:
     *
     * 1. Constructor Injection:
     *    This is done by passing the dependency through the constructor.
     *    Example:
     *      public LearningSpringBootApplication(PaymentService paymentService) {
     *          this.paymentService = paymentService;
     *      }
     *
     * 2. Field Injection (using @Autowired):
     *    This directly injects the dependency into the field.
     *    This is what we are using here for 'paymentService'.
     *
     * If there are multiple implementations of PaymentService,
     * we can choose which one to use by specifying the bean name
     * in the application.properties (e.g., provider.name).
     *
     * Happy path : [[1, 3], [2, 5]] = [[1, 5]]
     * During application startup, the IoC (Inversion of Control) container
     * creates the ApplicationContext (a collection of beans).
     * Beans are created from POJO classes (e.g., PaytmPayment, RazorpayPayment)
     * and can be configured via annotations (@Component, @Controller, @RestController, etc.)
     * or external configuration files.
     */

    /*
     * We implement CommandLineRunner so that we can execute custom code
     * after the Spring Boot application starts.
     * This avoids relying only on the static main method for execution.
     */
    @Override
    public void run(String... args) {
        System.out.println("Spring Boot Started fetching beans");
        System.out.println(paymentService.pay());
    }
}
