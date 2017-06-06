package com.hmm.entity;

import java.util.Set;

import org.hibernate.cache.ReadWriteCache.Item;

public class Cart {
	
	private long id;
	private double total;

	private Set<Item> items;
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

}