package pat20;

public class JavaLangSystem {

	public static void main(String[] args) {
		
		JavaLangSystem sample = new JavaLangSystem();
//		sample.systemPropertiesCheck();
//		sample.numberMinMaxElapsedCheck();
		sample.printNull();
	}
	public void systemPropertiesCheck() {
//		System.out.println("java.version="+System.getProperty("java.version"));
		System.out.println("JAVA_HOME="+System.getenv("JAVA_HOME"));
	}
	
	public void numberMinMaxElapsedCheck() {
		long startTime = System.currentTimeMillis();
		long startNanoTime = System.nanoTime();
		JavaLangNumber sample = new JavaLangNumber();
		sample.integerMinMaxCheckBinary();
		System.out.println("Milli second=" + (System.currentTimeMillis()-startTime));
		System.out.println("Nano second=" + (System.nanoTime()-startNanoTime));
		System.out.println(System.currentTimeMillis());
	}
	public void printNull() {
		Object obj = null;
		System.out.println(obj);
//		System.out.println(obj.toString());
//		System.out.println();
	}

}
