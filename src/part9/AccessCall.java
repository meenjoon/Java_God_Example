package part9;

import part8.AccessModifier;

public class AccessCall {

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.publicMethod();
		accessModifier.publicMethod();
//		accessModifier.protectedMethod(); //improt�� �ϴ��� ���� ��Ű���� ��ӹ��� ��찡 �ƴ϶� ������ ��
//		accessModifier.packagePrivateMethod(); //improt�� �ϴ��� ���� ��Ű���� ��ӹ��� ��찡 �ƴ϶� ������ ���.
//		accessModifier.privateMethod(); //improt�� �ϴ��� ���� Ŭ������ �ƴ϶� ����� �� ����.

	}
	

}
