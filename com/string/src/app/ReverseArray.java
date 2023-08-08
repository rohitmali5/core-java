package com.string.src.app;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 50;
		a[2] = 80;
		a[3] = 5;
		a[4] = 1;
		for(int i = 0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		for(int i =a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
	

	}

}
