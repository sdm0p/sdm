package com.acc.lkm.accessdemo;
import java.util.Scanner;
public class AccessModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[]=new int[4];
		int ar1[]=new int[5];
		for(int i=0;i<4;i++) {
			ar[i]=sc.nextInt();
			
		}
		int n=sc.nextInt();
		for(int i=0;i<4;i++) {
			System.out.print(ar[i]);
			//ar1[i]=ar[i];
		}
		ar1[5]=n;
	}

}
