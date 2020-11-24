package sortingalgorithm;

public class QuickSort {


	private void sort(int[] arr, int x, int y) {
		// TODO Auto-generated method stub
		int pivot,i,j,temp;
		if(x<y) {
			pivot=x;
			i=x;
			j=y;
			while(i<j)
	        {
	                while((i<y)&&(arr[i]<arr[pivot]))
	                i++;
	                while(arr[j]>arr[pivot])
	                j--;
	                
	                if(i<j)
	                {
	                        temp=arr[i];
	                        arr[i]=arr[j];
	                        arr[j]=temp;
	                }
	        }
	        
	        temp=arr[pivot];
	        arr[pivot]=arr[j];
	        arr[j]=temp;
	        
	       sort(arr,x,j-1);
	       sort(arr,j+1,y);
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
		QuickSort obj = new QuickSort();
		int arr[] = {10,30,20,25,22,100,90};
		obj.sort(arr,0,arr.length-1);
		System.out.println("Sorted array");
		obj.print(arr);
	}

	}
