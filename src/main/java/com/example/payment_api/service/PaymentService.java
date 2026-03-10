package com.example.payment_api.service;
import com.example.payment_api.model.Payment;
import com.example.payment_api.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createPayment(Payment payment) {
        payment.setStatus("SUCCESS");
        return paymentRepository.save(payment);
    }

    public List<Payment> getPayments() {
        return paymentRepository.findAll();
    }

    public void deletePayment(Long id) {
    paymentRepository.deleteById(id);
    }

    public Payment getPaymentById(Long id){
         return paymentRepository.findById(id).orElse(null);
    }
}