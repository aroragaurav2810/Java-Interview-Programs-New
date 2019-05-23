package studystuff_interview_questions_data_structure;

import java.util.LinkedList;


public class FirstAndLastElementInLinkedList {
   public static void main(String[] args) {
	   FirstAndLastElementInLinkedList obj=new FirstAndLastElementInLinkedList();
      LinkedList<String> loc = new LinkedList<String>();
      loc.add("100");
      loc.add("200");
      loc.add("300");
      loc.add("400");
      loc.add("500");
      System.out.println("First element of LinkedList is : " + loc.getFirst());
      System.out.println("Last element of LinkedList is : " + loc.getLast());
      
   }
}


// NOTE: functions getFirst() and getLast() only available in LinkedList DS but not in
// List and ArrayList DS because of LinkedList Sorting Capability


