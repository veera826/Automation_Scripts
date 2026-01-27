package Programes;

public class Reverse_word_With_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {10, 20, 30, 10, 20, 40, 10,10,20};

        int n = arr.length;

        // Create a boolean array to track printed duplicates
        boolean[] printed = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (printed[i]) continue; // already counted

            int count = 0;

            // Count duplicates after first occurrence
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    printed[j] = true; // mark as counted
                }
            }

            // Print duplicates (exclude first occurrence)
            for (int k = 0; k < count; k++) {
                System.out.println(arr[i]);
            }
        }

	}

}
