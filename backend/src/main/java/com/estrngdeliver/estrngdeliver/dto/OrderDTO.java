package com.estrngdeliver.estrngdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.estrngdeliver.estrngdeliver.entities.Order;
import com.estrngdeliver.estrngdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable{
  
	private static final long serialVersionUID = 1L;
  
  private Long id;
  private String address;
  private Double latitude;
  private Double longitude;
  private Instant moment;
  private OrderStatus status;

  private List<ProductDTO> products = new ArrayList<>();

  public OrderDTO() {
  }
  

  public OrderDTO(Long id, String address, Double latitude, Double longitude, Instant moment, OrderStatus status, List<ProductDTO> products) {
    this.id = id;
    this.address = address;
    this.latitude = latitude;
    this.longitude = longitude;
    this.moment = moment;
    this.status = status;
    this.products = products;
  }


  public OrderDTO(Order entity) {
    id = entity.getId();
    address = entity.getAddress();
    latitude = entity.getLatitude();
    longitude = entity.getLongitude();
    moment = entity.getMoment();
    status = entity.getStatus();
    
    products = entity.getProducts().stream()
    .map(x -> new ProductDTO(x))
    .collect(Collectors.toList());
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

  public List<ProductDTO> getProducts() {
    return this.products;
  }


}
