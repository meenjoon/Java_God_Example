package part26;

import java.io.File;

public class FileManageClass {

	public static void main(String[] args) {
		
		FileManageClass sample = new FileManageClass();
		
		String pathName = "\\godofjava\\text";
		String fileName="test.txt";
		
		sample.checkFile(pathName, fileName);

	}
	public void checkFile(String pathName, String fileName) {
		File file = new File(pathName, fileName);
		try {
			System.out.println("Create result = " + file.createNewFile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
