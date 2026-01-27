

public class Program_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,15,20,25,5,30,45,65};
		
		int temp;
		
		for(int i=0;i<=arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					
					arr[i]=arr[j];
					
					arr[j]=temp;
					
					
			}
				
		}
			
			System.out.println(arr[i]);
			
	
		}
		
		System.out.println(arr[arr.length-3]);
		
}

}
