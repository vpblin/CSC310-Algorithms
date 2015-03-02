package search;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int computer_guess = 500; 
		int low = 0;
		int high = 1001;
		int user_input = in.nextInt();
		int counter = 1;
		
		while(user_input != 1 && user_input >= 0){
			System.out.println("Computer guesses: " + computer_guess);
			System.out.println("Is it too low? 0, equal 1 or too high 2?");
			user_input= in.nextInt();
			if(user_input == 2){
				high = computer_guess;
				computer_guess = (low + computer_guess) /2;
				counter ++;
			}else if(user_input == 0){
				low = computer_guess;
				computer_guess = (high + computer_guess) /2;
				counter ++;
			}else if(high == low){
				break;

			}else{
				break;
			}

		}
		System.out.println("Congratulations computer, you found it in " + counter + "steps");

		
	}

}
