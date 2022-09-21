package part27;

import static java.io.File.separator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageObject {

	public static void main(String[] args) {
		ManageObject manager = new ManageObject();
//		String pathName = "\\godofjava\\text";
		String fullPath="\\godofjava\\text\\serial.obj";
		SerialDTO dto=new SerialDTO("GodofJavaBook", 1, true, 100);
		manager.saveObject(fullPath, dto);
		manager.loadObject(fullPath);
		

	}
	public void saveObject(String fullpath, SerialDTO dto) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fullpath); //1
			oos = new ObjectOutputStream(fos); //2 
			oos.writeObject(dto); //3
			System.out.println("Write Success");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void loadObject(String fullPath) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fullPath); //1
			ois = new ObjectInputStream(fis); //2 
			Object obj = ois.readObject();
			SerialDTO dto = (SerialDTO)obj;
			System.out.println(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ois!=null) {
				try {
					ois.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
