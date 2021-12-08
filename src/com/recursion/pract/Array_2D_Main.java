package com.recursion.pract;

public class Array_2D_Main {
 public static void main(String[] args) {
	System.out.println("creating a blank array of size 5*5...");
	Array_2D_logic obj = new Array_2D_logic(5,5);
	obj.traverseArray();
	
	obj.insertValueInTheArray(0, 2, 1000000001);
    obj.traverseArray();
    
    obj.insertValueInTheArray(0, 2, 1000000001);
    obj.traverseArray();
    
    obj.accessSingleCell(0, 2);
    obj.accessSingleCell(6, 2);
    obj.accessSingleCell(2, 2);
    
    obj.srearchingSingleValue(10);
    obj.srearchingSingleValue(-2147483648 );
    obj.srearchingSingleValue(1000000001);
    
    obj.deleteValueFromArray(0, 2);
    obj.traverseArray();
 }
}
