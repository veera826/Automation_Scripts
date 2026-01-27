package Programes;

public class Program_01 {

	public static void main(String[] args) {
		String s = "veerababu123";
        char[] arr = s.toCharArray();

        String letters = "";
        String digits = "";

        for (int i = 0; i < arr.length; i++) {

            char ch = arr[i];

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                letters += ch;
            }
            else if (ch >= '0' && ch <= '9') {
                digits += ch;
            }
        }

        System.out.println(letters);
        System.out.println(digits);
	}

}

