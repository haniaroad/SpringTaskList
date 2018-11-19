package com.Lab24.Lab24.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Items {

	private String name;
	private String description;
	private int quantity;
	private int price;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Items() {

	}

	public Items(String name, String description, int quantity, int price, Integer id) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
		this.id = id;
	}

	public Items(String name, String description, int quantity, int price) {
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Items [name=" + name + ", description=" + description + ", quantity=" + quantity + ", price=" + price
				+ ", id=" + id + "]";
	}

}
