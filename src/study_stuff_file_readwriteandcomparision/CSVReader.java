package study_stuff_file_readwriteandcomparision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader
{

    public static void main(String[] args) throws Exception
    {

        String csvFilepath = "C:\\Users\\ABC\\Desktop\\CSVReader.csv";
        
        String line = "";
        
        String cvsSplitBy = ",";
        
        FileReader fr=new FileReader(csvFilepath);
        
        BufferedReader br=new BufferedReader(fr);
        
        while ((line=br.readLine()) != null) 
        {
        	
            System.out.println("line is "+line);
            // use comma as separator
            String[] country = line.split(cvsSplitBy);
            for(String line_seperated_by_comma:country)
            {
            	System.out.println("line_seperated_by_comma is "+line_seperated_by_comma);
                //System.out.println("Country [code= " + country[2] + " , name=" + country[2] + "]");
            }
         }

     }

 

}