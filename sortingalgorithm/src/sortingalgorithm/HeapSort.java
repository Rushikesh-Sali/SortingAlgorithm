package sortingalgorithm;

public class HeapSort {

private void sort(int[] arr) {
		// TODO Auto-generated method stub
	int n = arr.length;
	 
    
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(arr, n, i);

   
    for (int i = n - 1; i > 0; i--) {
      
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        
        heapify(arr, i, 0);
    }
	}
	
private void heapify(int[] arr, int n, int i) {
	// TODO Auto-generated method stub
	int largest = i;
    int l = 2 * i + 1; 
    int r = 2 * i + 2; 

    
    if (l < n && arr[l] > arr[largest])
        largest = l;

   
    if (r < n && arr[r] > arr[largest])
        largest = r;

   
    if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;

       
        heapify(arr, n, largest);
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
		HeapSort obj = new HeapSort();
		int arr[] = {10,30,20,25,22,100,90};
		obj.sort(arr);
		System.out.println("Sorted array");
		obj.print(arr);

	}

	
}
