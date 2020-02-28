package com.example.repositories;

import com.example.domain.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CassandraRepository<Product, Integer> {
    @Query("SELECT * FROM product WHERE id=?")
    List<Product> findProductById(Integer id);

    @Query("SELECT * FROM product WHERE name=?")
    List<Product> findProductByName(String name);
}
