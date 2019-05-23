package studystuff_interview_question_datastructure;

/*methods of Queue are:

1. peek()- retrieves the first element without deleting/removing it from queue, Also it returns null if no element is present in queue 
2. element()- retrieves the first element without deleting/removing it from queue, Also it throws "NoSuchElementException" if no element is present in queue
3. poll()- retrieves the first element and then delete/remove it from queue, Also it returns null if no element is present in queue
4. remove()- retrieves the first element and then delete/remove it from queue, Also it throws "NoSuchElementException" if no element is present in queue

*/

public class ImplementAStack 

{

	static int max_size;
	static int stack_array[];
	static int top;
	public ImplementAStack(int stack_size)
	{
		max_size=stack_size;
		stack_array=new int[max_size];
		top=-1;
		
	}
	
	
	
	public void push(int stack_element)
	{
		stack_array[++top]=stack_element;
	}
	
	
	public int pop()
	{
		return stack_array[top--];
	}
	
	public int peek()
	{
		return stack_array[top];
	}
	
	public boolean isEmpty() 
	{
	    return (top == -1);
	}
	
	
	public static void main(String[] args)
	
	
	{
	
		
			  ImplementAStack theStack=new ImplementAStack(10);
			  
			  theStack.push(10);
		      theStack.push(20);
		      theStack.push(30);
		      theStack.push(40);
		      theStack.push(50);
		      
		      System.out.println(stack_array[0]);
		      System.out.println(stack_array[1]);
		      System.out.println(stack_array[2]);
		      System.out.println(stack_array[3]);
		      System.out.println(stack_array[4]);
		      
		      System.out.println("value of top is "+ top);
		      
		      while(! theStack.isEmpty())
		      {
		    	  int value=theStack.pop();
		      System.out.println(value);
		      System.out.print("");
		      
		      }
		      
		     
		      
				

	}

}
