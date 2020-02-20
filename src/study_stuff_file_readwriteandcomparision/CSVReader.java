package study_stuff_file_readwriteandcomparision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader
{

    public static void main(String[] args) throws Exception
    {

        String csvFilepath = System.getProperty("user.dir")+"\\StudentDetails.csv";
        
        String line = "";
        
        String cvsSplitBy = ",";
        
        File file =new File(csvFilepath);
        
        FileReader fr=new FileReader(file);
        
        BufferedReader br=new BufferedReader(fr);
        
        while ((line=br.readLine()) != null) 
        {
        	
            System.out.println("line is "+line);
            // use comma as separator
            String[] cell_fields = line.split(cvsSplitBy);
            for(String cell_field:cell_fields)
            {
            	System.out.println("Cell field is "+cell_field);
                //System.out.println("Country [code= " + country[2] + " , name=" + country[2] + "]");
            }
         }

     }

 

}