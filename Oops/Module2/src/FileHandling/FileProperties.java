package FileHandling;

import java.io.File;
class Example{
	static void showFileProperties(File obj) {
		System.out.println("Location : "+obj.getAbsolutePath());
		System.out.println("Length : "+obj.length());
	}
}
public class FileProperties {
	public static void main(String[] args) {
		File ref=new File("E:/Java Jspider/FILEIO/Demo.txt");
		Example.showFileProperties(ref);
	}
}
