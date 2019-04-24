package edu.wit.dcsn.comp1050.lab04;

/*
* Comp 1050-05 - Computer Science II
* Lab 4 -  Dynamic Data Structures: HashSet HashMap, ArrayList 
* Vincent Jodice
*/

/**
 * 
 * @author Vincent J Jodice
 * version 1.0.0 2018-03-28 original version
 * 
 * 		This program reads in a text file and puts the list of names into the text file into a hash set.
 *      The program then prints out the hashset in the console.     
 *
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;
public class classInvitations {

	public static void main(String[] args) throws FileNotFoundException {
		HashSet<String> listNames = new HashSet<>(8);
		
		Scanner inputStream = new Scanner(new FileInputStream("./data/names.txt"));
		System.out.println("The people invited are:");
		while(inputStream.hasNext()) {
			String name=inputStream.nextLine();
			listNames.add(name);
		    }
		System.out.println(listNames);
	inputStream.close();
	}
			
}