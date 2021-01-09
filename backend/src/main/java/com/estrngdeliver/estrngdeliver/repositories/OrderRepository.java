package com.estrngdeliver.estrngdeliver.repositories;

import com.estrngdeliver.estrngdeliver.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

/* TIP Utilizando o JPA subframework nos da facilidade para fazer acesso
ao banco de dado*/
public interface OrderRepository extends JpaRepository<Order, Long>{
  
  
}
