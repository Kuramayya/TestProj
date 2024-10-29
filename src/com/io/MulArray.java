package com.io;

import java.util.Arrays;

public class MulArray {

	public static void main(String[] args) {
		int A[] = {1,2,3,4};
		System.out.println(Arrays.toString(mulArray(A)));
		System.out.println(Arrays.toString(mulArray(A)));
	}

	private static int[] mulArray(int[] a) {
		int B[] = new int[a.length];
		int mul = 1, k = 0;
		if(a.length == 0) 
			return B;
		else{
			for(int i=0;i < a.length;i++){
				mul = 1;
				for(int j=0; j < a.length;j++){
					if(i != j)
						mul = mul * a[j];
				}
				B[k++] = mul;
			}
		}
		return B;
	}

}
