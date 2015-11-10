package simplealgorithm;

public class StrProcess {
	public int strcmpfunc(String str1, String str2){
		if(str1.length() == str2.length()){
			Boolean flag = true;
			for(int i = 0;i<str1.length();i++){
				if(str1.charAt(i) != str2.charAt(i)){
					flag = false; break;
				}
			}
			if(flag)
				return 0;
		}
		if(str1.charAt(0) > str2.charAt(0))
			return 1;
		else
			return -1;
	}
}
