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
 *     This program reads into a text file and then groups students with their respective classes in a map.
 *     then you print out the list of student ID with the classes and the hashmap that orders student ID's with their respective classes
 *
 */

import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

		public class classEnrollments {

				public static void main(String[] args) throws IOException {
		
						ArrayList<String> courses1 = new ArrayList<String>();
						ArrayList<String> courses2 = new ArrayList<String>();
						ArrayList<String> courses4 = new ArrayList<String>();
						ArrayList<String> courses203 = new ArrayList<String>();
						Scanner inputStream = new Scanner(new FileInputStream("data/enrollments.txt"));
						HashMap<Integer, ArrayList<String>> studentsClasses = new HashMap<>();
						
				
				}
					
						
				}

