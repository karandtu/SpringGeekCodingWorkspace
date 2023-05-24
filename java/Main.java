
public class Main {

	//writing and checking if method takes a string and 
	//returns whether a given string is palindrome.
	
	 public static boolean isMyStringPalindrome(String givenString) {
		 
		//initializing a string and checking for palindromeString
		 String myString = "";
		 String palindromeString="";
		 boolean conditionToCheck = false;
		 //Looping throughout the length and checking each character by character.
		for(int i = (givenString.length() -1);i >=0; i--) {
			palindromeString+= givenString.charAt(i);
		}
		
		//checking if the string were equal
		if(givenString.equals(palindromeString)) {
			conditionToCheck = true;
		}
		return conditionToCheck;
	}
	 
	 //checking in my local main method whether it is working
	 public static void main(String args[]) {
		 String givenString ="aba";
		givenString.toLowerCase();
		boolean conditionChecking = isMyStringPalindrome(givenString);
		System.out.println(conditionChecking);
		 
	 }
}
