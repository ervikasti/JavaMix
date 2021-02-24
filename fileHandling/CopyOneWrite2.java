package fileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyOneWrite2 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream obj1 = new FileInputStream("C:\\Users\\draka\\eclipse-workspace\\OOP\\src\\fileHandling\\Logfile.txt");
		String s1 = "";
		int temp=-1;
		while((temp=obj1.read())!=-1) {
			s1 = s1+(char)temp;
		}
		obj1.close();
		
		//Converting string into string array
		String s[] = s1.split(" ");
		//Writing user name into User.txt
		FileOutputStream obj2 = new FileOutputStream("C:\\Users\\draka\\eclipse-workspace\\OOP\\src\\fileHandling\\User.txt");
		//write method only write one character at a time not a complete string
		for(int i=0;i<s.length;i=i+2) {
			char ch[] = s[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				obj2.write(ch[j]);
			}
			obj2.write(' ');
		}
		obj2.close();
		
		//Writing Pswd in Pswd.text
		FileOutputStream obj3 = new FileOutputStream("C:\\Users\\draka\\eclipse-workspace\\OOP\\src\\fileHandling\\Pswd.txt");
		//write method only write one character at a time not a complete string
		for(int i=1;i<s.length;i=i+2) {
			char ch[] = s[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				obj3.write(ch[j]);
			}
			obj3.write(' ');
		}
		obj3.close();
	}

}
