package search;

public class seach101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos;
		int comps = 0;
		int N = 100;
		int key = 0;
		int list[] = new int [100];
		
		for( int i = 0; i < N; i++){
			list[i] = i * 2;
		}
		for(key = 0; key < N; key++){
			for(pos = 0; pos < N; ++pos){
				++comps;
				
				if(key == list[pos]){
					break;
				}
				++comps;

				if(key < list[pos]){
					break;
				}
			}
		}
		
		System.out.println("Average" + (float)comps / ( N));
			
	}

}
