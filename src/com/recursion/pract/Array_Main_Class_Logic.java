package com.recursion.pract;

public class Array_Main_Class_Logic {

	public static void main(String[] args) {
		System.out.println("creating a blank Array size  10.....");
		ArrayLogico1 obj1 = new ArrayLogico1(10);
		
		System.out.println("\n print the Array");
		obj1.traverseArray();
		System.out.println(); System.out.println();
        
        System.out.println("inserting few value in the Array...");
        obj1.insert(0, 0);
        obj1.insert(1, 10);
        obj1.insert(2, 20);
        obj1.insert(3, 30);
        obj1.insert(4, 40);
        obj1.insert(5, 50);
        obj1.insert(6, 60);
        obj1.insert(7, 70);
        obj1.insert(8, 80);
        obj1.insert(1, 100);
        obj1.insert(12, 120);
        System.out.println(); System.out.println();        
        System.out.println("Accessing cell number# 1...");
        obj1.accessingCell(1);
        System.out.println(); System.out.println();
        System.out.println("Searching 40 in the arrar.....");
        obj1.searchInAnArray(40);
        System.out.println(); System.out.println();
        
        System.out.println("Searching 500 in the arrar.....");
        obj1.searchInAnArray(500);
        System.out.println(); System.out.println();
        
        System.out.println("Deleting value from cell 3 of array...");
        System.out.println("Before Deleting: ");
        obj1.traverseArray();
        obj1.deleteValueFromArray(3);
        System.out.println("After Deleting: ");
        obj1.traverseArray();
        System.out.println(); System.out.println();
	}
   
}
