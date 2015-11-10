package handCoding;

public class HandCoding41 {
	// "the sky is blue" => "blue is sky the"로 바꾸기
	
	public static String wordReverse(String input){
		String[] data = input.split(" ");
		StringBuilder result = new StringBuilder();
		for(int i = data.length - 1;i>=0;i--){
			result.append(data[i]);
			result.append(" ");
		}
		return result.toString();
	}
	
	public static String wordReverse2(String input){
		StringBuilder result = new StringBuilder();
		int end_idx = input.length();
		for(int i = input.length() - 1;i>=0;i--){
			if(input.charAt(i) == ' '){
				for(int j = i + 1;j < end_idx;j++){
					result.append(input.charAt(j));
				}
				result.append(" ");
				end_idx = i;
			}
			if(i == 0){
				for(int j = i;j<end_idx;j++){
					result.append(input.charAt(j));
				}
			}
		}
		return result.toString();
	}
	
	public static String wordReverse3(String input){
		StringBuilder result = new StringBuilder();
		java.util.Stack<Character> s = new java.util.Stack<Character>(); 
		for(int i = input.length() - 1;i>=0;i--){
			if(i == 0){
				s.add(input.charAt(i));
			}
			if(input.charAt(i) == ' ' || i == 0){
				while(!s.isEmpty()){
					result.append(s.pop());
				}
				result.append(" ");
			}
			else{
				s.add(input.charAt(i));
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String result = wordReverse("the sky is blue");
		System.out.println(result);
		String result2 = wordReverse2("the sky is blue");
		System.out.println(result2);
		String result3 = wordReverse3("the sky is blue");
		System.out.println(result3);
	}

}
