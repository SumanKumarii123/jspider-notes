package FileHandling;

import java.io.File;
import java.io.IOException;

//Create a File
public class CreateFile {
	public static void main(String args[]) {
		File ref=new File("E:/Java Jspider/FILEIO/","Demo.txt");
		boolean bool=ref.exists();
		if(bool==false) {
			try {
				ref.createNewFile();
				System.out.println("File created");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println();
		}
	}

}


