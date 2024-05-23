package com.acc.lkm.JavaDay1;
import java.util.Scanner;
import java.util.*;
public class Simple {
	
	public void sim(String n,int r,Long c) {
		System.out.println(n);
		System.out.println(r);
		System.out.println(c);
	}
	public void sim(String n,int r,Long c1,Long c2) {
		System.out.println(n);
		System.out.println(r);
		System.out.println(c1);
		System.out.println(c1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Long contact1,contact2;
		int roll;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		roll=sc.nextInt();
		contact1=sc.nextLong();
		contact2=sc.nextLong();
		
		Simple simple=new Simple();
		simple.sim(name,roll,contact1);
		simple.sim(name,roll,contact1,contact2);
	}

}
