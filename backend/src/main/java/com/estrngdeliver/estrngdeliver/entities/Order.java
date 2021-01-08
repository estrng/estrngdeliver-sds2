package com.estrngdeliver.estrngdeliver.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
  
	private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String address;
  private Double latitude;
  private Double longitude;
  private Instant moment;
  private OrderStatus status;

  @ManyToMany
  @JoinTable(name = "tb_order_product", 
  joinColumns = @JoinColumn(name = "order_id"),
  inverseJoinColumns = @JoinColumn(name = "product_id")
  )
  private Set<Product> products = new HashSet<>();


  public Order() {
  }

  public Order(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status) {
    this.id = id;
    this.address = address;
    this.latitude = latitude;
    this.longitude = longitude;
    this.moment = moment;
    this.status = status;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return this.longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Instant getMoment() {
    return this.moment;
  }

  public void setMoment(Instant moment) {
    this.moment = moment;
  }

  public OrderStatus getStatus() {
    return this.status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public Set<Product> getProducts() {
    return this.products;
  }


  public Order id(Long id) {
    this.id = id;
    return this;
  }

  public Order address(String address) {
    this.address = address;
    return this;
  }

  public Order latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  public Order longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  public Order moment(Instant moment) {
    this.moment = moment;
    return this;
  }

  public Order status(OrderStatus status) {
    this.status = status;
    return this;
  }

  public Order products(Set<Product> products) {
    this.products = products;
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(address, order.address) && Objects.equals(latitude, order.latitude) && Objects.equals(longitude, order.longitude) && Objects.equals(moment, order.moment) && Objects.equals(status, order.status) && Objects.equals(products, order.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address, latitude, longitude, moment, status, products);
  }

  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", address='" + getAddress() + "'" +
      ", latitude='" + getLatitude() + "'" +
      ", longitude='" + getLongitude() + "'" +
      ", moment='" + getMoment() + "'" +
      ", status='" + getStatus() + "'" +
      ", products='" + getProducts() + "'" +
      "}";
  }


  

}
