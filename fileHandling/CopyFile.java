package fileHandling;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter path of files along with file name and extension to copy");
		//Reading data from Afile.txt
		FileInputStream read = new FileInputStream(sc.nextLine());
		int temp = -1;
		//Writing to Bfile.txt file
		System.out.println("Path were to copy with file_name.extension");
		 FileOutputStream write = new FileOutputStream(sc.nextLine());
		 
		while((temp = read.read())!= -1) {
			
			write.write((char)temp);
		}
		read.close();
		
		 //closing
		 write.close();
		 sc.close();
	}

}
