package studystuff_geeksforgeeks_string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA_2_3.portable.InputStream;

public class CountCharactersWordsLinesParagraphsFromTextFile 

{
	public static void main(String str[]) throws Exception
	{
		String filepath="D:\\Gaurav\\Gaurav Workspace\\Gaurav Project\\src\\studystuff_geeksforgeeks_string\\countofcharcters_words_lines_paragraphs.txt";
		File file=new File(filepath);
		// FileInputStream is a class that is used to read data from file:
		FileInputStream fis=new FileInputStream(file);
		
		// InputStreamReader is a class that is used convert input byte stream into charater stream.
		InputStreamReader isr=new InputStreamReader(fis);
		
		// BufferedReader is a class that is used to read text/characters from each line one by one i.e the converted input byte stream to character stream via InputStreamReader
		BufferedReader br=new BufferedReader(isr);
		
		String line=null;
		// Initialize counters:
		int charactersCount=0;
		int wordsCount=0;
		int sentencesCount=0;
		int paragraphCount=1;
		int whitespaceCount=0;
		
		
		// Read line by line from a file until a null is returned
		// line will have the complete file data
		while((line = br.readLine())!=null)
			
        {
			if(line.equals(""))
			{
				paragraphCount++;
			}
			if(!line.equals(""))
			{
				charactersCount=charactersCount+line.length();
				
				String words[]=line.split("\\s");
				wordsCount=wordsCount+words.length;
				
				// [!?.:]+ is the sentence delimiter in java
                String[] sentences = line.split("[:!.?]");
				sentencesCount=sentencesCount+sentences.length;
			}
			
			
        }
		
		System.out.println("count of characters:"+charactersCount);
		System.out.println("count of words:"+wordsCount);
		System.out.println("count of sentences:"+sentencesCount);
		System.out.println("count of paragraph:"+paragraphCount);
		
		
	}
	
	
}
