package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductServiceImpl implements ProductService{

	static List<Product> plist = new ArrayList<>();
	
	@Override
	public void addProduct(Product p) {
		plist.add(p);	
		System.out.println("===========Success======size=="+plist.size());	
	}

	@Override
	public void deleteProduct(int index) {
		
		plist.remove(index);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return plist;
	}
		

}
