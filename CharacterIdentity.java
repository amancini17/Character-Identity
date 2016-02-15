
import java.awt.BorderLayout; //imports stuff that's necessary for the code to work
import java.awt.FlowLayout;
import java.awt.Font;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharacterIdentity extends JFrame //creates JFrame
{
	public static String removeSpace(String words)
	{ // creating this to remove the spaces before the hex entities and english
	  // definitions
		String newString = ""; // creates a new string
		outer: for (int i = 0; i < words.length(); i++) // initializing, terminating, updating the for loop
		{ 
			if (words.charAt(i) == '"') //checking if char is a double quotation or not
			{
				for (int j = i; j < words.length(); j++) 
				{
					newString += words.charAt(j); //adds everything from the double quotation to the end of the string
				}
				break outer;
			}
			if (words.charAt(i) != ' ') //checking if char is a space or not
			{
				newString += words.charAt(i); //making sure there's nothing important in front of double quotation
			}
		}
		return newString;
	}
