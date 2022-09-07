package part9;

import part8.AccessModifier;

public class AccessCall {

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.publicMethod();
		accessModifier.publicMethod();
//		accessModifier.protectedMethod(); //improt를 하더라도 같은 패키지나 상속받은 경우가 아니라 에러가 뜬
//		accessModifier.packagePrivateMethod(); //improt를 하더라도 같은 패키지나 상속받은 경우가 아니라 에러가 뜬다.
//		accessModifier.privateMethod(); //improt를 하더라도 같은 클래스가 아니라서 사용할 수 없다.

	}
	

}
