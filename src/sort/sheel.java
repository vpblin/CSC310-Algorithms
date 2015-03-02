package sort;

public class sheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		int list [] = new int [N];
		for(int i = 0; i < N; i++){
			list[i] =(int)( Math.random() * 100);
		}
		list = shell(list);

		printList(list);
	}
	public static int[] shell(int[] list) {
		int increment = list.length / 2;
		while (increment > 0) {
			for (int i = increment; i < list.length; i++) {
				int j = i;
				int temp = list[i];
				while (j >= increment && list[j - increment] > temp) {		//insertion sort
					list[j] = list[j - increment];
					j = j - increment;
				}
				list[j] = temp;
			}
			if (increment == 2) {
				increment = 1;
			} else {
				increment *= (5.0 / 11);
			}
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
