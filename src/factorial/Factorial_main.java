package factorial;

public class Factorial_main {
	public static int comp;
	public static int assn;
	public static int arith;
	
	public static long facti(int n){
		long fact = 1;
		while(n > 1){
			fact = fact * n;
			--n;
		}
		return fact;
		
	}
	
	public static long factr(int n){
		if(n==1)
			return 1;
		else
			return factr(n-1) * n;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N, factorial, comps, assigns, ariths");
		for(int n =1; n <=20; n++){
			Factorial_main.comp = 0;
			Factorial_main.assn = 0;
			Factorial_main.arith = 0;
			System.out.println(n + ", " + Factorial_main.facti(n) + ", " + Factorial_main.comp + ", " + Factorial_main.arith );		
		}
	
	}

}
