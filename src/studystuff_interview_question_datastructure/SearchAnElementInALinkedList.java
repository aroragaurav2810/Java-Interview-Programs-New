package studystuff_interview_question_datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SearchAnElementInALinkedList {
   public static void main(String[] args) {
      Set<String> lList = new LinkedHashSet<String>();
      lList.add("1");
      lList.add("2");
      lList.add("3");
      lList.add("4");
      lList.add("5");
      lList.add("2");
      
      System.out.println(lList);
     /* System.out.println("First index of 2 is:"+
      lList.indexOf("2"));
      
      System.out.println("Last index of 2 is:"+ 
      lList.lastIndexOf("2"));*/
   }
}