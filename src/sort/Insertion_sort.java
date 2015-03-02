package sort;
//Blin K
//Insertion sort algorithm
public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TOTAL = 1001;  						//This is the biggest array that is generated
		int ALLNS[] = new int[TOTAL];  			//Store how many numbers we are sorting
		int ALLCOMPARISONS[] = new int[TOTAL]; 	// Store the comparisons required for that many numbers
		
				for(int bigI= 0; bigI < TOTAL; bigI++){ 		//Forloop that goes from 0 to TOTAL 
					ALLNS[bigI] = bigI;							//Store how many numbers are sorted
					int newElement;								//Run Insertion Sort Algorithm
					int N = bigI;
					int list[] = new int[N];
					int location;
					double comparisons = 0;
					
					for(int i = 1; i < N; i++){
						list[i] = N - i;
					}
					
					for(int i = 0; i < N; i++){
						newElement = list[i];
						comparisons ++;							//Increment comparisons
						location = i -1;
						while(location >= 0 && list[location] > newElement){
								list[location + 1] = list[location];
								location = location -1;
								comparisons ++;					//Increment comparisons
			
						}
						list[location + 1] = newElement;
					}
					ALLCOMPARISONS[bigI] = (int) comparisons;	//Store comparisons
				}
				GenerateCsv generator = new GenerateCsv("mylist", ALLNS, ALLCOMPARISONS);		//Write results on a CSV file
				generator.generateCsvFile();													//Write 'em
				
	}
	
	public static void printList(int list[]){		//printList function is used for debugging. No need for now since we are storing the results in a CSV file
		for(int i = 0; i < list.length; i++){
			if(i % 10 == 0){						//Print 10 numbers then skip a line
				System.out.println("");
			}
			System.out.print(list[i] + "  ");
		}
	}

}
