package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements of array: ");
		int i=0;
		while(i<size) {
			a[i]=sc.nextInt();
			i++;
			}
		Sort(a);
		System.out.println("Sorted array: ");
		for(int n: a) {
			System.out.print(n+" ");
		}
	
		
	}
	
		static void Sort (int x[]) {
			
			for(int j=1;j<x.length;j++) {
				int key=x[j];
				int i=j-1;
				
				while(i>=0 && x[i]>key) {
					x[i+1]=x[i];
					i--;
				}
				x[i+1]=key;
				
			}
			
		}

}
