package com.acc.lkm.accessdemo;

 
public class CustomerManagement {
	private String Cust_Id;
	private String Cust_Name;
	private String Prod_Name;
	private int Prod_price;

 
	public CustomerManagement(String cust_Id, String cust_Name, String prod_Name, int prod_price) {
		super();
		Cust_Id = cust_Id;
		Cust_Name = cust_Name;
		Prod_Name = prod_Name;
		Prod_price = prod_price;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getCust_Id() {
		return Cust_Id;
	}
	public void setCust_Id(String cust_Id) {
		Cust_Id = cust_Id;
	}
	public String getProd_Name() {
		return Prod_Name;
	}
	public void setProd_Name(String prod_Name) {
		Prod_Name = prod_Name;
	}
	public int getProd_price() {
		return Prod_price;
	}
	public void setProd_price(int prod_price) {
		Prod_price = prod_price;
	}
}