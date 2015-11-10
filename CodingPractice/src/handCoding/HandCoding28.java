package handCoding;

public class HandCoding28 {
	// total과 같은 단어에서 알파벳이 하나만 출현하는 알파벳에서 가장 앞쪽에 있는 것을 출력
	
	public static char FindOnceCharacter(String s){
		int[] charTable = new int[130];
		for(int i = 0;i<s.length();i++){
			int idx = (int)s.charAt(i);
			charTable[idx] += 1;
		}
		for(int i = 0;i<s.length();i++){
			int idx = (int)s.charAt(i);
			if(charTable[idx] == 1){
				return s.charAt(i);
			}
		}
		return '!';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TTooA";
		input = input.toLowerCase();
		if(FindOnceCharacter(input) == '!'){
			System.out.println("하나만 사용하는 알파벳이 없습니다.");
		}
		else{
			System.out.println(FindOnceCharacter(input));
		}
	}
}
