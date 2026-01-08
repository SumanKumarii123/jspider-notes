package FileHandling;

import java.io.File;

public class FileFound {
	public static void main(String[] args) {
		File ref=new File("E:/Java Jspider/FILEIO");
		String[] arr=ref.list();
		for(int i=0;i<arr.length;i++) {
			File obj=new File(ref,arr[i]);
			boolean bool=obj.isFile();
			if(bool==true) {
				System.out.println(arr[i]);
			}
		}
	}

}
