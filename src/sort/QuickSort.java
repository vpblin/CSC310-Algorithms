package sort;

public class QuickSort
{
	  public static int counter;
	  public static double  comparisons;

	public static void main(String[] args){
		int TOTAL = 1001;  						//This is the biggest array that is generated
		int ALLNS[] = new int[TOTAL];  			//Store how many numbers we are sorting
		int ALLCOMPARISONS[] = new int[TOTAL]; 	// Store the comparisons required for that many numbers
		
				for(int bigI= 1; bigI < TOTAL; bigI++){ 
					ALLNS[bigI] = bigI;							//Store how many numbers are sorted
					int newElement;								//Run Insertion Sort Algorithm
					int N = bigI;
					int list[] = new int[N];
					int location;
					comparisons = 0;    //Forloop that goes from 0 to TOTAL 

				           
				      sort(N);
					ALLCOMPARISONS[bigI] = (int) comparisons;	//Store comparisons

				}
				
				GenerateCsv generator = new GenerateCsv("QuickSort", ALLNS, ALLCOMPARISONS);		//Write results on a CSV file
				generator.generateCsvFile();													//Write 'em

	}

	   public static void sort(int len)
	   {
	      int[] list = new int[len];
	      for (int i = 0; i < list.length; i++){
	    	  list[i] = (int)(Math.random() * len);
	         if (i % 2 == 0){
	            list[i] = -list[i];
	         }
	      }
	      quicksort(list, 0, list.length - 1);

	   }

   public static void swap(int[] list, int i, int j){
      int temp = list[i];
      list[i] = list[j];
      list[j] = temp;
   }

   public static void quicksort(int[] list, int left, int right){
	   //This is the first time I have used a bit shifter in Java! 
      int pivot = list[(left + right) >> 1];
      int i = left;
      int j = right;
      while (i <= j){
    	  comparisons ++;
         while (list[i] < pivot){
            i++;
      	  comparisons ++;
         }
         while (list[j] > pivot){
            j--;
     	  comparisons ++;
        }

         if (i <= j){
            swap(list, i++, j--);
        	  comparisons ++;
         }
      }
      if (left < j){
         quicksort(list, left, j);
      }
      if (i < right){
         quicksort(list, i, right);
      }
   }


}