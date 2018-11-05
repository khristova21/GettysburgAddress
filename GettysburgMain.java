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
		
		
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		//assume filename stores the name of the file
		
		String word;
		ArrayList<String> copy = new ArrayList<String>();
		
		//add each word in the arraylist
		while(file.hasNext())
		{
			word = file.next();
			//each word into array list
			//copy.add(word);
		}
	}

}
