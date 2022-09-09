package part13;
import part8.MemberDTO;

public interface MemberManager {
	public static void main(String[] args) {
		MemberManager member = new MemberManagerImpl();
	}
	
	public boolean addMember(MemberDTO member);
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);


}
