package part23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String cars[] = new String[] {
				"Tico","Sonata","BMW","Benz"
				,"Lexus","Mustang","Grandeure"
				,"The Beetle","Mini Cooper","i30"
				,"BMW","Lexux","Carnibal","SM5"
				,"SM7","SM3","Tico" };
		sample.getCarKinds(cars);
		}
	
	public void getCarKinds(String[] cars) {
		int count = 0;
		
		ArrayList<String> list = new ArrayList<String>();
		for(String car : cars) {
			list.add(car);
		}
		System.out.println(count);
		
		
		for(String tempdata : cars) {
			count++;
		}
		System.out.println(count);
		
		System.out.println(list);
//		return count;
		
	}
	
	public int getCarKinds2(String[] cars) {
		if(cars==null) {
			return 0; //1
		}
		if(cars.length==1) {
			return 1; //2
		}
		Set<String> carSet = new HashSet<String>(); //3
		for(String car:cars) { //4
			carSet.add(car);
		}
		System.out.println("total count : " + carSet.size());
		printCarSet2(carSet);
		return carSet.size(); //5
	}
	
	public void printCarSet(Set<String> carSet) {
		for(String temp:carSet) {
			System.out.println(temp);
		}
	}
	public void printCarSet2(Set<String> carSet) {
		Iterator<String> iterator = carSet.iterator(); //1
		while(iterator.hasNext()) { //2
			System.out.println(iterator.next()); //3
		}
		System.out.println();
	}
}


