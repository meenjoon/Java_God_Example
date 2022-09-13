package part17;

import java.lang.reflect.Method;

public class UserAnnotationCheck {

	public static void main(String[] args) {
		UserAnnotationCheck sample = new UserAnnotationCheck();
		sample.checkAnnotations(UserAnnotation.class);

	}
	public void checkAnnotations(Class useClass) {
		Method[] methods= useClass.getDeclaredMethods();
		for(Method tempMethod:methods) {
			UserAnnotation annotation = 
					tempMethod.getAnnotation(UserAnnotation.class); //2
			if(annotation!=null) {
				int number = annotation.number(); //3
				String text = annotation.text(); 
				System.out.println(tempMethod.getName());
			}
			else {
				System.out.println(tempMethod.getName()
						+"() : annotations is null.");
			}
		
		}

	}

}
