package Programes;

public class Remove_repeated_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String s = "veerababu"; String result = "";
		 * 
		 * for (int i = 0; i < s.length(); i++) { char ch = s.charAt(i);
		 * 
		 * // ADD only if character is NOT already in result if (result.indexOf(ch) ==
		 * -1) { result = result + ch; } }
		 * 
		 * System.out.println(result);
		 */
		
		

        String s = "veerababu";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // allowed since no alternative in Java
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    found = true;
                    break;
                }
            }

            
            if (!found) {
                result += ch;
            }
            
            else { // character is duplicate, but avoid adding twice if (duplicates.indexOf(ch) == -1) { duplicates += ch; } } } System.out.println("Duplicates: " + duplicates);
            	
            }
        }

        System.out.println(result);
		
		
		
		
		

	}

}
