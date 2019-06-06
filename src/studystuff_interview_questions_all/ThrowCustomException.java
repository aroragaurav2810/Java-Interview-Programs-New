package studystuff_interview_questions_all;

public class ThrowCustomException 
{

	
	public String findName(String message) throws CustomExceptionFindByName
	{
		if(message.equals(""))
		{
			throw new CustomExceptionFindByName("custom exception Find By Name");
		}
		else
		{
			
			return message;
		}
			
	}
	
	
	public static void main(String[] args)
	
	{
		ThrowCustomException obj=new ThrowCustomException();
		String str = null;
		try 
		{
			str = obj.findName("");
			System.out.println(str);
		} 
		catch (CustomExceptionFindByName e) 
		{
			
			System.out.println(e);
		}
		
	}

}
