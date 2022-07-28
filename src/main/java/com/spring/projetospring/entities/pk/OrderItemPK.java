package com.spring.projetospring.entities.pk;

import com.spring.projetospring.entities.Order;
import com.spring.projetospring.entities.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable   // pk composta
public class OrderItemPK implements Serializable {
  // OrderItemPK é uma classe auxiliar de chave primária composta
  private static final long Serializable = 1L;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof OrderItemPK)) return false;
    OrderItemPK that = (OrderItemPK) o;
    return Objects.equals(getOrder(), that.getOrder()) && Objects.equals(getProduct(), that.getProduct());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getOrder(), getProduct());
  }
}
