package algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		//Array Declared
		int a[]= {12, 23, 33, 21, 23, 66, 65, 78, 89, 22, 82};
		
		//Selection Sort
		for(int i=0;i<a.length-1;i++) {			
				int key=a[i];					
				int pos=i;						
					
			for(int j=i; j<a.length-1;j++) {	
				if(a[j+1]<key) {				
					key=a[j+1];
					pos=j+1;
				}
			}
			
			a[pos]=a[i];
			a[i]=key;
			
		}
		//Output
		System.out.println("Sorted Array:");
		for(int n: a) {
			System.out.print(n+" ");
		}
		

	}

}
