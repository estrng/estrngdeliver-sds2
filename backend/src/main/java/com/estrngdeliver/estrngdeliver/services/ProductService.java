package com.estrngdeliver.estrngdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import com.estrngdeliver.estrngdeliver.dto.ProductDTO;
import com.estrngdeliver.estrngdeliver.entities.Product;
import com.estrngdeliver.estrngdeliver.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*TIP anotation Service para dizer para o spring que é
uma classe da camada de Serviços*/
@Service
public class ProductService {
  
  // TIP injeção de componentes
  @Autowired
  private ProductRepository repository;

  //TIP Conversão de OB para DTO
  @Transactional(readOnly = true)
  public List<ProductDTO> findAll() {
    List<Product> list = repository.findAllByOrderByNameAsc();

    return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
  }
}
