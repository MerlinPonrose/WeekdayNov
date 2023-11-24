package com.oranium.java;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object a[][] = {{"Name","Age"},{"xx",12},{"yy",15}};
		
		System.out.println(a[1][1]);
		
		System.out.println(a[2][0]);
		
		
	//to retrieve row count	
	int row_count =	a.length;
	
	//to retrieve column count
	
	int col_count = a[0].length;
	
	
	System.out.println("Column count="+col_count);
	
	System.out.println("Row_count="+row_count);
	
	
	for(int i=0;i<row_count;i++)
	{
		for(int j=0;j<col_count;j++)
		{
			System.out.println(a[i][j]);
		}
	}
		
	}
}
