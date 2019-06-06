package studystuff_interview_questions_all;
import java.io.*;
public class SerializedDemo {

   public static void main(String [] args) {
      SerializedClass e = new SerializedClass();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         FileOutputStream fileOut =
         new FileOutputStream("C:\\Users\\gaurav.arora\\Desktop\\employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i) {
         i.printStackTrace();
      }
   }
}