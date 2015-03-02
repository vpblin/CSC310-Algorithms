import java.util.Random;
import java.util.Scanner;


public class radom {

	public static void main(String[] args) {
		
		Random rn = new Random();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int counts[] = new int[9];
		int die1[] = new int[5];
		int die2[] = new int[5];

		for(int i = 0; i < N; ++i){
			int n = rn.nextInt(5);
			int n2 = rn.nextInt(5);
			int n3 = rn.nextInt(5);
			int n4 = rn.nextInt(5);
			if(n < n2){
				++counts[0];
			}else if(n == n2) ++counts[1];
			else ++counts[2];

		}
		for(int i = 0; i < 3; i++){
			System.out.println((counts[i]) / (double)N);
		}
	}
}
