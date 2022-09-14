package part17;

import part8.MemberDTO;

public class exex {
	
    public static void main(String[] args) {

    	
		String text1= "Java Basic";
		String text2= "Java Basic";
		String text3= new String("Java Basic");
		String text4= new String("Java Basic");
		MemberDTO obj1 = new MemberDTO("Sangmin");
		MemberDTO obj2 = new MemberDTO("Sangmin");
		
		System.out.println(text1==text2);
		System.out.println(text1==text3);
		System.out.println(text3==text4);
		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text3.equals(text4));
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1==obj2);
    	
    }
    public static void changeString(String param) {
        param += " world";
    }
}

