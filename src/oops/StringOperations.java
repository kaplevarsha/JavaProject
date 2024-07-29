package oops;

public class StringOperations {

	public String ReverseString(String str1) {

		String result = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			result = result + str1.charAt(i);
		}

		return result;
	}

	public boolean isPalindrome(String str1) {

		String result = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			result = result + str1.charAt(i);
			// System.out.println(result);

		}
		System.out.println(result);
		
	// String str1=RevReverseString(String str1);

		if (str1.equalsIgnoreCase(result)) {
			return true;
		}

		else
			return false;

	}

}
