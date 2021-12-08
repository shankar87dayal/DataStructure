package com.recursion.pract;

public class Array_2D_logic {
  int arr [] [] = null;
  
  public Array_2D_logic(int numberOfRows,  int numberOfColumns) {
	  this.arr = new int [numberOfRows] [numberOfColumns];
				for(int row = 0; row< arr.length; row++) {
					for (int col = 0; col < arr.length; col++) {
						arr[row] [col] = Integer.MIN_VALUE;
					}
				}
  }
  public void traverseArray() {
	try {
		System.out.println("printing the array now...");
		for(int row = 0; row< arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				System.out.println(arr [row][col] + " ");
				
			}
			System.out.println();
		}
		System.out.println("\n");
	}catch(Exception e)
	{
		System.out.println("Array does not exits");
	}
  }
  
  public void insertValueInTheArray (int row, int col, int value) {
	  try {
		  if (arr[row] [col] == Integer.MIN_VALUE) {
			  arr[row] [col] = value;
			  System.out.println("successfully inserted" + value + "in the array");
			  
		  }else {
			  System.out.println("this cell is already occupied by another value");
		  }
	  }catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("invalid index to access array ! ");
	  }
  }
      public void accessSingleCell(int row, int col) {
    	  System.out.println("\nAccessing row -" + row + ", col -" + col + "...");
    	  try {
    		  System.out.println("cell value is: " + arr[row][col]);
    		  
    	  }catch(ArrayIndexOutOfBoundsException e) {
    		  System.out.println("Invalid index of access array !");
    		  
    	  }
    	  System.out.println();
      }
      
      public void srearchingSingleValue (int value) {
    	  System.out.println("\nSearching value " + value + "in the array");
    	  for(int row = 0; row < arr.length; row++) {
    		  for(int col = 0; col < arr.length; col++) {
    			  if(arr [row][col] == value) {
    				  System.out.println("value is found at location Row: " + row + "& col:" + col + "\n\n");
    				  return;
    			  }
    		  }
    	  }
		  System.out.println("value is not found in the Array\n");
  
      }
      public void deleteValueFromArray(int deleteValueFromThisRow, int deleteValueFromThisCol) {
    	  System.out.println("Deleting value from row: "+ deleteValueFromThisRow + "& col: " + deleteValueFromThisCol + "...");
       try {
    	   System.out.println("successfully deleted: " + arr[deleteValueFromThisRow] [deleteValueFromThisCol]);
            arr[deleteValueFromThisRow] [deleteValueFromThisCol] = Integer.MIN_VALUE;          
       }catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println();
    	   System.out.println("cant delete the value as cell provided is not in the range of array");
          
       }
      }
}
