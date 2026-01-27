package Programes;

public class Program_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="VeeraBabU";
		
		String s1="";
		
		String s2="";
		
		
		
	
		
		for(int i=0;i<=s.length()-1;i++) {
			
			 char c = s.charAt(i);
			 
			 if(c>='a' && c<='z') {
				 
				 s1=s1+c;
				 
				 
			 }else {
				 
				 s2=s2+c;
			 }
		
		}
		
		System.out.println(s1);
		
		System.out.println(s2);
		

	}

}
