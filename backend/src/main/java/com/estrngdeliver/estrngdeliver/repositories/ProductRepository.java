package com.estrngdeliver.estrngdeliver.repositories;

import java.util.List;

import com.estrngdeliver.estrngdeliver.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;

/* TIP Utilizando o JPA subframework nos da facilidade para fazer acesso
ao banco de dado*/
public interface ProductRepository extends JpaRepository<Product, Long>{
  List<Product> findAllByOrderByNameAsc();  
}
