package com.leaningStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	
	int id;
	String name;
	Float price;
	
	

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}




	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}




	public static void main(String[] args) {
		
		Product p1=new Product(1,"manish",10000);
		Product p2=new Product(2,"rahul", 20000);
		Product p3=new Product(3,"rahul", 40000);
		Product p4=new Product(4,"rahul", 50000);
		Product p5=new Product(5,"rahul", 70000);
		
	List<Product> product=Arrays.asList(p1,p2,p3,p4,p5);
	product.stream().sorted( (m,n) -> m.price.compareTo(n.price) ).forEach(e -> {System.out.println(e);});
	product.stream().filter(e -> e.price>15000).map(e -> e.price).forEach(e-> {System.out.println(e);});
	

	}

}
