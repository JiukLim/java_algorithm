package simplealgorithm;

public class SelectPrintString {
	
	public static String input = "mynameisJiuk";
	public static String targetChar = "aeiou";
	
	public static Boolean[] target = new Boolean[50];
	
	public static void Selecting_TargetChar(){
		for(int i = 0;i < targetChar.length();i++){
		}
	}
	
	public static String result_func(){
		String result = "";
		for(int i = 0;i<input.length();i++){
			if(target[Character.getNumericValue(input.charAt(i))] == false){
				result += input.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selecting_TargetChar();
		
		
		// System.out.println(result_func());
	}

}
