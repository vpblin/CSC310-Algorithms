package sort;
//Blin Kazazi
 
 
public class Mergesort {
	  private static int[] numbers;
	  private static int[] helper;
 
	  private static int number;
	  public static int counter;
	  public static double  comparisons;
	  public static void main(String[] args){
			int TOTAL = 1001;  						//This is the biggest array that is generated
			int ALLNS[] = new int[TOTAL];  			//Store how many numbers we are sorting
			int ALLCOMPARISONS[] = new int[TOTAL]; 	// Store the comparisons required for that many numbers
			
					for(int bigI= 0; bigI < TOTAL; bigI++){ 
						ALLNS[bigI] = bigI;							//Store how many numbers are sorted
						int newElement;								//Run Insertion Sort Algorithm
						int N = bigI;
						int list[] = new int[N];
						int location;
						comparisons = 0;    //Forloop that goes from 0 to TOTAL 

							for(int i = 0; i < N; i++){
								list[i] =(int)( Math.random() * 100);
							}
							printList(list);
							sort(list);
							printList(list);
						ALLCOMPARISONS[bigI] = (int) comparisons;	//Store comparisons
					
					}
					GenerateCsv generator = new GenerateCsv("MergeSort", ALLNS, ALLCOMPARISONS);		//Write results on a CSV file
					generator.generateCsvFile();													//Write 'em

	  }
	  

	  public static void sort(int[] values) {
	    numbers = values;
	    number = values.length;
	    helper = new int[number];
	    mergesort(0, number - 1);
	  }
 
	  private static void mergesort(int low, int high) {
	    // check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = low + (high - low) / 2;
	      // Sort the left side of the array
	      mergesort(low, middle);
	      // Sort the right side of the array
	      mergesort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);
	    }
	  }
 
	  private static void merge(int low, int middle, int high) {
 
	    // Copy both parts into the helper array
	    for (int i = low; i <= high; i++) {
	      helper[i] = numbers[i];
	    }
 
	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    // Copy the smallest values from either the left or the right side back
	    // to the original array
	    while (i <= middle && j <= high) {
	      if (helper[i] <= helper[j]) {
	        numbers[k] = helper[i];
	        i++;
	      } else {
	        numbers[k] = helper[j];
	        j++;
	      }
	      k++;
	      counter ++;
	      comparisons ++;
	    }
	    // Copy the rest of the left side of the array into the target array
	    while (i <= middle) {
	      numbers[k] = helper[i];
	      k++;
	      i++;
	      comparisons ++;

	    }
 
	  }
		public static void printList(int[] words){		//printList function is used for debugging. No need for now since we are storing the results in a CSV file
			for(int i = 0; i < words.length; i++){
				if(i % 10 == 0){						//Print 10 numbers then skip a line
					System.out.println("");
				}
				System.out.print(words[i] + "  ");
			}
		}

	}