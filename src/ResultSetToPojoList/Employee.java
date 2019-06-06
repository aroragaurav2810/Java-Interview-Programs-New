package ResultSetToPojoList;

import java.util.Date;

public class Employee 

	{
	
		String FIRST_NAME;
		String LAST_NAME;
		long AGE;
		double SALARY;
		Date JOINING_DATE;
		
		
		public String getFIRST_NAME() {
			return FIRST_NAME;
		}
		public void setFIRST_NAME(String FIRST_NAME) {
			this.FIRST_NAME = FIRST_NAME;
		}
		public String getLAST_NAME() {
			return LAST_NAME;
		}
		public void setLAST_NAME(String LAST_NAME) {
			LAST_NAME = LAST_NAME;
		}
		public long getAGE() {
			return AGE;
		}
		public void setAGE(long AGE) {
			this.AGE = AGE;
		}
		public double getSALARY() {
			return SALARY;
		}
		public void setSALARY(double SALARY) {
			this.SALARY = SALARY;
		}
		public Date getJOINING_DATE() {
			return JOINING_DATE;
		}
		public void setJOINING_DATE(Date JOINING_DATE) {
			this.JOINING_DATE = JOINING_DATE;
		}
		
		
		@Override
		public String toString() {
			return "Student [FIRST_NAME=" + FIRST_NAME + ", LAST_NAME="
					+ LAST_NAME + ", AGE=" + AGE + ", SALARY=" + SALARY
					+ ", JOINING_DATE=" + JOINING_DATE + "]";
		}
		

		
		
		

}
