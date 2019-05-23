package studystuff_reflection;

public class newInstanceMethodOfclassConstructorAndClass 

{
	// Syntax: public T newInstance()throws InstantiationException,IllegalAccessException
	// The newInstance() is a generic method of Class class and Constructor class is used to create a new instance of the class.

	// The newInstance() generic method of Class class can invoke zero-argument constructor whereas 
	// newInstance() generic method of Constructor class can invoke any number of arguments. So Constructor class is preferred over Class class.

	public static void main(String[] args) throws Exception 
	
	{
		  
			  Class c=Class.forName("studystuff_reflection.Simple1");  
			  Simple1 s1=(Simple1) c.newInstance();  
			  s1.message();  
			
			  Simple1 s11=new Simple1();  
			  s11.message();  
			  //javap java.lang.Object; 
			

	}

}


class Simple1{  
	 void message(){System.out.println("Hello Java");}  
	}  
	  
	