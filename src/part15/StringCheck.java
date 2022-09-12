package part15;

import part8.MemberDTO;

public class StringCheck {

	public static void main(String[] args) {

		StringCheck sample = new StringCheck();
		
		String addresses[] = new String[] {
				"����� ���α� �ŵ�����",
				"��⵵ �����úд籸 ���ڵ� ���� ����",
				"����� ���α� ������"
		};
//		sample.checkAddress(addresses);
//		sample.containsAddress(addresses);
//		sample.checkMatch();
//		sample.checkIndexOf();
//		sample.checkSubstring();
//		sample.checkSplit();
//		sample.checkTrim();
//		sample.checkReplace();
//		sample.checkFormat();
		sample.internCheck();
		
		/*
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" world");
		System.out.println(sb);
		*/
		
//		System.out.println(sb.append("Hello").append(" world"));

	}
		
		
	public void checkAddress(String[] addresses) {
		int startCount=0, endCount=0;
		String startText="�����";
		String endText="��";
		
		for(String address:addresses) {
			if(address.startsWith(startText)) {
				startCount++;
			}
			if(address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Starts with " +startText+ " count is " + startCount);
		System.out.println("Ends with " +endText+ " count is " + endCount);
		}
	public void containsAddress(String[] addresses) {
		int containCount=0;
		String containText="����";
		for(String address: addresses) {
			if(address.contains(containText)){
				containCount++;
			}
		}
		System.out.println("Contais " + containText + " count is " + containCount);
		
	}
	public void checkMatch() {
		String text = "This is a text";
		String compare1= "is";
		String compare2= "this";
		System.out.println(text.regionMatches(2, compare1, 0, 1)); //�Ű������� 4���� �޼ҵ�
		System.out.println(text.regionMatches(5, compare1, 0, 2)); //�Ű������� 4���� �޼ҵ�
		System.out.println(text.regionMatches(true,0, compare2, 0, 4)); //�Ű������� 5���� �޼ҵ�
	}
	public void checkIndexOf() {
		String text = "Java technology is both a programming language and a platform.";
		System.out.println(text.indexOf('a')); //1
		System.out.println(text.indexOf("a ")); //2
		System.out.println(text.indexOf('a',20)); //3
		System.out.println(text.indexOf("a ",20));
		System.out.println(text.indexOf('z')); //4
		
	}
	public void checkSubstring() {
		String text="Java technology";
		String technology=text.substring(5);
		System.out.println(technology);
		String tech = text.substring(5,9);
		System.out.println(tech);
	}
	
	public void checkSplit() {
		String text = "Java technology is both a programming language and a platform.";
		String[] splitArray=text.split(" ");
		
		for(String temp:splitArray) {
			System.out.println(temp);
		}
	}
	public void checkTrim() {
		String string[] = new String[] {
			" a","b ","     c", "d    ","e   f","    "
		};
		for(String strings:string) {
			System.out.println("["+strings+"] ");
			System.out.println("["+strings.trim()+"] ");
		}
	}
	public void checkReplace() {
		String text="The String class represents character strings.";
		System.out.println(text.replace('s', 'z')); //1
		System.out.println(text); //2
		System.out.println(text.replace("tring", "trike")); //3
		System.out.println(text.replaceAll(" ", "/")); //4
		System.out.println(text.replaceFirst(" ", "/")); //5
	}
	
	public void checkFormat() {
		String text="�� �̸��� %s�Դϴ�. ���ݱ��� %d ���� å�� ���, "
				+"�Ϸ翡 %f %%�� �ð��� å�� ���µ� �Ҿ��ϰ� �ֽ��ϴ�.";
		String realText=String.format(text, "�̻��",7,10.5);
		// String realText=String.format(text, "�̻��",7);
		System.out.println(realText);
		
	} 
	
	public void internCheck() {
		String text1= "Java Basic";
		String text2= "Java Basic";
		String text3= new String("Java Basic");
		String text4= new String("Java Basic");
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		
//		text3=text3.intern();

		System.out.println(text1==text2);
		System.out.println(text1==text3);
		System.out.println(text3==text4);
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text3.equals(text4));
		System.out.println(obj1.equals(obj2));
//		System.out.println(text1.hashCode());
//		System.out.println(text2.hashCode());
//		System.out.println(text3.hashCode());
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
	}
	

}
