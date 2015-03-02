package sort;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 100;
		int random_list [] = new int[N];
		int numberOfPairs = N;
		boolean swappedElements = true;
		for(int i = 0; i < N; i++){
			random_list[i] = (int) (Math.random() * 100);;
		}
		printList(random_list);
		while(swappedElements){
			numberOfPairs = numberOfPairs -1;
			swappedElements = false;
			for(int i = 0; i < numberOfPairs; i++){
				if(random_list[i] > random_list[i+1]){
					int tmp = random_list[i];
					random_list[i] = random_list[i+1];
					random_list[i+1] = tmp;
					swappedElements=true;
				}
			}
		}
		
		printList(random_list);

		
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
