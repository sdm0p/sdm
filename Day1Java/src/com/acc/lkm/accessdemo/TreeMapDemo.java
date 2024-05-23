package com.acc.lkm.accessdemo;

import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<String,Integer>treeMap=new TreeMap<>();
		treeMap.put("Java", 10);
		treeMap.put("Azure", 20);
		treeMap.put("Sfdc", 30);
		treeMap.put("Python", 40);
		System.out.println(treeMap);
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap.headMap("Python",false));
		System.out.println(treeMap.subMap("Azure",false,"Sfdc",false));

	}

}
