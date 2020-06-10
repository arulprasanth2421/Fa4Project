package com.infosys.project.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(value =Cart.class)
@Table(name="Cart")
public class Cart implements Serializable {
	    @Id
		@Column(name = "BUYERID", nullable = false)
		Integer buyerId;
	    @Id
		@Column(name = "PRODID", nullable = false)
		Integer prodId;
	    @Column(name = "QUANTITY", nullable = false)
		Integer quantity;
		public Integer getBuyerId() {
			return buyerId;
		}
		public void setBuyerId(Integer buyerId) {
			this.buyerId = buyerId;
		}
		public Integer getProdId() {
			return prodId;
		}
		public void setProdId(Integer prodId) {
			this.prodId = prodId;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
}