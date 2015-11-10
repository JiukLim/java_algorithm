package nexon;

public class Expression {
// 아이디가 숫자, 소문자, 대문자, _, -로 모두 구성되어 있지 않은 경우 false를 반환하게 함
public static Boolean checkId(StringBuffer id){
	for(int i = 0;i<id.length();i++){
		if(!((id.charAt(i) >= 48 && id.charAt(i) <= 57) || (id.charAt(i) >= 65 && id.charAt(i) <= 90)
				|| (id.charAt(i) >= 97 && id.charAt(i) <= 122) || (id.charAt(i) == 95) || (id.charAt(i) == 77))){
			return false;
		}
	}
	return true;
}
// 도메인이 소문자로 구성되어 있지 않은 경우 or 도메인에 . 앞뒤로 소문자 배치되어 있지 않은 경우 false를 반환
public static Boolean checkDomain(StringBuffer domain){
	for(int i = 0;i<domain.length();i++){
		if(domain.charAt(i) == 46){
			if(!((domain.charAt(i - 1) >= 97 && domain.charAt(i - 1) <= 122) && 
					(domain.charAt(i + 1) >= 97 && domain.charAt(i + 1) <= 122))){
				return false;
			}
		}
		else if(!(domain.charAt(i) >= 97 && domain.charAt(i) <= 122)){
			return false;
		}
		
	}
	return true;
}
public static Boolean checkedemailadd(String email){
	StringBuffer id = new StringBuffer();
	StringBuffer domain = new StringBuffer();
	int division = 0;
	for(int i = 0;i<email.length();i++){
		if(email.charAt(i) == '@'){
			division = i;
			break;
		}
	}
	// @을 찾지 못 하면 false 반환 
	if(division == 0)
		return false;
	// @을 기준으로 id와 domain정보를 나누어놓음
	for(int i=0;i<division;i++){
		id.append(email.charAt(i));
	}
	for(int i = division + 1; i<email.length();i++){
		domain.append(email.charAt(i));
	}
	// 올바른 아이디인지, 올바른 도메인인지 확인
	if(!checkId(id)){
		return false;
	}
	if(!(checkDomain(domain))){
		return false;
	}
	return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkedemailadd("topjlim@naver.co.com"));
	}

}
