

public class Practice_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		 int[] a = {1, 32, 2, 13, 2, 3, 2, 3, 2};

	        for (int i = 0; i < a.length; i++) {
	            int count = 0;

	            // Count how many times a[i] appears
	            for (int j = 0; j < a.length; j++) {
	                if (a[i] == a[j]) {
	                    count++;
	                }
	            }

	            // Print only if it's a duplicate (more than once)
	            if (count > 1) {
	                System.out.print(a[i]);
	            }
	        }
		

	}

}
