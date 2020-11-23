package sortingalgorithm;

public class SelectionSort {
private void sort(int[] arr) {
		// TODO Auto-generated method stub
	for(int i = 0 ; i<arr.length-1;i++) {
		int min_index = i;
		for(int j =i+1;j<arr.length;j++) {
			if(arr[j]<arr[min_index]) {
				min_index=j;
				
			}
		}
		int temp = arr[min_index]; 
        arr[min_index] = arr[i]; 
        arr[i] = temp;
	}
	
		
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
		SelectionSort obj = new SelectionSort();
		int arr[] = {10,30,20,25,22,100,90};
		obj.sort(arr);
		System.out.println("Sorted array");
		obj.print(arr);
		

	}


	

}
