package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product1 implements Comparable {
	int id;
	String name;
	int price;
	
	public Product1(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Object o1) {
		Product1 p=(Product1)o1;
		int m=p.price;
		if(this.price>m) {
			return 1;
		}
		if(this.price<m) {
			return  -1;
		}
		return 0;
	}
}
public class ProductImplementSort {
	double sumOfPrice(ArrayList<Product1> productList) {
		double sum=0;
		for(Product1 i:productList)
			sum+=i.price;
		return sum;
	}
	float  maxPrice(ArrayList<Product1> productList) {
		float max=0;
		Collections.sort(productList);
	    return productList.get(productList.size()-1).getPrice();
		
	}
	float  minPrice(ArrayList<Product1> productList) {
		float min=0;
		Collections.sort(productList);

		return productList.get(0).getPrice();
		
	}
	List<String> getProductNameList(ArrayList<Product1> productList) {
		List<String> namesList=new ArrayList<String>();
		for(Product1 x:productList) {
			namesList.add(x.name);
		}
		
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product1(20,"Bag",897));
		plist.add(new Product1(21,"Book",87));
		plist.add(new Product1(22,"Table",89));
		plist.add(new Product1(23,"pen",597));
		ProductImplementSort pa=new ProductImplementSort();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
		
		
	}
}

