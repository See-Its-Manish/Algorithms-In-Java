package algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,8,10,11};
		int b=0; 
		int  l=a.length-1;
		int key=8;
		int pos=0;
		System.out.println("Loop started");
		while(b<=l) {
			int m=(b+l)/2;
			if(a[m]>key) {
				l=m-1;
			}
			else if(a[m]<key) {
				b=m+1;
			}
			else {
				pos=m+1;
				break;
			}
		}
		
		System.out.println("Number is at index: "+ pos);

	}

}
