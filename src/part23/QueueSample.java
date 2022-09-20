package part23;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class QueueSample {

	public static void main(String[] args) {
		QueueSample sample = new QueueSample();

		String cars[] = new String[] {
				"Tico","Sonata","BMW","Benz"
				,"Lexus","Mustang","Grandeure"
				,"The Beetle","Mini Cooper","i30"
				,"BMW","Lexux","Carnibal","SM5"
				,"SM7","SM3","Tico" };
		sample.checkLinkedList1();

	}
	public void checkLinkedList1() {
		LinkedList<String> link = new LinkedList<String>();
//		Iterator iterator = (Iterator) link.iterator();
		
//		for(String temp:cars) {
//			link.add(temp);
//		}
//		System.out.println(link.size());
//		System.out.println(link);
		
		
		link.add("A");
		link.addFirst("B");
		System.out.println(link);
		link.offerFirst("C");
		System.out.println(link);
		link.addLast("D");
		System.out.println(link);
		link.offer("E");
		System.out.println(link);
		link.offerLast("F");
		System.out.println(link);
		link.push("G");
		System.out.println(link);
		link.add(0,"H");
		System.out.println(link);
		System.out.println("EX="+link.set(0, "I"));
//		link.listIterator(2);
		System.out.println(link);
	}

}
