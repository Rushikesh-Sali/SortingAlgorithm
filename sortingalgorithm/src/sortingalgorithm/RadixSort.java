package sortingalgorithm;

import java.util.Arrays;

public class RadixSort {
	private void sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		 int m = getMax(arr, n); 
		 
	        for (int exp = 1; m / exp > 0; exp *= 10) 
	            countSort(arr, n, exp); 
	}

    private void countSort(int[] arr, int n, int exp) {
		// TODO Auto-generated method stub
    	int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
  
        
        for (i = 0; i < n; i++) 
            count[(arr[i] / exp) % 10]++; 
  
       
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
       
        for (i = n - 1; i >= 0; i--) { 
            output[count[(arr[i] / exp) % 10] - 1] = arr[i]; 
            count[(arr[i] / exp) % 10]--; 
        } 
  
       
        for (i = 0; i < n; i++) 
            arr[i] = output[i];
	}

	private int getMax(int[] arr, int n) {
		// TODO Auto-generated method stub
		 int mx = arr[0]; 
	        for (int i = 1; i < n; i++) 
	            if (arr[i] > mx) 
	                mx = arr[i]; 
	        return mx; 
	}

	private void print(int[] arr) {
		// TODO Auto-generated method stub
   	 for(int i =0;i<arr.length;i++) {
   		 System.out.print(arr[i]+"  ");
   		 
   	 }
   	 System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadixSort obj = new RadixSort();
		int arr[] = {10,30,20,25,22,100,90};
		int n = arr.length;
		obj.sort(arr,n);
		System.out.println("Sorted array");
		obj.print(arr);
		

	}

}
