package Part8;

public class MemberDTO {
	public String name;
	public String phone;
	public String email;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDTO(String name) {
		//�̸��� �� ��
		this.name = name;
		System.out.println(name);
	}

	public MemberDTO(String name, String phone) {
		//�̸��� ��ȭ��ȣ�� �� ��
	
		this.name = name;
		this.phone = phone;
	}
	
	public MemberDTO(String name, String phone, String email) {
		//�̸��� ��ȭ��ȣ, �̸��� �� ��
	
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	

}
