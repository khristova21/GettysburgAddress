/**
 * 
 * @author Krisi Hristova Pd6 
 * Gettysburg Address
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java. util.Scanner;
public class GettysburgMain 
{

	public static void main(String[] args) throws FileNotFoundException 
	{

		//use scanner to read text and add each word to an arraylist of Strings
		//find the longest word
		//find average word length
		
		
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		//assume filename stores the name of the file
		
		ArrayList<String> fileCopy = new ArrayList<String>();
		
		int wordCount;
		int largestWordLength = 0;
		String largestWord= "";

		//add each word in the arraylist
		while(file.hasNext())
		{
			fileCopy.add(file.next());
		}
		
		for (String word : fileCopy)
		{
			wordCount ++;		
			int  wordLength = word.length();			
			if (wordLength >  largestWordLength)
			{
				largestWordLength = wordLength;
				largestWord = word;
			}
			
			
			
		}
		
		//find largest word
		System.out.println("The largest word is: " + largestWord);
		//find average
		int average;
		//sum of all lengths / word count
		
		average =
	
	}

}
