package com.example.payment_api.controller;

import com.example.payment_api.model.Payment;
import com.example.payment_api.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("add")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    @GetMapping("/all")
    public List<Payment> getPayments() {
        return paymentService.getPayments();
    }

    @GetMapping("/get/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }
    

    @DeleteMapping("/delete/{id}")
    public String deletePayment(@PathVariable Long id) {
      paymentService.deletePayment(id);
      return "Payment deleted successfully";
}
}