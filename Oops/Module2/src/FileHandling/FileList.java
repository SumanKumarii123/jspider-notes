package FileHandling;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		//File ref=new File("E:/Java Jspider/FILEIO");
		File ref=new File("E:/");
		String[] arr=ref.list();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
