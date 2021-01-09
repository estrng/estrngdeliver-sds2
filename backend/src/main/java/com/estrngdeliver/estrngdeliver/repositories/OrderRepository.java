package com.estrngdeliver.estrngdeliver.repositories;

import java.util.List;

import com.estrngdeliver.estrngdeliver.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/* TIP Utilizando o JPA subframework nos da facilidade para fazer acesso
ao banco de dado*/
public interface OrderRepository extends JpaRepository<Order, Long>{
  
  @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "+
  " WHERE obj.status = 0 ORDER BY obj.moment ASC")
  List<Order> findOrdersWithProducts();
}
