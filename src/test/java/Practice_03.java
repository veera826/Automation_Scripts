
public class Practice_03 {
	
	public static void main(String[] args) {
		
		String s="veerababu";
		
		String s2="panasa";
		
		int max;
		
		if(s.length()>s2.length()) {
			
			max=s.length();
			
		}
		else {
			
			max=s2.length();
		}
		
		for (int i = 0; i < max; i++) {
            if (i < s.length()) {
                System.out.print(s.charAt(i)); // Print character from s
            }
            if (i < s2.length()) {
                System.out.print(s2.charAt(i)); // Print character from s2
            }
        }
	}

}
