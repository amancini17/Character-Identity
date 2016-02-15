# Character-Identity

package com.opencsv;

public class CharacterIdentity extends JFrame
	{ 
		
		public static void main(String[] args) {
			new CharacterIdentity();
			
		}
			
		Map<Integer,String> facts = new HashMap<Integer,String>(); 
		Map<Integer,String> alpha = new HashMap<Integer,String>();
		
public void loadfromCSV() 
		{
		try {
		CSVReader reader = new CSVReader();
		String [] nextLine;
		     while ((nextLine = (String[]) reader.readNext()) != null) { //creates while loop--reads information from inside the hashmap
		try {
	        System.out.println(nextLine[1] + " " + nextLine[4]);
	        facts.put(Integer.parseInt(nextLine[1], 16), nextLine[4]); // matches up two lists of values - one list includes values and one list includes strings
		    	 }
		    	 
		    	 catch(Exception e){ //code operates in spite of exception
		    		 
		    	 }
		        // nextLine[] is the array of values from the line
		     
