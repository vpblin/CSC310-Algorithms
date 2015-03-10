package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AlphabeticalRadix {
	//Declare hashmap as static. accessed from multiple functions and never changes
	static HashMap<String, Integer> hash;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		int list [] = new int [10];
		//Generate alphabet string and store the location of the letter on a hash map
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		//words to be sorted
		String words[]= {
			"zero",
			"one",
			"two",
			"three",
			"four",
			"five",
			"six",
			"seven",
			"eight",
			"nine",
			"ten",
			"eleven",
			"twelve",
			"thirteen",
			"fourteen",
			"fifteen",
			"sixteen",
			"seventeen",
			"eighteen",
			"nineteen",
			"twenty"};
		// the hash
		hash = new HashMap<>();
		for(int i = 0; i < alphabet.length(); i++){
			hash.put(alphabet.charAt(i)+"", i);
		}
		
		//print list
		printList(words);
		//sort using my radix. source code not taken from the book, but from the algorithm we implemented in class
		words = my_radix(words);
		//print sorted list
		printList(words);

	}
	
	public static String[] my_radix(String [] list){
		//oh boy ....
		//declare tmp array that stores linkedlists
		LinkedList tmp [] = new LinkedList [36];
		//declare all of them to avoid the annoying null pinters
		for(int i = 0; i < tmp.length; i++){
			tmp[i] = new LinkedList();
		}
		//calculate keySize by finding the longest string
		int keySize = 0;
		for(int i = 0; i < list.length; i ++){
			if(list[i].length() > keySize){
				keySize = (list[i]).length();
			}
		}
		//setup a counter
		int i = 0;
		//I had to declare a tmp array to make the algorithm easier to implemet. TO-DO: deprecate
		String[] tmp_list= new String [list.length];
		do{
			//reset the tmp array every time. 
			tmp_list= new String [list.length];

			//get the position of the font by looking at the hashmap. store it as digit
			for(int j = 0; j < list.length; j++){
				int digit = hash.get(list[j].charAt((int) (Math.pow(10, i) % 10))+ "");
				//add the character to tmp. be careful with char and String conversions
				tmp[digit].add(list[j]);
			}
			int counter = 0;
			for(int m = 0; m < 26; m++){
				//this is a sign of uncertainty ... 
				while(!tmp[m].isEmpty()){
					tmp_list[counter] = (String) tmp[m].getFirst();
					//Why doesnt getFirst removeFirst? Sun engineers :( 
					tmp[m].removeFirst();
					counter++;
				}
			}
			list = tmp_list;
			i ++;

		}while(i <= keySize);
		//this should be sorted
		return list;
	}
	

	public static void printList(String[] words){		//printList function is used for debugging. No need for now since we are storing the results in a CSV file
		for(int i = 0; i < words.length; i++){
			if(i % 10 == 0){						//Print 10 numbers then skip a line
				System.out.println("");
			}
			System.out.print(words[i] + "  ");
		}
	}
	

	
}
