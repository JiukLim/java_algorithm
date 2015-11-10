package handCoding;

public class HandCoding4 {
	
	public static String appendString(String a, String b){
		StringBuilder result = new StringBuilder();
		
		for(int i = 0;i<a.length();i++){
			result.append(a.charAt(i));
		}
		for(int i = 0;i<b.length();i++){
			result.append(b.charAt(i));
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(appendString("Hello,", " World!"));
	}

}
