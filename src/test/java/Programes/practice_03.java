package Programes;


public class practice_03  {
	
	public static void main(String[] args) {
		
		
	String s= "my name is veera";
	
	String[] s1= s.split(" ");
	
	String s3="";
	
	
	for(int i=s1.length-1;i>=0;i--) {
		
		
		String s2=s1[i];
		
	 String	rev="";
		
		for(int j=s2.length()-1;j>=0;j--) {
			
			rev +=s2.charAt(j);
			
			
			
		}
		
		s3 +=rev+" ";
		
		
	}
	
	
		
		
	
	System.out.println(s3.trim());
		
		
		
}
	
}
