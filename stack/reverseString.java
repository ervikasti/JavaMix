package stack;
import java.util.Stack;
import java.util.Scanner;
public class reverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String s1 = sc.nextLine();
		String s2="";
		Stack obj = new Stack();
		//push
		for(int i=0;i<s1.length();i++) {
			obj.push(s1.charAt(i));
		}
		//pop out 
		for(int i=0;i<s1.length();i++) {
			s2 = s2+obj.pop();
		}
		System.out.println(s2);

	}

}
