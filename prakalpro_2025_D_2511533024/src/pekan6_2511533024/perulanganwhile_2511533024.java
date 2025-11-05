package pekan6_2511533024;

import java.util.Scanner;

public class perulanganwhile_2511533024 {
	public static void main (String[] args) {
		int counter=0;
		String jawab;
		boolean running = true;
		//deklarasi scanner
		Scanner scan = new Scanner (System.in);
		while (running) {
			counter++;
			System.out.println("jumlah = "+counter);
			System.out.print("apakah lanjut (ya / tidak ?)");
			jawab= scan.nextLine ();
			//cek jawab = tidak,perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running= false;
				
			}
		}
		System.out.println("anda sudah melakukan perulangan sebanyak " + counter+" kali");
	}
}
