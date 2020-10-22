package com.io;

public class Fibonacci {
	static int sum = 0;

	public static void main(String[] args) {
		fibo(0,1,56);
	System.out.println(reverse(12367));
	 }
private static int reverse(int n) {
		if(n == 0) 
			return 0;
		sum = sum * 10 + n % 10;
		reverse(n/10);
		return sum;
	}
public static void fibo(int f0, int f1,int n){
			if(n < f0+f1)
				return;
			
			else{
						if(f0 == 0)
								System.out.print(f0 + " " + f1 + " ");
			   			System.out.print((f0+f1) + " ");
						fibo(f1,f0+f1,n);
			}
				
		}
	}


