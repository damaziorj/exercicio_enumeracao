package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Cliente client;
	private List<OrderItem> items = new ArrayList<>();
    
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	

	public Order(Date moment, OrderStatus status, Cliente client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
		
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getSatatus() {
		return status;
	}

	public void setSatatus(OrderStatus satatus) {
		this.status = satatus;
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
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: "+sdf.format(moment)+"\n");
		sb.append("Order status: "+status+"\n");
		sb.append(client+"\n");
		sb.append("Order items: \n");
		for (OrderItem item : items)
		
		{
		sb.append(item + "\n");	
					
		}
		sb.append("Total price: $" +String.format("%.2f", total()));
		
		
		return sb.toString();
		
	}
	
	

}
