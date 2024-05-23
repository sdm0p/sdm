package com.acc.lkm.accessdemo;


import java.util.LinkedList;
import java.util.Scanner;
 
public class LinkedListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<CustomerManagement> linkedlist = new LinkedList<>();
		System.out.println("Enter Number of Customers : ");
		int noOfCustomers = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Customer Details");
		for (int i = 0; i < noOfCustomers; i++) {
			System.out.println("Enter Customer Id : ");
			String custId = sc.nextLine();
			System.out.println("Enter Customer Name : ");
			String custName = sc.nextLine();
			System.out.println("Enter Product Name : ");
			String prodName = sc.nextLine();
			System.out.println("Enter Product Price : ");
			int prodPrice = Integer.parseInt(sc.nextLine());
			linkedlist.add(new CustomerManagement(custId, custName, prodName, prodPrice));
		}
		System.out.println();
		System.out.println("Customer Details");
		System.out.println();
		for (CustomerManagement linklist : linkedlist) {
			System.out.println();
			System.out.println("Customer Id : " + linklist.getCust_Id());
			System.out.println("Customer Name : " + linklist.getCust_Name());
			System.out.println("Product Name : " + linklist.getProd_Name());
			System.out.println("Product Price : " + linklist.getProd_price());
			System.out.println();
		}
	}
}

