package studystuff_interview_questions_all;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class HackerRankQuestion3 

{
    public static void main(String args[] ) throws Exception 
    
    {
       System.out.println("Please enter a number, till which you want to check the result");
        Scanner s = new Scanner(System.in);
        double N = s.nextDouble();

        for (int i=1;i<=N;i++) 
        {
            if(i%3==0 && i%5==0)
            System.out.println("FizzBuzz");
            else if(i%3==0)
            System.out.println("Fizz");
            else if(i%5==0)
            System.out.println("Buzz");
            else
            System.out.println(i);
        }
        

        
    }
}