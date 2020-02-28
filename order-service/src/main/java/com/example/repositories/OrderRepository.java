package com.example.repositories;

import com.example.domain.Order;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CassandraRepository<Order, Integer> {
}
