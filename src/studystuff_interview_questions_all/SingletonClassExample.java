package studystuff_interview_questions_all;

public class SingletonClassExample 

{
	// In order to acheive its target, Singleton class has private Object and private constructor  
  // public static SingletonClassExample myObj;
   
    
   //Create private constructor
   private SingletonClassExample()
   {
        System.out.println("private constructor calling");
   }
   
   
   //Create a static method to get instance.
   
   /*public static SingletonClassExample getInstance()
   {
       if(myObj == null)
       {
           myObj = new SingletonClassExample();
       }
       return myObj;
   }*/
    
   public static void main(String str[])
   {
	   SingletonClassExample obj=new SingletonClassExample();
	   //obj.getInstance();
	   //System.out.println(obj.getInstance());
   }
   
}


// Singleton class is used in order to restrict user in making any of its object outside the class
// To acheive the above target of singleton class, we need to make private constructor only, 
// after this user/programmer can not make any object outside the class
// you can completely avoid the commenting code