package pekan7_2511533024;

import java.util.Scanner;

public class panggilmahasiswa3_2511533024 {
	public static void main (String[] args) {
		mahasiswa_2511533024 a= new mahasiswa_2511533024();
		Scanner input= new Scanner(System.in);
		System.out.print("nim: ");
		a.setnim2(input.nextLine());
		System.out.print("nama: ");
		a.setnama(input.nextLine());
		if(a.getnim2().startsWith("25")) {
			System.out.println(a.getnama()+ "anda angkatan 2025");
		}
		if(a.getnim2().contains("2511533024")) {
			System.out.println(a.getnama()+ "anda mahasiswa informatika");
		}
		a.cetak2();
		input.close();
	}
}
