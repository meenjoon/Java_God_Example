package Part8;

public class ReferenceConstructor { 
	public static void main(String[] args) {
		
		ReferenceConstructor exam = new ReferenceConstructor();
		exam.makeMemberObject();
		
	}
	public void makeMemberObject() {
		MemberDTO dto1 = new MemberDTO();
		MemberDTO dto2 = new MemberDTO("Sangmin");
		MemberDTO dto3 = new MemberDTO("Sangmin", "010xxxxxxxx");
		MemberDTO dto4 = new MemberDTO("Sangmin", "010xxxxxxxx","god@naver.com");
		
	}

}
