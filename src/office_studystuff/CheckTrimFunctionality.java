package office_studystuff;

public class CheckTrimFunctionality 

{

	public static void main(String[] args) 
	
	{
	
			String value="Gaurav|Arora|    ";
			String value_new=value.trim();
			String arr[]=value_new.split("\\|");
			System.out.println(arr.length);
			System.out.println(arr[0]);
			System.out.println(arr[1]);
	}

}
