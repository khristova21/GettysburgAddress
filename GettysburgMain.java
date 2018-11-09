/** 
 * @author Krisi Hristova Pd6 
 * Gettysburg Address
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java. util.Scanner;
public class GettysburgMain 
{

	public static void main(String[] args) throws FileNotFoundException 
	{		
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		//assume filename stores the name of the file
		
		ArrayList<String> fileCopy = new ArrayList<String>();
		
		int wordCount = 0;
		int largestWordLength = 0;
		double sum = 0;
		String largestWord= "";

		//add each word to the arraylist, fileCopy
		while(file.hasNext())
		{
			fileCopy.add(file.next());
		}
		/**
		 * for each word in fileCopy
		 * add 1 to wordCount to keep track of how many words there are
		 * find the word length and if it is greater than what is already set to be the largest, replace it
		 * add on the word length to the sum (of all words)
		 */
		for (String word : fileCopy)
		{	
			wordCount ++;		
			int  wordLength = word.length();			
			if (wordLength >  largestWordLength)
			{
				largestWordLength = wordLength;
				largestWord = word;
			}
			//add the length of the word to an array
			sum += wordLength;
		}
		//find average
		double average;
		average = sum / wordCount;
		
		System.out.println("The largest word is: " + largestWord);
		System.out.println("The average word length is " + average);
	
	}

}
