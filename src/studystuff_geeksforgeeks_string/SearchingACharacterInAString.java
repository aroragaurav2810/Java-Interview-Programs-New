package studystuff_geeksforgeeks_string;

public class SearchingACharacterInAString

{
	
	// Here we are using 4 functions of str:
	// 1. indexOf(char c): This function is used to get the index of passed character
	// 2. lastindexOf(char c): This function is used to get the index of passed character but it start searching from backward
	// 3. indexOf(char c, int index): This function is used to get the index of passed character which comes after the passed index 
	// NOTE: If charcater does not found then it returns -1 in all 3 points above
	// 4. charAt(int indexNumber): This function is used to get the character of passed index. e.g: char character_val=str.charAt(0);
	// NOTE: By charAt function, you can get the surrogate as well i.e. the ascii code of a character. e.g: int asciicode=str.charAt(0);
	public static void main (String[] args)
	  {
	    // This is a string in which a character to be searched.
	    String str = "GeeksforGeeks is a computer science portal";
	 
	    // Returns index of first occurrence of character.
	    int firstIndex = str.indexOf('s');
	    System.out.println("First occurrence of char 's'" + " is found at : " + firstIndex);
	 
	    // Returns index of last occurrence specified character.
	    int lastIndex = str.lastIndexOf('s');
	    System.out.println("Last occurrence of char 's' is" + " found at : " + lastIndex);
	 
	    // Index of the first occurrence of specified char
	    // after the specified index if found.
	    int first_in = str.indexOf('s', 10);
	    System.out.println("First occurrence of char 's'" + " after index 10 : " + first_in);
	 
	    int last_in = str.lastIndexOf('s', 20);
	    System.out.println("Last occurrence of char 's'" +" after index 20 is : " + last_in);
	 
	    // gives ASCII value of character at location 20
	    int char_at = str.charAt(20);
	    System.out.println("Character at location 20: " + char_at);
	 
	    
	  }

}
