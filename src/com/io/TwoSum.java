package com.io;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,5,6,7,8,10};
		int t = 9;
		System.out.println(Arrays.toString(twoSum(A,t)));

	}

	private static int[] twoSum(int[] a, int t) {
		int sum = 0;
		int beg = 0;
		int end = a.length - 1;
		
		while(beg <= end){
			sum = a[beg] + a[end];
			if(sum > t)
				end--;
			else
				if(sum < t)
					beg++;
				else
					return new int[] {beg + 1,end + 1};
		}
		return new int[]{beg + 1,end + 1};
	}

	private static int[] twoSum1(int[] a, int t) {
		
		for(int i = 0; i < a.length;i++)
			for(int j=i + 1; j < a.length; j++)
				if(a[i] + a[j] == t){
					return new int[]{i,j};
				}
		return new int[]{0,0};
		}
}
