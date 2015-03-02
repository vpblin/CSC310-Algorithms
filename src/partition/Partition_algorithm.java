package partition;

public class Partition_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		
		for(int i = 0; i < 10; i++){
			arr[i] = (int) (Math.random() * 10);
			//arr[i] = i;
		}
		System.out.println("The array : ");
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i] + "  ");
		}
		
		int partition = partition(arr, 0,9);
		System.out.println();
		System.out.println();

		for(int i = 0; i < 10; i++){
			System.out.print(arr[i] + "  ");
		}

		System.out.println("\nThe partition is: ");
		System.out.println(partition);
	}
	
	
	public static int partition(int arr[], int start, int end){
	    int pivot = arr[(start + end) /2 ]; // where is pivot
	    while (start <= end) {
	        //  element that should be on end
	        while (arr[start] < pivot) start++;
	        //  element that should be on start
	        while (arr[end] > pivot) end--;
	        // Swap elements, and move start and end counters
	        if (start <= end) {
	            swap(arr, start, end); // swaps elements
	            start++;
	            end--;
	        }


	    }
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i] + "  ");
		}

	    return start;
	}
	
	public static int partition2(int arr[], int start, int end){
	    int pivot =(start + end) /2; // where is pivot
	    int temp[] = new int[arr.length];
	    
	    for(int i = 0; i < arr.length; i++){
	    	if (i ==pivot) continue;
	    	if(arr[i] < arr[pivot]){
	    		temp[start]= arr[i];
	    		start++;
	    	}
	    	else{
	    		temp[end] = arr[i];
	    		end--;
	    	}
	    	
	    }
    	temp[start] = arr[pivot];
    	if(start != end){
    		return 11;
    	}

		for(int i = 0; i < 10; i++){
			System.out.print(temp[i] + "  ");
		}


    	return start;

	}
	

	


	private static void swap(int[] arr, int start, int end) {
		int i = arr[start];		
		arr[start] = arr[end];
		arr[end] = i;
	}


}
