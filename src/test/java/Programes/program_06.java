package Programes;

public class program_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "veerababu";
	        String result = "";

	        for (int i = 0; i < s.length(); i++) {
	        	
	            char ch = s.charAt(i);

	            if (i % 2 == 0) {
	                result += Character.toUpperCase(ch);
	            } else {
	                result += Character.toLowerCase(ch);
	            }
	        }

	        System.out.println(result);
	    }
		
		
		
	}
	

