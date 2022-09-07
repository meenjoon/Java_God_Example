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
	

}
