
public class Program_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="veerababu panasa";
		
		//char[] ch=s.toCharArray();
		
		String[]s1=s.split(" ");
		
		String rev="";
		
		
		
		
		for(int i=s1.length-1;i>=0;i--) {
			
			rev=rev+s1[i]+" ";
			
		}
		
		System.out.println(rev);

	}

}
