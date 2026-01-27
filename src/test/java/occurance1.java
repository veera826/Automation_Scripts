
public class occurance1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 10, 20, 30, 40, 10,10,30};

        for (int i = 0; i < arr.length; i++) {

            boolean duplicateFoundLater = false;

            // check if this element appears again
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    duplicateFoundLater = true;
                    break;
                }
            }

            // check if this is NOT printed already
            boolean printedEarlier = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    printedEarlier = true;
                    break;
                }
            }

            if (duplicateFoundLater && !printedEarlier) {
                System.out.println(arr[i]);
            }
        }
    }
}
