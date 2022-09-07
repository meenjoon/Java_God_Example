package part10;

public class InheritanceCasting {

	public static void main(String[] args) {
		InheritanceCasting inheritance = new InheritanceCasting();
//		inheritance.objectCast();
//		inheritance.objectCast2();
		inheritance.objectCastArray();

	}
	public void objectCast() {
		ParentCasting parent = new ParentCasting();
		ChildCasting child = new ChildCasting();
		
		ParentCasting parent2=child;
		ChildCasting child2= (ChildCasting) parent;
	}
	public void objectCast2() {
		ChildCasting child = new ChildCasting();
		ParentCasting parent2 = child;
		ChildCasting child2=(ChildCasting)parent2;
	}
	public void objectCastArray() {
		ParentCasting[] parentArray = new ParentCasting[3];
		parentArray[0] =new ChildCasting();
		parentArray[1] =new ParentCasting();
		parentArray[2] =new ChildCasting();
		objectTypeCheck(parentArray);
	}
	private void objectTypeCheck(ParentCasting[] parentArray) {
		int i = 0;
		for(ParentCasting tempParent:parentArray) { //parentArray의 값을 순서대로 tempParent에 차례대로 대입한다라는 뜻

			
			if(tempParent instanceof ChildCasting) {

				System.out.println(i);
				i++;
				System.out.println("ChildCasting");
				ChildCasting tempChild = (ChildCasting) tempParent;
				tempChild.printAge();

			}
			else if(tempParent instanceof ParentCasting) {
				System.out.println(i);
				i++;
				System.out.println("ParentCasting");

			}
		}
	}

}
