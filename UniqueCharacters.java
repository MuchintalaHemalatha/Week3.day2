package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {

		String input = "babu";
		// Convert String to Character array
		char[] charArray = input.toCharArray();
		// Create a new Set -> HashSet
		Set<Character> unique=new HashSet<Character>(); 
		for (int i = 0; i < charArray.length; i++) {
			int count=0;
			for (int j = 0; j < charArray.length; j++) {
				if(charArray[i]==charArray[j])
				{
					count=count+1;
				}
				if(count==0)
				{
					unique.add(charArray[i]);
				}
			}
		}
		// Add each character to the Set and if it is already there, remove it
		System.out.println(unique);
		// Finally, print the set


	}

}
