package Programes;

public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String s="veera babu";
		
		String[] s1=s.split(" ");
		
		
		  String s2="";
		  
		  
		  
		  for(int i=s1.length-1;i>=0;i--) {
		  
		  
		  s2=s2+s1[i]+" ";
		  
		  
		  }
		 
		
		System.out.println(s2);
		
		
		/*
		 * int index = 0;
		 * 
		 * for (int i = s1.length - 1; i >= 0; i--) { System.out.println(s1[i] + " -> "
		 * + index); index++; }
		 */
	}

}
