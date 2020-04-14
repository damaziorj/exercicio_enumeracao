package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus satatus;
	private Cliente client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus satatus, Cliente client, List<OrderItem> item) {

		this.moment = moment;
		this.satatus = satatus;
		this.client = client;
		this.items = item;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getSatatus() {
		return satatus;
	}

	public void setSatatus(OrderStatus satatus) {
		this.satatus = satatus;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public List<OrderItem> getItem() {
		return items;
	}

	public void addItem(OrderItem item) {

		items.add(item);

	}

	public void removeItem(OrderItem item) {

		items.remove(item);

	}
	
	public double total() {
		
		double sum = 0.0;
		for (OrderItem item : items) {
			
			sum += item.subTotal();
			
		}
		
		return sum;
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		
		
		
		
	}
	
	

}
