package part8;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDTO(String name) {
		//이름만 알 때
		this.name = name;
		
	}

	public MemberDTO(String name, String phone) {
		//이름과 전화번호만 알 때
	
		this.name = name;
		this.phone = phone;
	}
	
	public MemberDTO(String name, String phone, String email) {
		//이름과 전화번호, 이메일 알 때
	
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
//	public boolean equals(Object obj) {
//		if(this == obj) return true; //주소가 같으므로 당연히 true
//		if(obj == null) return false;  //obj가 null이므로 당연히 false
//		if(getClass() != obj.getClass()) return false; //클래스의 ㅈㅇ류가 다르므로 false
//		
//		MemberDTO other = (MemberDTO) obj; //같은 클래스 이므로 형 변환 실
//		
//		
//		//아래 코드들은 각 인스턴스 변수가 같은지 비교하는 작
//		
//		if(name == null) { //name이 null일때
//			if(other.name != null) return false; //비교 대상의 name이 null 이 아니면 false
//		}
//		else if(!name.equals(other.name)) return false; { //두 개의 name 값이 다르면 false
//		}
//		
//		if(email == null) {
//			if(other.email != null) return false;
//		}
//		else if(!email.equals(other.email)) return false; {
//		}
//		
//		if(phone == null) {
//			if(other.phone != null) return false;
//		}
//		else if(!phone.equals(other.phone)) return false; {
//		}
//		
//		return true;
//		
//	}
	
	public int hashCode() {
		final int prime = 32;
		int result = 1;
		result = prime * result +((email == null) ? 0 : email.hashCode());
		result = prime * result +((name == null) ? 0 : name.hashCode());
		result = prime * result +((phone == null) ? 0 : phone.hashCode());
		
		return result;
	}

}
