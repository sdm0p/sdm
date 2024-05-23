package com.acc.lkm.accessdemo;

import java.util.LinkedHashSet;

import java.util.HashSet;

import java.util.Scanner;
 

class OrderManagementSystem {

    private LinkedHashSet<Customer> customerSet; // Using LinkedHashSet for maintaining order

    private HashSet<Customer> customerHashSet; // Using HashSet for unique customers
 
    public OrderManagementSystem() {

        customerSet = new LinkedHashSet<>();

        customerHashSet = new HashSet<>();

    }
 
    public void addCustomer(Customer customer) {

        customerSet.add(customer);

        customerHashSet.add(customer);

        System.out.println("Customer added successfully.");

    }
 
    public void updateCustomer(Customer oldCustomer, Customer newCustomer) {

        if (customerHashSet.contains(oldCustomer)) {

            customerSet.remove(oldCustomer);

            customerSet.add(newCustomer);

            customerHashSet.remove(oldCustomer);

            customerHashSet.add(newCustomer);

            System.out.println("Customer updated successfully.");

        } else {

            System.out.println("Customer not found.");

        }

    }
 
    public void removeCustomer(Customer customer) {

        if (customerHashSet.contains(customer)) {

            customerSet.remove(customer);

            customerHashSet.remove(customer);

            System.out.println("Customer removed successfully.");

        } else {

            System.out.println("Customer not found.");

        }

    }
 
    public void displayOrderUsingLinkedHashSet() {

        System.out.println("Displaying orders using LinkedHashSet:");

        for (Customer customer : customerSet) {

            customer.displayCustomerInfo();

            System.out.println();

        }

    }
 
    public void displayOrderUsingHashSet() {

        System.out.println("Displaying orders using HashSet:");

        for (Customer customer : customerHashSet) {

            customer.displayCustomerInfo();

            System.out.println();

        }

    }
 
    public static void main(String[] args) {

        OrderManagementSystem system = new OrderManagementSystem();

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("1. Add customer");

            System.out.println("2. Update customer");

            System.out.println("3. Remove customer");

            System.out.println("4. Display order using LinkedHashSet");

            System.out.println("5. Display order using HashSet");

            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            scanner.nextLine(); // Consume newline
 
            switch (choice) {

                case 1:

                    System.out.println("Enter customer details:");

                    System.out.print("Name: ");

                    String name = scanner.nextLine();

                    System.out.print("Email: ");

                    String email = scanner.nextLine();

                    System.out.print("Phone: ");

                    String phone = scanner.nextLine();

                    Customer newCustomer = new Customer(name, email, phone);

                    system.addCustomer(newCustomer);

                    break;

                case 2:

                    // Implement update functionality

                    break;

                case 3:

                    // Implement remove functionality

                    break;

                case 4:

                    system.displayOrderUsingLinkedHashSet();

                    break;

                case 5:

                    system.displayOrderUsingHashSet();

                    break;

                case 6:

                    System.out.println("Exiting...");

                    break;

                default:

                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");

            }

        } while (choice != 6);

        scanner.close();

    }

}
