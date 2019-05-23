package studystuff_interview_questions_all;

import java.util.Arrays;

public class HashTest {
    
    private String str;
    
    public HashTest(String str) {
        this.str = str;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
        
    public static void main(String args[]) {
       
    	HashTest h1 = new HashTest("2");        
       System.out.println("value of h1 is "+h1);
    	String s1 = new String("1");        
        
        Object arr[] = new Object[2];
        arr[0] = h1;
        arr[1] = s1;
      //  Arrays.sort(arr);
        System.out.println(arr[0]);
       System.out.println(arr[1]);
         
        /*for (Object o : arr) {
            System.out.print(o + " ");
        }*/
    }
}