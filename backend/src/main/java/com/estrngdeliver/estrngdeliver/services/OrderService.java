package com.estrngdeliver.estrngdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import com.estrngdeliver.estrngdeliver.dto.OrderDTO;
import com.estrngdeliver.estrngdeliver.dto.ProductDTO;
import com.estrngdeliver.estrngdeliver.entities.Order;
import com.estrngdeliver.estrngdeliver.entities.OrderStatus;
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

  @Autowired
  private ProductRepository productRepository;

  //TIP Abaixo metodos HTTP: GET, POST e afins
  //TIP Conversão de OB para DTO
  @Transactional(readOnly = true)
  public List<OrderDTO> findAll() {
    List<Order> list = repository.findOrdersWithProducts();

    return list.stream()
    .map(x -> new OrderDTO(x))
    .collect(Collectors.toList());
  }

  @Transactional(readOnly = true)
  public OrderDTO insert(OrderDTO dto) {
    
    Order order = new Order(
      null,
      dto.getAddress(),
      dto.getLatitude(),
      dto.getLongitude(),
      Instant.now(),
      OrderStatus.PENDING);

      for(ProductDTO p : dto.getProducts()){
        Product product = productRepository.getOne(p.getId());
        order.getProducts().add(product);      
      }

      order = repository.save(order);

      return new OrderDTO(order);
  }
  
  @Transactional(readOnly = true)
  public OrderDTO setDelivered(Long id) {
    
    Order order = repository.getOne(id);

    order.setStatus(OrderStatus.DELIVERED);

    order = repository.save(order);

    return new OrderDTO(order);
  }
}
