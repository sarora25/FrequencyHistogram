package popSugar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

/*
 * CHALLENGE: Generate and print out the case-insensitive character frequency histogram for the following sentence: 
 * "The quick brown fox jumped over the lazy dog and then the lazy dog cried for about an hour."
 *  Author: Swati Arora
 *  Date: October 20, 2014
 */
public class freqHistogram {
	
	/*Function "charFrequency" has the parameter, "str" which is the input sentence of type string.*/
	public static void charFrequency(String str){
		
		/*HashMap used to store each character and its corresponding frequency.*/
		HashMap<Character,Integer> map = new HashMap<>();
		
		/*In order to generate case-insensitive character frequency*/
		String strlower = str.toLowerCase();
		
		/*Get all the characters in the sentence to an array.*/
		char[] chars = strlower.toCharArray();
		
		/*Iterate through each character in the sentence and maintain its count in HashMap
		 If the character is already in HashMap increase its count by 1 else create a new entry into the HashMap */
		for(int i=0; i<chars.length; i++){		
			if(map.containsKey(chars[i])){
				int value = map.get(chars[i]);
				map.put(chars[i], value+1);
			}
			else
				map.put(chars[i], 1);
		}
		
		/*Iterate through the HashMap and print the key which is the character. And asterisk ('*') 
		 corresponding to the value which is the frequency of that character in the sentence. */
		for(Entry<Character, Integer> entry:map.entrySet()){
			System.out.print(entry.getKey());
			for(int i=0; i<entry.getValue(); i++){
				System.out.print(" * ");
			}
			System.out.print('\n');
		}
	}
	public static void main(String[] args) throws IOException{
		String sentence = "The quick brown fox jumped over the lazy dog and then the lazy dog cried for about an hour.";
		charFrequency(sentence);
	}
}
