package studystuff_generics;

import java.util.ArrayList;
import java.util.List;



class   GenericClass<T> 


{
	
		static private GenericClass b=new GenericClass(); 
		// It is possible because GenericClass is a class.
		// let's comment this for stopping stackoverflowexception or make it static
	    
	    
		//private T a=new T();  // It is not possible because T in not a class, It is just a Generic type of class(GenericClass). 
		// So, to make it possible , GenericClass Object with some given type needs to be created for this and then assign the object of that given type to this reference
	    private T a=null;
		

		public GenericClass getB() 
		{
				return b;
		}

		
		
		public void setB(GenericClass b) 
		{
				this.b = b;
		}



		public T getA() 
		{
				return a;
		}

		public void setA(T a) 
		{
				this.a = a;
		}


		public static void main(String[] args) 
		{
			  
			GenericClass<Integer> obj1 = new GenericClass<Integer>();
			GenericClass<String> obj2 = new GenericClass<String>();
		    
			   
			  obj1.setA(new Integer(10));
			  obj2.setA(new String("Hello World"));

		      System.out.printf("Integer Value :%d\n\n", obj1.getA());
		      System.out.printf("String Value :%s\n", obj2.getA());		      
		 }
		

		
		    
}




 class NonGenericClass 


{
	    
	    
		   private Object o;

		

		   public Object getO() {
			return o;
		}



		public void setO(Object o) {
			this.o = o;
		}



		public static void main(String[] args) 
		{
			NonGenericClass integerBox = new NonGenericClass();
			NonGenericClass stringBox = new NonGenericClass();
		    
		      integerBox.setO(new Integer(10));
		      stringBox.setO(new String("Hello World"));

		      System.out.printf("Integer Value :%d\n\n", integerBox.getO());
		      System.out.printf("String Value :%s\n", stringBox.getO());
		      
		
		      
		 }
		

	
}


 
 class WhyGeneric
 {
	 	//Why use Generic:
		// To flow any type of data with strong type checking as compare to non generic code 
		// example1: non generic code: to flow any type of data to Object Class , that may lead to run time exception, see Below:
		    public void nonGenericCode()
		    {
			List<Object> list = new ArrayList<>();
		    list.add("hello");
		    String s = (String) list.get(0);
		    }
	    // example2: generic code: see below
		    public void genericCode()
		    {
		    	List<String> list = new ArrayList<String>();
		    	list.add("hello");
		    	String s = list.get(0);   // no cast required
		    }
}