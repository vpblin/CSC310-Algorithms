package string_matching;


public class KMP
{
    
    public static void main(String[] args) 
    {    
    	String text = "ACBSJASDKJBASKJDBASDKJBASJKBAJVBASBJVASKJBCASKJBKSADSA";
    	String substring = "JAS";
    	
    	int subLoc = 1;
    	int textLoc = 1;
    	
    	int[] fail = new int[text.length()];
    	fail[1] = 0;
    	for(int i = 2; i < substring.length(); i++){
    		int temp = fail[i - 1];

    		while(temp > 0 && substring.charAt(temp) != substring.charAt(i -1)){
    			temp = fail[temp];

    		}
    		fail[i] = temp + 1;
    	}
    	
    	for(int i = 0; i < fail.length; i ++){
    		System.out.println(i + "   " + fail[i]);
    	}
    	while(textLoc <= text.length() && subLoc <= substring.length()){

    		if(subLoc == 0 || (text.charAt(textLoc-1) == substring.charAt(subLoc-1))){
    			textLoc = textLoc+1;
    			subLoc = subLoc+1;
    		}else{
    			subLoc = fail[subLoc];
    		}
    	}		
    	
    	
    	
    	if(subLoc > substring.length()){
    		 textLoc = textLoc - substring.length();
    		 System.out.println("Text loc");

    		 System.out.println(textLoc);
    	}else{
   		 System.out.println("NO Text loc");

      		 System.out.println(0);
    	}
    	
    }
    
}