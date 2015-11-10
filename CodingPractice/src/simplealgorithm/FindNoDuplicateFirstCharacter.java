package simplealgorithm;

import java.util.Scanner;

public class FindNoDuplicateFirstCharacter {

	public static String inputstr;
	public static int charTable[] = new int[150];
	
	public static char findFirstCharacter(){
		// charTable의 각 숫자마다 출현한 숫자의 개수를 도출해주고 
		for(int i = 0;i<inputstr.length();i++){
			charTable[(int)inputstr.charAt(i)]++;
		}
		// charTable에서 값이 1인 것 (중복되는 수가 한 개인것을 만나면) 바로 답을 도출해낸다
		for(int i = 0;i<inputstr.length();i++){
			if(charTable[(int)inputstr.charAt(i)] == 1){
				return inputstr.charAt(i);
			}
		}
		return '0';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true){
			inputstr = in.nextLine();
			System.out.println(findFirstCharacter());
		}
	}

}
