
import java.util.HashMap;

public class frequency_characters {

	public static void main(String[] args) {
		
		String s="veera babu";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for(char ch1: ch ) {
			
			if(ch1==' ') 
				
				continue;
			
		
			
			   // Check if the character is not a space
	                if (hm.containsKey(ch1)) {
	                    hm.put(ch1, hm.get(ch1) + 1); // Use 'ch1' instead of 'ch'
	                } else {
	                	
	                    hm.put(ch1, 1); // Use 'ch1' instead of 'ch'
	                    
	                }
	            }
			
		
		
		
		System.out.println(hm);
		
		
			
		
			
		
		
	
	}

}
