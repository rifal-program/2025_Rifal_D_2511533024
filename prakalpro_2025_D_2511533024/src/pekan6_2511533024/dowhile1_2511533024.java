package pekan6_2511533024;

import java.util.Scanner;

public class dowhile1_2511533024 {
	public static void main (String[] args) {
	Scanner console = new Scanner (System.in);
		String pharse;
		do {
			System.out.print("input pasword :");
			pharse = console.next();
		} while (!pharse.equals("abcd"));
	}
}
