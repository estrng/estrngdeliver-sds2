package com.estrngdeliver.estrngdeliver.dto;

import java.io.Serializable;

import com.estrngdeliver.estrngdeliver.entities.Product;

public class ProductDTO implements Serializable{
  
  private Long id;
  private String name;
  private Double price;  
  private String image_uri;
  private String description;



  public ProductDTO() {
  }
  
  public ProductDTO(Long id, String name, Double price, String image_uri, String description) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.image_uri = image_uri;
    this.description = description;
  }
  
  public ProductDTO(Product entity) {
    id = entity.getId();
    name = entity.getName();
    price = entity.getPrice();
    image_uri = entity.getImage_uri();
    description = entity.getDescription();
  }


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return this.price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getImage_uri() {
    return this.image_uri;
  }

  public void setImage_uri(String image_uri) {
    this.image_uri = image_uri;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


}
