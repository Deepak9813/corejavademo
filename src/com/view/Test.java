package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Product;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		add();
		getAll();
		delete();

	}

	// add Product
	static void add() {

		ProductService ps = new ProductServiceImpl();

		Scanner sc = new Scanner(System.in);
		char flag = 'y';

		do {
			Product p = new Product();

			System.out.println("Enter id");
			p.setId(sc.nextInt());
			// p.setId(444);

			System.out.println("Enter name");
			p.setName(sc.next());
			// p.setName("Mobile");

			System.out.println("Enter price");
			p.setPrice(sc.nextInt());
			// p.setPrice(60000);

			System.out.println("Enter company name");
			p.setCompany(sc.next());
			// p.setCompany("Samsung");

			System.out.println("Enter quantity");
			p.setQty(sc.nextInt());
			// p.setQty(900);

			ps.addProduct(p);

			//getAll();  
			System.out.println("Do you want to add more[y/n]");
			flag = sc.next().charAt(0);

		} while (flag == 'y');
	}

	// get all products [fetchAll]
	static void getAll() {
		ProductService ps = new ProductServiceImpl();

		List<Product> plist = ps.getAllProduct();
		System.out.println(plist);

	}

	// delete product
	static void delete() {

		ProductService ps = new ProductServiceImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which item[index] do you want to remove/delete?");
		
		ps.deleteProduct(sc.nextInt());
		
		// get products after delete
		getAll();

	}

	/*
	 * JDBC: 1> Xampp 2> sqlyog [mac - workbench]
	 */
}
