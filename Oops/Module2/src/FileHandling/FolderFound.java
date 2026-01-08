package FileHandling;

import java.io.File;

public class FolderFound {
	public static void main(String[] args) {
		File ref=new File("E:/Java Jspider");
		String[] arr=ref.list();
		for(int i=0;i<arr.length;i++) {
			File obj=new File(ref,arr[i]);
			boolean bool=obj.isDirectory();
			if(bool==true) {
				System.out.println(arr[i]);
			}
		}
	}

}
