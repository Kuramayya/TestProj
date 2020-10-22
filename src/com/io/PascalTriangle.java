package com.io;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
	int n=5;
	System.out.println(generate1(n));

	}
	
	
	
	
	

	private static List<List<Integer>> generate1(int n) {
		List<List<Integer>> triangle = new ArrayList<>();
		if(n == 0) return triangle;
		
		List <Integer> first_row = new ArrayList<>();
		first_row.add(1);
		
		triangle.add(first_row);
		
		for(int i = 1;i < n ;i++){
			
			List<Integer> prev_row = triangle.get(i-1);
			List<Integer> row = new ArrayList<>();
			
			row.add(1);
			
			for(int j=1; j < i; j++){
				
				row.add(prev_row.get(j-1) + prev_row.get(j));
			}
			
			row.add(1);
			triangle.add(row);
		}
		
		
		return triangle;
	}

	private static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> traingle = new ArrayList<>();
		if(numRows == 0) return traingle;
		
		List<Integer> first_row = new ArrayList<>();
		first_row.add(1);
		traingle.add(first_row);
		
		for(int i=1; i < numRows; i++){
			
			List<Integer> prev_row = traingle.get(i-1);
			List<Integer> row = new ArrayList<>();
			
			row.add(1);
			
			for(int j=1; j < i; j++){
				row.add(prev_row.get(j - 1) + prev_row.get(j));
			}	
			
			row.add(1);
			
			traingle.add(row);
		}
		
		return traingle;
	}

}
