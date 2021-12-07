package com.recursion.pract;

public class ArrayLogico1 {
 int arr[] = null;
 
 public ArrayLogico1(int sizeofArray) {
	 arr = new int [sizeofArray];
	 for (int i =0; i< arr.length; i++) {
		 arr[i]= Integer.MIN_VALUE;
 }
 }
 public void traverseArray() {
	 try {
		 for (int i =0; i< arr.length; i++) {
			 System.out.println(arr [i] + " ");
		 }
		 
	 }
	 catch (Exception e)
	 {
		 System.out.println("Array not exists");
	 }
 }
 public void insert(int location, int ValueToBeInserted){
try{
	 if (arr[location] == Integer.MIN_VALUE) {
		 arr[location]  = ValueToBeInserted;
		 System.out.println("successfully Inserted" + ValueToBeInserted + "at location: " + location);
		 
	 }
	 else {
		 System.out.println("this cell is alreary occupied by another value. ");
	 }
	 
 } catch (ArrayIndexOutOfBoundsException e)
 {
	 System.out.println("Invalid cell to access array");
 }
 
}
 public void accessingCell(int cellNumber) {
	 try {
		 System.out.println(arr [cellNumber]);
	 }catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("invalid index to access array...");
	 }
 }
 public void searchInAnArray(int valueToSearch) {
	 for (int i =0; i< arr.length; i++) {
		 if(arr [i] == valueToSearch) {
			System.out.println("value found !");
			System.out.println("Index of " + valueToSearch + "  is: " + i);
			return;
		 }
	 }
	 System.out.println(valueToSearch + "  is not found !!");
 }
 public void deleteValueFromArray (int deleteValueFromThisCell) {
	 try {
		 arr [deleteValueFromThisCell] = Integer.MIN_VALUE;
	 }catch(ArrayIndexOutOfBoundsException e) {
		 System.out.println();
		 System.out.println("can't delete the value as cell# provided is not in the range of array !");
	 }
 }
 }
