
public class program_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="veerababu panasa";
		
		String[] s1=s.split(" ");
		
		String s2="";
		
		
	for(int i=s1.length-1;i>=0;i--) {
		
		String word=s1[i];
		
		String rev="";
		
		 for (int j = word.length() - 1; j >= 0; j--) {
			 
			 rev += word.charAt(j);
		
	}
		 
		 s2 += rev + " ";
	}
	
	System.out.println(s2.trim());

}
}



