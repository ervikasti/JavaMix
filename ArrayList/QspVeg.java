package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class QspVeg {
//SouthIndianFood --> SIF
//NorthIndianFood --> NIFSIF
	//ChineseFood --> CF
	public static void main(String[] args) {
		
		ArrayList<menuCard> SIF = new ArrayList<menuCard>();
		SIF.add(new menuCard("Idli",20,5));
		SIF.add(new menuCard("Dosa",30,10));
		SIF.add(new menuCard("Dosa",30,10));
		
		ArrayList<menuCard> NIF = new ArrayList<menuCard>();
		NIF.add(new menuCard("Vada Pav",15,5));
		NIF.add(new menuCard("Bhel",25,3));
		
		ArrayList<menuCard> CF = new ArrayList<menuCard>();
		CF.add(new menuCard("Machurian",10,12));
		CF.add(new menuCard("Haka Noodle",35,15));
		
		System.out.println(SIF);
		ArrayList<menuCard> SNF = new ArrayList<menuCard>(SIF);
		SNF.addAll(NIF);
		
		ArrayList<menuCard> MIX = new ArrayList<menuCard>(SNF);
		MIX.addAll(CF);
		System.out.println(MIX);
		
		//TO get price by entering food name
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter food name");
		String name = sc.nextLine();
		for (int i = 0; i < MIX.size(); i++) {
			//menuCard obj = (menuCard)(MIX.get(i));
			if(name.equalsIgnoreCase(MIX.get(i).food)) {
				System.out.println(MIX.get(i).price);
			}
			
		}
	
		
		//price 
		Collections.sort(MIX,new priceAsc());
		System.out.println("Asc price "+MIX);
		Collections.sort(MIX,new priceDsc());
		System.out.println("Desc price "+MIX);
		//Foodname
		Collections.sort(MIX,new fnameAsc());
		System.out.println("Fname Asc "+ MIX);
		Collections.sort(MIX,new fnameDsc());
		System.out.println("Fname Dsc "+MIX);
		//time
		Collections.sort(MIX,new timeAsc());
		System.out.println("Time Asc "+ MIX);
		Collections.sort(MIX,new timeDsc());
		System.out.println("Time Dsc "+MIX);
		
		
		HashSet<menuCard> h1 = new HashSet<menuCard>(SIF);
		System.out.println(h1);
		
		
		//Displaying list of food which can be orderd within the given amount
		Collections.sort(MIX); //we are sorting the object based on price by overriding compareTo method of comparable interface
		System.out.println("Enter the max amount");
		int amt = sc.nextInt();
		int sum = 0;
		System.out.println(MIX);
		for(int i=0;i<MIX.size();i++) {
			sum=sum+MIX.get(i).price;
			if(sum<amt) {
				System.out.println(MIX.get(i).food + " "+MIX.get(i).price+" "+sum);
			}
		}
		
		//ordering the food which is greater then the given amount
		System.out.println("Enter the  amount");
		sc.nextLine();
		amt = sc.nextInt();
		sum = 0;
		for(int i=0;i<MIX.size();i++) {
			if(MIX.get(i).price>amt) {
				System.out.println(MIX.get(i).food);
			}
		}
		
		//Sum of all the prices in menuCard
		sum=0;
		for(int i=0;i<MIX.size();i++)
		{
			sum+=MIX.get(i).price;
		}
		System.out.println("SUM of All food price in menu CArd is : "+sum);
		
		sc.close();
	}

}
