package sort;
//Blin K
//Bubble sort
public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TOTAL = 1001;  						//This is the biggest array that is generated
		int ALLNS[] = new int[TOTAL];  			//Store how many numbers we are sorting
		int ALLCOMPARISONS[] = new int[TOTAL]; 	// Store the comparisons required for that many numbers
		
				for(int bigI= 0; bigI < TOTAL; bigI++){ 		//Forloop that goes from 0 to TOTAL 
					ALLNS[bigI] = bigI;							//Store how many numbers are sorted
					int newElement;								//Run Bubble Sort Algorithm
					int N = bigI;
					int comparisons = 0;						
					int random_list [] = new int[N];
					int numberOfPairs = N;
					boolean swappedElements = true;
					for(int i = 0; i < N; i++){
						random_list[i] = (int) (Math.random() * 100);;
					}
					while(swappedElements){
						numberOfPairs = numberOfPairs -1;
						swappedElements = false;
						for(int i = 0; i < numberOfPairs; i++){
							comparisons ++;
							if(random_list[i] > random_list[i+1]){
								int tmp = random_list[i];
								comparisons ++;				//Count each swap , edited

								random_list[i] = random_list[i+1];
								random_list[i+1] = tmp;
								comparisons ++;				//2 swaps happened , edited

								swappedElements=true;
							}
						}
					}
					ALLCOMPARISONS[bigI] = (int) comparisons;	//Store comparisons
				}
				GenerateCsv generator = new GenerateCsv("bubble", ALLNS, ALLCOMPARISONS);		//Write results on a CSV file
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
