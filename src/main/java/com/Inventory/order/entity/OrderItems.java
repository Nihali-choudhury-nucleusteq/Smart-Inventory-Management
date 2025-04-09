package com.Inventory.order.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
	
	@Column(nullable = false)
	private UUID order_id;
	@Column(nullable = false)
    private String product_id;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
	@JoinColumn(name="order_id")
	private Orders order;
}
