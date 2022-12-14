package part27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioSample {

	public static void main(String[] args) {
		NioSample sample = new NioSample();
		sample.basicWriteAndRead();

	}
	public void basicWriteAndRead() {
		String fileName="\\godofjava\\text\\nio.text";
		try {
			writeFile(fileName, "my first NIO sample.");
			readFile(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeFile(String fileName, String data) throws Exception {
		FileChannel channel = new FileOutputStream(fileName).getChannel(); //1
		byte [] byteData =data.getBytes();
		ByteBuffer buffer =ByteBuffer.wrap(byteData); //2
		channel.write(buffer); //3
		channel.close();
	}
	
	public void readFile(String fileName) throws Exception {
		FileChannel channel = new FileInputStream(fileName).getChannel(); //4
		ByteBuffer buffer = ByteBuffer.allocate(1024); //5
		channel.read(buffer); //6
		buffer.flip(); //7
		while(buffer.hasRemaining()) { //8
			System.out.print((char)buffer.get()); //9
		}
		channel.close();
	}

}
