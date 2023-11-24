package com.oranium.java;

public class TwoDimensionalArray_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object a[][] = new Object[3][2];
		
	a[0][0] = "Name";
	a[0][1] = "Age";
	
	a[1][0]= "xx";
	a[1][1] = 12;
	
	a[2][0] = "yy";
	a[2][1] =15;

	
	//to retrieve row count	
		int row_count =	a.length;
		
		//to retrieve column count
		
		int col_count = a[0].length;
	
	for(int i=0;i<row_count;i++)
	{
		for(int j=0;j<col_count;j++)
		{
			System.out.println(a[i][j]);
		}
	}
		
	}

}
