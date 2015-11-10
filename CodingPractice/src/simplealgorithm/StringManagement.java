package simplealgorithm;

import java.util.HashMap;
import java.util.Stack;

public class StringManagement {
	
	public static boolean checkpartition(String calculatestr){
		Stack<Character> s = new Stack<Character>();
		for(int i = 0;i<calculatestr.length();i++){
			if(calculatestr.charAt(i) == '(' || calculatestr.charAt(i) == ')'){
				if(s.isEmpty() || s.peek() == calculatestr.charAt(i)){
					// push
					s.push(calculatestr.charAt(i));
				}
				else{
					// pop
					s.pop();
				}
			}
		}
		if(s.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean AllOfOneCharacter(String target){
		HashMap<Character, Integer> codeTable = new HashMap<Character, Integer>();
		for(int i = 0;i<target.length();i++){
			codeTable.put(target.charAt(i), 0);
		}
		for(int i = 0;i<target.length();i++){
			codeTable.put(target.charAt(i), codeTable.get(target.charAt(i)) + 1);
		}
		for(int i = 0;i<target.length();i++){
			if(codeTable.get(target.charAt(i)) > 1){
				return false;
			}
		}
		return true;
	}
	
	public static StringBuffer zipstrfunc(StringBuffer target){
		StringBuffer zipstr = new StringBuffer();
		int count = 0;
		for(int i = 0;i<target.length() - 1;i++){
			count++;
			if(i != target.length() - 1 && target.charAt(i) != target.charAt(i + 1)){
				zipstr.append(target.charAt(i));
				zipstr.append(count);
				count = 0;
			}
		}
		// 문자열의 마지막 원소에 대한 처리
		if(count == 0){
			
		}
		else{
			
		}
		if(zipstr.length() < target.length())
			return zipstr;
		else
			return target;
	}
}
