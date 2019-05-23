package studystuff_geeksforgeeks_string;

public class ReverseAStringUsingByteArray 
{
	
	// What is byte array:
	// Byte array is used to store bytes from a file/String.
	// Byte array stores data in the for of ascii codes 
	// NOTE: Every byte you store in byte array goes to memory that's why it is not recommended for storing bytes from large files
	public static void main(String[] args) 
	
	{
			String str="GeeksforGeeks";
			
			
			// convert string to byte array:
			byte []  byteArray=str.getBytes();
			System.out.println("How byte array stores data: ");
			for(int j=0;j<=byteArray.length-1;j++)
			{
				System.out.print("\t "+ +byteArray[j]);	
			}
			
			// create a new byte array that stores reverse of byte array:
			byte [] reverse_byteArray = new byte [byteArray.length];
			System.out.println();
			System.out.println("Reverse of byte array:");
			for (int i = 0; i<=byteArray.length-1; i++)
			{
				// This is the best logic in this program
				reverse_byteArray[i] = byteArray[byteArray.length-i-1];
				System.out.print("\t"+reverse_byteArray[i]);
			}
			// Now to print the reverse of string, just put the reverse byte array in string
			System.out.println();
	        System.out.print("Reversed byte array to string is: "+new String(reverse_byteArray));

	}

}
