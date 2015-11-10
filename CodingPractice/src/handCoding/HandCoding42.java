package handCoding;

import java.util.ArrayList;
import java.util.List;

public class HandCoding42 {
	
	public static void strcpy(String origin, char[] destination){
		for(int i = 0;i<origin.length();i++){
			destination[i] = origin.charAt(i);
		}
	}
	
	public static List<Character> mystrcpy(List<Character> destination, List<Character> origin){
		for(int i = 0;i<origin.size();i++){
			destination.add(origin.get(i));
		}
		return destination;
	}
	
	public static String mystrcpy(String destination, String origin){
		StringBuilder result = new StringBuilder();
		for(int i = 0;i<origin.length();i++){
			result.append(origin.charAt(i));
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String destination = "dddd", origin = "limjiuk";
		
		System.out.println(destination);
		destination = mystrcpy(destination, origin);
		System.out.println(destination);
		
	} 

}
