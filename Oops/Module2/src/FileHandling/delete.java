package FileHandling;

import java.io.File;

public class delete {
	public static void main(String args[]) {
		File ref=new File("E:/Java Jspider/FILEIO","Demo.txt"); //Delete File
		//File ref=new File("E:/Java Jspider/","FILEIO");----->Delete Folder
		boolean bool=ref.exists();
		if(bool==true) {
			ref.delete();
			System.out.println("Delete Completed");
		}
		else {
			System.out.println("File/Folder Not Found");
		}
	}

}
