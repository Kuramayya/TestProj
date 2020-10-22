package com.io;

import java.util.Arrays;

public class AddTwoArrays2 {

	public static void main(String[] args) {
		int A[] = {2,4,6,2};
		int B[] = {3,7,4};
		System.out.println(Arrays.toString(addSum(A,B)));
		//Added one more check as we discussed.
	}

	private static int[] addSum(int[] a, int[] b) {
		int rem=0,sum,i;
		int c[] = new  int[a.length > b.length ? a.length : b.length];
		int j = 0;
		for(i = 0;i < a.length && j < b.length; i++){
			sum = a[i] + b[i];
			if(sum >= 10){
				c[i] = sum % 10;
				rem = sum / 10;
				if(rem != 0)
					c[i] = a[i] + b[i] + rem;	
			}
			else
				c[i] = sum;
			j++;
		}
		if (i < a.length){
			for(int k=i; k < a.length;k++)
				c[k] = a[k];
		}
		if (j < b.length){
			for(int k=j; k < b.length;k++)
				c[k] = b[k];
		}
			
		return c;
	}

}
