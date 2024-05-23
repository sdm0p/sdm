package com.acc.lkm.accessdemo;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Scanner;
 
// Parent class
class Customer {
    protected String name;
    protected String email;
    protected String phone;
 
    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
 
    public void displayCustomerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
