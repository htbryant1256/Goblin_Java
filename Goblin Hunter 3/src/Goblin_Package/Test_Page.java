package Goblin_Package;

import java.util.Scanner;

public class Test_Page {
	
	public static void main(String[] args) {
		int random = 1;
		
		while(random == 1) {
		
			Scanner scan = new Scanner(System.in);
			String string2 = "Summa lumma dumma lumma";
	
			System.out.println("Type the word: " + string2);
			String string1 = scan.nextLine();
	
			
			
			if((string1.toUpperCase()).equals(string2.toUpperCase())) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("You Did it!");
				random = 0;
			
			} else {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("You Did not do it!");
			}
		
		}
		System.out.println("The End!");

	}
}
