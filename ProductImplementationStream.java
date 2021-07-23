package com.revature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product implements Comparable {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
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
		Product p=(Product)o1;
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

public class ProductImplementationStream {
double sumOfPrice(ArrayList<Product> productList) {
	    List<Integer> pList= productList.stream().map(n->n.getPrice()).collect(Collectors.toList());
	    Integer sum=pList.stream().reduce((a,b)->a+b).get();
	    return sum;
}	
float  maxPrice(ArrayList<Product> productList) {
	List<Integer> pList= productList.stream().map(n->n.getPrice()).collect(Collectors.toList());
    Integer max=pList.stream().reduce((a,b)->a>b?a:b).get();
    return max;
		
				
	}
	
	float  minPrice(ArrayList<Product> productList) {
		List<Integer> pList= productList.stream().map(n->n.getPrice()).collect(Collectors.toList());
	    Integer min=pList.stream().reduce((a,b)->a<b?a:b).get();
	    return min;
			

		
	}	
	
	List<String> getProductNameList(ArrayList<Product> productList) {
		List<String> namesList=new ArrayList<String>();
		namesList=productList.stream().map(product->product.getName()).collect(Collectors.toList());
		
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<Product>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		ProductImplementation pa=new ProductImplementation();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
		
	}

}


