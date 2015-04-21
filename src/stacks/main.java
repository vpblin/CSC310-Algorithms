package stacks;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Stack s = new Stack();
		s.push(2);
		s.push(6);
		s.push(s.pull()+ s.pull());
		System.out.println(s.pull());

		
		System.out.println(s.toString());

		System.out.println("Welcome to the calculator. Enter 666 to exit");
		String next = in.nextLine();
		while(!next.equals("666")){
			System.out.println(next);

			if(next.contains("+")){
				try{
				s.push(s.pull()+ s.pull());
				}catch(Exception e){
					System.out.println("Dummy");
				}
				
				System.out.println(s.print_latest());
			}else if(next.contains("-")){
				try{
				s.push(s.pull()- s.pull());
			}catch(Exception e){
				System.out.println("Dummy");
			}

				System.out.println(s.pull());

			}else if(next.contains("*")){
				try{
				s.push(s.pull()* s.pull());
			}catch(Exception e){
				System.out.println("Dummy");
			}

				System.out.println(s.print_latest());

			}else if(next.contains("/")){
				try{
				s.push(s.pull()/ s.pull());
			}catch(Exception e){
				System.out.println("Dummy");
			}

				System.out.println(s.print_latest());

			}else if(next.contains("%")){
				try{
				s.push(s.pull()% s.pull());
			}catch(Exception e){
				System.out.println("Dummy");
			}

				System.out.println(s.print_latest());

			}else{
				try{
				s.push(Integer.parseInt(next));
				}catch(Exception e){
					System.out.println("Dummy");
				}

			}
			next = in.nextLine();
		}

		System.out.println(s.toString());

	}

}
