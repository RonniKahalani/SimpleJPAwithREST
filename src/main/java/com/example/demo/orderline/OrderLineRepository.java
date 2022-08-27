package com.example.demo.orderline;

import com.example.demo.order.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {

    Optional<OrderLine> findById(long id);
}