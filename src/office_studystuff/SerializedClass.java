package office_studystuff;

 public class SerializedClass implements java.io.Serializable
 {
	   public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
}