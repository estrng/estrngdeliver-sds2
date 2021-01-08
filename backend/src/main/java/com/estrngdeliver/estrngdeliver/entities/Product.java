package com.estrngdeliver.estrngdeliver.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable{
   
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private Long id;
  private String name;
  private Double price;  
  private String image_uri;
  private String description;


  public Product() {
  }

  public Product(Long id, String name, Double price, String image_uri, String description) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.image_uri = image_uri;
    this.description = description;
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

  public Product id(Long id) {
    this.id = id;
    return this;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  public Product price(Double price) {
    this.price = price;
    return this;
  }

  public Product image_uri(String image_uri) {
    this.image_uri = image_uri;
    return this;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(image_uri, product.image_uri) && Objects.equals(description, product.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, image_uri, description);
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", name='" + getName() + "'" +
      ", price='" + getPrice() + "'" +
      ", image_uri='" + getImage_uri() + "'" +
      ", description='" + getDescription() + "'" +
      "}";
  }

}
