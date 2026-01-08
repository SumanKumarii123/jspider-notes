package FileHandling;

import java.io.File;

//Create a folder
public class Folder {
	public static void main(String[] args) {
		File ref=new File("E:/Java Jspider/FILEIO");
		boolean bool=ref.exists();
		if(bool==false) {
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else {
			System.err.println("Alert : File/Folder Exists");
		}
	}
}
