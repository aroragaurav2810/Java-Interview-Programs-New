package studystuff_interview_questions_all;

public class AnonymousClasses

{
	  
    	interface HelloWorld 
    	{
    		public void greet();
    		public void greetSomeone(String someone);
    	}
    
    
    
   public void sayHello() 
   {
     class EnglishGreeting implements HelloWorld
     {
            String name = "world";
            
            public void greet() 
            {
                greetSomeone("world");
            }
            
            public void greetSomeone(String someone) 
            {
                name = someone;
                System.out.println("Hello " + name);
            }
      }
    
     	HelloWorld englishGreeting = new EnglishGreeting();
     	
        HelloWorld frenchGreeting = new HelloWorld() 
        {
             String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld() 
        {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        
}

public static void main(String... args) {
    AnonymousClasses myApp =new AnonymousClasses();
    myApp.sayHello();
}  
}





/*
 
 Syntax of Anonymous Classes

As mentioned previously, an anonymous class is an expression. The syntax of an anonymous class expression is like the invocation of a constructor, except that there is a class definition contained in a block of code.

Consider the instantiation of the frenchGreeting object:

        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

The anonymous class expression consists of the following:

    The new operator

    The name of an interface to implement or a class to extend. In this example, the anonymous class is implementing the interface HelloWorld.

    Parentheses that contain the arguments to a constructor, just like a normal class instance creation expression. Note: When you implement an interface, there is no constructor, so you use an empty pair of parentheses, as in this example.

    A body, which is a class declaration body. More specifically, in the body, method declarations are allowed but statements are not.

Because an anonymous class definition is an expression, it must be part of a statement. In this example, the anonymous class expression is part of the statement that instantiates the frenchGreeting object. (This explains why there is a semicolon after the closing brace.)
 
 
 
 */
