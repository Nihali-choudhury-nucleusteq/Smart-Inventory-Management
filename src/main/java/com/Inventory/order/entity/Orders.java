package com.Inventory.order.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Orders {
    @Id
    @GeneratedValue
	private UUID order_id;
    @Column(nullable = false)
    private String uid;
    @Column(nullable = false)
    private String status;
    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
  	private List<OrderItems> items;

}
