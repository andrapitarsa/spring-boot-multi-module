package com.example.service;

import com.example.domain.Order;
import com.example.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> findOrders () {
        List<Order> orders = orderRepository.findAll();
        return orderRepository.findAll();
    }
}
