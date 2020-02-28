package com.example.domain;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("orders")
public class Order {

    @PrimaryKey("order_id")
    private Integer id;

    @Column("product_name")
    private String productName;
}
