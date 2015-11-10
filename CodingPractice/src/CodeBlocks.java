
public class CodeBlocks {

	private static String aField = "";
	private String bField = "";
	
	static{
		aField += "A";
	}
	{
		aField += "B";
		bField += "B";
	}
	
	// 빈 블락은 동적 할당 될 때 작동함
	
	public CodeBlocks(){
		aField += "C";
		bField += "C";
	}
	
	public void append(){
		aField += "D";
		bField += "D";
	}
	
	public static void main(String[] args) {
		System.out.println(aField);			// aFiled = "A" , bField = ""
		CodeBlocks cb = new CodeBlocks();	// aFiled = "ABC" , bField = "BC" 
		cb.append();						// aFiled = "ABCD" , bField = "BCD"
		System.out.println(aField);			// ABCD
		System.out.println(cb.bField);		// BDC
	}

}
