package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Annagram {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("dcba");
		words.add("bcda");
		words.add("ff");
		words.add("cdba");
		words.add("fscsdf");
		words.add("ff");
		
		ArrayList<String> words1 = new ArrayList<String>();
		
		for(int i=0;i<words.size();i++) {
			char ch[] = words.get(i).toCharArray();
			Arrays.sort(ch);
			String s1 = String.valueOf(ch);
			words1.add(s1);
		}
		
		int count=0;
		for(int i=0;i<words1.size()-1;i++) {
			for(int j=i+1;j<words1.size();j++) {
				if(words1.get(i).equals(words1.get(j))) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
