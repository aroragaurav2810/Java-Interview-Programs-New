 package studystuff_interview_questions_all;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class lastfriday {

	public static void main(String[] args) {
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Date dt = new Date();
	    Calendar c = Calendar.getInstance();
	    c.setTime(dt);
	    System.out.println("today : " + sdf.format(dt));
	    
	   
	    while (c.get(Calendar.DAY_OF_WEEK) != 6) {
	    	System.out.println("calender  day of week as "+c.get(Calendar.DAY_OF_WEEK));
	        c.add(Calendar.DATE, -1);
	        
	    }
	    Date lastFri=c.getTime();
	    System.out.println("last fri : "+sdf.format(lastFri));
	   
	    

	    }


	}