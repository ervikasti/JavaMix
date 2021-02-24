package fileHandling;
//Here we will read from User.txt and pswd.txt file and write to Log2file.txt
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assign3 {
		public static void main(String[] args) throws FileNotFoundException,IOException {
			
		
		FileInputStream obj1 = new FileInputStream("C:\\Users\\draka\\eclipse-workspace\\OOP\\src\\fileHandling\\User.txt");
		String s1 = "";
		int temp = -1;
		while((temp = obj1.read())!=-1) {
			s1 = s1+(char)temp;
		}
		
		
		FileInputStream obj2 = new FileInputStream("C:\\Users\\draka\\eclipse-workspace\\OOP\\src\\fileHandling\\Pswd.txt");
		String s2 = "";
		temp = -1;
		while((temp = obj2.read())!=-1) {
			s2 = s2+(char)temp;
		}
		
		
		
		//Writing to log2file.txt
		FileOutputStream obj3 = new FileOutputStream("C:\\Users\\draka\\eclipse-workspace\\OOP\\src\\fileHandling\\Log2file.txt");
		String s1arr[] = s1.split(" ");
		String s2arr[] = s2.split(" ");
		for(int i=0;i<s1arr.length;i++) {
			
			for(int j=0;j<s1arr[i].length();j++) {
				obj3.write(s1arr[i].charAt(j));
			}
			obj3.write(' ');
			
			for(int k=0;k<s2arr[i].length();k++) {
				obj3.write(s2arr[i].charAt(k));
			}
			obj3.write(' ');
		}
		obj3.close();
		obj1.close();
		obj2.close();
	}
}