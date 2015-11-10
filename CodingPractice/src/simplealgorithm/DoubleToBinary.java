package simplealgorithm;

public class DoubleToBinary {
	
	public static String printBinary(double num){
		if(num >= 1 || num <= 0)
			return "ERROR";
		
		StringBuilder binary = new StringBuilder();
		
		binary.append(".");
		while(num > 0){
			/* 길이 제한 설정 : 문자 단위로 32*/
			if(binary.length() >= 32)
				return "ERROR";
			
			double r = num * 2;
			if(r >= 1){
				binary.append(1);
				num = r - 1;
			}else{
				binary.append(0);
				num = r;
			}
		}
		return binary.toString();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printBinary(0.01));
		
	}

}
