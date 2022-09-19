package part24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
//		sample.checkProperties();
//		sample.checkProperties2();
//		sample.saveAndLoadProperties();
		sample.saveAndLoadPropertiesXML();

	}
	public void checkProperties() { // 키를 구해서 get()메소드에 키 값을 이용하여 키와 값 둘 다 출
		Properties prop=System.getProperties();
		Set<Object> keySet=prop.keySet();
		for(Object tempObject : keySet) {
			System.out.println(tempObject+"="+prop.get(tempObject));
		}
	}
//	public void checkProperties2() { // 값만 출
//		Properties prop=System.getProperties();
//
//		Collection<Object> value = prop.values();
//		for(Object tempprop:value) {
//			System.out.println(tempprop);
//		}
//	}
	public void saveAndLoadProperties() {
		try {
			String fileName = "text.properties";
			File propertiesFile = new File(fileName);
			FileOutputStream fos = new FileOutputStream(propertiesFile);
			Properties prop = new Properties();
			prop.setProperty("writer", "Sangmin, Lee");
			prop.setProperty("writerHome", "http://www.GodOfJava.com");
			prop.store(fos, "Basic Properties file");
			fos.close();
			
			FileInputStream fis = new FileInputStream(propertiesFile);
			Properties propLoaded = new Properties();
			propLoaded.load(fis);
			fis.close();
			System.out.println(propLoaded);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void saveAndLoadPropertiesXML() {
		try {
			String fileName = "text.xml";
			File propertiesFile = new File(fileName);
			FileOutputStream fos = new FileOutputStream(propertiesFile);
			Properties prop = new Properties();
			prop.setProperty("writer", "Sangmin, Lee");
			prop.setProperty("writerHome", "http://www.GodOfJava.com");
			prop.storeToXML(fos, "Basci XML Propeerty file");
			fos.close();
			
			FileInputStream fis = new FileInputStream(propertiesFile);
			Properties propLoaded = new Properties();
			propLoaded.loadFromXML(fis);
			System.out.println(propLoaded);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
