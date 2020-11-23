package sortingalgorithm;

public class InsertionSort {
	private void print(int[] arr) {
		// TODO Auto-generated method stub
		 for(int i =0;i<arr.length;i++) {
    		 System.out.print(arr[i]+"  ");
    		 
    	 }
    	 System.out.println();
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		
    	 for(int i=0;i<arr.length;++i)
 		{
 			int key = arr[i];
 			int j = i-1;
 			while(j >= 0 && arr[j] > key)
 			{
 				arr[j+1]=arr[j];
 				j = j-1;
 				
 			}
 			arr[j+1]=key;
 		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort obj = new InsertionSort();
		int arr[] = {10,30,20,25,22,100,90};
		obj.sort(arr);
		System.out.println("Sorted array");
		obj.print(arr);
	}



}
