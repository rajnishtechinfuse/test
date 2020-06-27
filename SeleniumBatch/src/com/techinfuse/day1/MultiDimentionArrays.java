package com.techinfuse.day1;

public class MultiDimentionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num [][] = new int [3][3];
		int num[][]= {{2,14,1,4},{44,5,7},{3,24,6,54,6}};
		
		//System.out.println(num[1][3]);
		//System.out.println(num.length);
		
		for (int row = 0; row < num.length; row++) {
			System.out.println();
			for (int col = 0; col <num[row].length ; col++) {
				System.out.print(num[row][col]+"\t");
			}
		}
 
	}

}
