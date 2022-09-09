package part13;

import part8.MemberDTO;

public class FinalReferenceType {
	final MemberDTO dto=new MemberDTO();

	public static void main(String[] args) {

		FinalReferenceType referenceType = new FinalReferenceType();
	
	}
	public void checkDTO() {
		System.out.println(dto);
//		dto = new MemberDTO();
		dto.name="Sangmin";
		System.out.println(dto);
	}

}
