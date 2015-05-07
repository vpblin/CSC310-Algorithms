package string_matching;


public class BM
{
    
    public static void main(String[] args) 
    {    
    	String text = "BACAACACA";
    	String substring = "BACAACA";
    	
    	int textLoc = substring.length();
    	int patternLoc = substring.length();
    	int[] jump = new int[10000];
    	int[] link = new int[10000];
    	int[] slide = new int[10000];
    	for(int i = 0; i < substring.length(); i++){
    		slide[substring.charAt(i)] = substring.length();
    	}
    	for(int i = 0; i < substring.length(); i++){
    		slide[substring.charAt(i)] = substring.length();
    	}

    	for(int i = 1; i < substring.length(); i ++){
    		jump[i] = 2 * substring.length() -1;
    	}
    	int test = substring.length();
    	int target = substring.length() +1; 
    	while(test > 0){
    		link[test] = target;
    		while(target <= substring.length() && substring.charAt(test-1) != substring.charAt(target-1)){
    			jump[target] = Math.min(jump[target], substring.length() - test);
    			target = link[target];
    			
    		}
    		test = test -1;
    		target = target -1;
    	}
    	for(int i = 0; i < target; i ++){
    		jump[i] = Math.min(jump[i], substring.length() + target -1);
    	}
    	
    	int temp = link[target];
    	while(target < substring.length()){
    		while(target < temp){
    			jump[target] = Math.min(jump[target], temp - target + substring.length());
    		}
    	}
    	
    	
    	
    	while(textLoc < text.length() && patternLoc > 0){
    		if(text.charAt(textLoc) == substring.charAt(patternLoc)){
    			textLoc = textLoc -1;
    			patternLoc = patternLoc -1;
    		}else{
    			textLoc = Math.max(text.charAt(textLoc), jump[patternLoc]);
    			patternLoc = substring.length();
    		}
    		
    	}
    	for(int i = 0; i < jump.length; i++){
    		if(jump[i] != 0){
    			System.out.println("JUMP " + i + " " + jump[i]);
    		}
    	}
    	for(int i = 0; i < link.length; i++){
    		if(link[i] != 0){
    			System.out.println("link " + i + " " + link[i]);
    		}
    	}
    	

    	if(patternLoc == 0){
    		System.out.println(textLoc + 1);
    	}else{
    		System.out.println("Nothing");
    	}
    	
    }
    
}