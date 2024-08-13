package com.codegym.testmodule4.services;

import com.codegym.testmodule4.model.Orders;
import org.apache.el.stream.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IOrderService {
    Page<Orders> findAll(Pageable pageable);

}
