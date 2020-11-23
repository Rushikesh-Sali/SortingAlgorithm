package sortingalgorithm;

public class BubbleSort {
	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
				}
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
		BubbleSort obj = new BubbleSort();
		int arr[] = {10,30,20,25,22,100,90};
		obj.sort(arr);
		System.out.println("Sorted array");
		obj.print(arr);

	}

	

	

}
