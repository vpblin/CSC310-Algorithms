package sort;
//Blin Kazazi
public class Shell_Sort {
	static int TOTAL = 11;  						//This is the biggest array that is generated
	static int ALLNS[] = new int[TOTAL];  			//Store how many numbers we are sorting
	static int ALLCOMPARISONS[] = new int[TOTAL]; 	// Store the comparisons required for that many numbers
	static double comparisons = 0;
	static int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int N = 0; N < TOTAL; N++){
			ALLNS[N] = N;							//Store how many numbers are sorted
			comparisons = 0;
			doSort((int)Math.pow(2,N));
		}
		GenerateCsv generator = new GenerateCsv("shell_sort2", ALLNS, ALLCOMPARISONS);		//Write results on a CSV file
		generator.generateCsvFile();													//Write 'em

		
	}
	
	
	public static void doSort(int N){
		int list [] = new int [N];
		for(int i = 0; i < N; i++){
			list[i] =(int)( Math.random() * 100);
		}
		printList(list);

		list = shell_sort(list, list.length);
		System.out.println("Sorted");
		printList(list);

	}
	public static int[] shell_sort(int[] list, int N) {
		int passes = (int) (Math.log(N)/Math.log(2));
		while (passes >= 0){
			int increment = (int) Math.pow(2, passes) -1;
			for(int start =0; start<= increment; start++){
				list = InsertionSort(list, N, start, increment);
			}
			passes = passes - 1;
		}
		ALLCOMPARISONS[counter] = (int) comparisons;	//Store comparisons
		counter ++;
		return list;
	
	}
	public static int[] InsertionSort(int[] list, int N, int start, int increment) {
		for(int i = start; i < N; i++){
			int newElement = list[i];
			comparisons ++;							//Increment comparisons
			int location = i- increment;
			while(location >=0 && list[location] > newElement){
				list[location + increment] = list[location];
				location = location - increment;
				comparisons ++;					//Increment comparisons
			}
			list[location+ increment] = newElement;
		}
		return list;
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
