package com.estrngdeliver.estrngdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import com.estrngdeliver.estrngdeliver.dto.OrderDTO;
import com.estrngdeliver.estrngdeliver.entities.Order;
import com.estrngdeliver.estrngdeliver.entities.Product;
import com.estrngdeliver.estrngdeliver.repositories.OrderRepository;
import com.estrngdeliver.estrngdeliver.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*TIP anotation Service para dizer para o spring que é
uma classe da camada de Serviços*/
@Service
public class OrderService {
  
  // TIP injeção de componentes
  @Autowired
  private OrderRepository repository;

  //TIP Conversão de OB para DTO
  @Transactional(readOnly = true)
  public List<OrderDTO> findAll() {
    List<Order> list = repository.findOrdersWithProducts();

    return list.stream()
    .map(x -> new OrderDTO(x))
    .collect(Collectors.toList());
  }
}
