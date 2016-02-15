# Character-Identity

package com.opencsv;

import java.awt.BorderLayout;

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
		        
}
			} 
			catch(Exception e){
				throw new RuntimeException(e); //code runs in spite of exceptions 
			}
		   
		}
		     
public CharacterIdentity() {
		super("project");
			loadfromCSV();
			
			
			final JTextField textField = new JTextField(20);
			this.getContentPane().add(textField, BorderLayout.CENTER); 
			this.setVisible (true);
			this.setSize(500,500);
			textField.setFont(new Font("Serif", Font.BOLD, 50)); 
			final JLabel unicode = new JLabel ("unicode");
			final JLabel entities = new JLabel("entities");
			this.getContentPane().add(unicode, BorderLayout.NORTH);
			this.getContentPane().add(entities, BorderLayout.SOUTH);
			DocumentListener listener = new DocumentListener() {
			
public void insertUpdate(DocumentEvent e)
				{
					
				String text = textField.getText(); 
				int firstChar = text.charAt(0); //first letter is integer
				String eng = facts.get(firstChar); //processes the letter character 
				//eng = facts.get("");					
				unicode.setText(eng + "decimal and entity: " + firstChar + " " + "&#" + firstChar + "; " +"hex and hex entity: 0x" + String.format("%04x", firstChar) + " &#x" + String.format("%04x", firstChar) + ";");  
				//decimal and hex values shown by integer
				
					entities.setText(eng);
				}
				
				public void removeUpdate(DocumentEvent e)
				{
					// TODO Auto-generated method stub
					
				}

				public void changedUpdate(DocumentEvent e)
				{
			
				}
			   
			};
			textField.getDocument().addDocumentListener(listener); 
	}
	}
		
