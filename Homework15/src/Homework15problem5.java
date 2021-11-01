/*
 * Name:Yingcan Chen
 *NetID: ychen192
 *Assignment Number:15
 *Lab Section:T/R 18:15-19:30
 *I did not collaborate with anyone on this assignment*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework15problem5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the name of file: ");
		String filename = scanner.nextLine();
		try {

			Scanner in = new Scanner(new File(filename));
			while (in.hasNext()) {
				String line = in.nextLine();
				System.out.println(line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("couldn't find file: " + filename);
		}
	}

}