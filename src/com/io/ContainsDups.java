package com.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsDups {

	public static void main(String[] args) {
		int A[] = {1,2,3,4,3,5};
		if(containDups(A))
			System.out.println("There are Dups");
		else
			System.out.println("No Dups");
		if(otherWay(A))
			System.out.println("There are Dups");
		else
			System.out.println("No Dups");
	}
		private static boolean otherWay(int[] A) {
			Arrays.sort(A);
			for(int i=1;i < A.length;i++){
				if(A[i - 1] == A[i]) 
					return true;
				
		}
		return false;
	}
	private static boolean containDups(int[] a) {
		if (a.length == 0) return false;
		List<Integer> list = new ArrayList<>();
		for(int i=0; i< a.length; i++){
			if(list.contains(a[i]))
				return true;
			list.add(a[i]);
		}
		return false;
	}
}
