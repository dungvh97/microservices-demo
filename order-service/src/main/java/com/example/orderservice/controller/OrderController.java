package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OrderController {
    @GetMapping("/orders")
    public List<String> getOrders() {
        return List.of("Order001", "Order002", "Order003");
    }
}
