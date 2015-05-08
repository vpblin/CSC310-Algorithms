package finite_automatas;

import java.util.Scanner;

public class FiniteAutomata_Assignment11_problem1pg176 {
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 100; i ++){
			int state = 1;

			System.out.println("String automata");
			int current_char = 1;
			String input = in.next();

		while(current_char < input.length()){
			
			char input_char = input.charAt(current_char);
			current_char ++;
			switch(state){
				case 1:
					switch(input_char){
						case 'a':
							state = 2;
						break;
					}
				break;
				case 2:
					switch(input_char){
						case 'a':
							state = 3;
						break;
						case 'b':
							state = 4;
						break;
					}
				break;
				case 3:
					switch(input_char){
						case 'a':
							state = 3;
						break;
						case 'b':
							state = 4;
						break;
					}
				break;
				case 4:
					switch(input_char){
						case 'b':
							state = 5;
						break;
					}
				break;
				case 5:
					switch(input_char){
						case 'a':
							state = 4;
						break;
					}
				break;

			}
			System.out.println(input_char + " "+ state);

		}
		
		if(state ==1){
			System.out.println(input + "Accepted. End state was " + state);
			
		}else{
			System.out.println(input + "Not Accepted. End state was " + state);
		}
		}
	}
}
