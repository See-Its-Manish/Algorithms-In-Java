package algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		//Array Declared
		int a[]= {12, 23, 33, 21, 23, 66};
		
		//Selection Sort
		for(int i=0;i<a.length;i++) {			
				int key=a[i];					
				int pos=i;						
					
			for(int j=i; j<a.length-1;j++) {	
				if(a[j+1]<key) {				
					key=a[j+1];
					pos=j+1;
				}
			}
			
			for(int k=pos;k>i;k--) {
				a[k]=a[k-1];
			}
			a[i]=key;
		}
		//Output
		System.out.println("Sorted Array:");
		for(int n: a) {
			System.out.print(n+" ");
		}
		

	}

}
