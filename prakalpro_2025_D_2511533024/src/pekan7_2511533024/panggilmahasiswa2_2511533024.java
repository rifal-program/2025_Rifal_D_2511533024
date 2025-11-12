package pekan7_2511533024;

import java.util.Scanner;

public class panggilmahasiswa2_2511533024 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("nim: ");
		String x= input.nextLine();
		System.out.print("nama: ");
		String y= input.nextLine();
		mahasiswa_2511533024 a= new mahasiswa_2511533024();
		a.setnim2(x);
		a.setnama(y);
		if(x.startsWith("25")) {
			System.out.println(a.getnama ()+ "anda angkatan 2025");
		}
		if(a.getnim2().contains("2511533024")) {
			System.out.println(y+" anda mahasiswa informatika");
		}
		a.cetak2();
		input.close();
	}
}
