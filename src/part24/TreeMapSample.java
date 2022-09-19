package part24;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		TreeMapSample sample = new TreeMapSample();
		sample.checkTreeMap();

	}
	public void checkTreeMap() {
		TreeMap<String, String> map = new TreeMap<String,String>();
		map.put("A", "a");
		map.put("°¡", "e");
		map.put("1", "f");
		map.put("a", "g");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Map.Entry<String, String> tempentries : entries) {
			System.out.println(tempentries.getKey()+"="+tempentries.getValue());
		}
	}

}
