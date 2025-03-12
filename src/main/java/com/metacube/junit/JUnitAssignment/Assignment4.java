package com.metacube.junit.JUnitAssignment;

import java.util.Scanner;


public class Assignment4 {
	public static void main(String[] args) {
		ArrOperation AO=new ArrOperation();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Array Operation");
		System.out.println("\nChoose 1:- To return Largest mirror section found in the input array. ");
		System.out.println("Choose 2:-Return the number of clumps in the input array. ");
		System.out.println("Choose 3:-Solve fixXY problem ");
		System.out.println("Choose 4:-Return Index of SPlit Array");
		int choose=sc.nextInt();
		sc.nextLine();
		switch(choose) {
		case 1:
			System.out.println("Enter Length of the array");
			int n=sc.nextInt();
			int [] arr=new int [n];
			System.out.println("Enter the array");
			for(int i=0;i<n;i++) {
				System.out.println("Enter the Element "+i);
				arr[i]=sc.nextInt();
			}
			try {
			System.out.println("Result: "+AO.MaxMirror(arr));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case 2:
			System.out.println("Enter Length of the array");
			int n2=sc.nextInt();
			int [] arr2=new int [n2];
			System.out.println("Enter the array");
			for(int i=0;i<n2;i++) {
				System.out.println("Enter the Element "+i);
				arr2[i]=sc.nextInt();
			}
			try {
				System.out.println("Result:"+AO.CountClumps(arr2));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			
			break;
		case 3:
			System.out.println("Enter the value of x");
			int x=sc.nextInt();
			System.out.println("Enter the value of y");
			int y=sc.nextInt();
			System.out.println("Enter Length of the array");
			int n3=sc.nextInt();
			int [] arr3=new int [n3];
			System.out.println("Enter the array");
			for(int i=0;i<n3;i++) {
				System.out.println("Enter the Element "+i);
				arr3[i]=sc.nextInt();
			}
			System.out.println("Result Array:");
			try {
				arr3=AO.fixXY(x, y, arr3);
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			for(int i=0;i<arr3.length;i++) {
				System.out.println(arr3[i]);
			}
			break;
		case 4:
			System.out.println("Enter Length of the array");
			int n4=sc.nextInt();
			int [] arr4=new int [n4];
			System.out.println("Enter the array");
			for(int i=0;i<n4;i++) {
				System.out.println("Enter the Element "+i);
				arr4[i]=sc.nextInt();
			}
			try {
			System.out.println("Result:"+AO.CountClumps(arr4));
			}catch(AssertionError e) {
				System.out.println(e.getMessage());
			}
			break;
		default:
			System.out.println("Please Enter the Valid Input");
		}
	}
}
