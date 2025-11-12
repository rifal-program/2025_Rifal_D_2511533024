package pekan7_2511533024;

import java.util.Scanner;

public class string2_2511533024 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("nama depan: ");
		String firstname= input.nextLine();
		System.out.print("nama belakang: ");
		String lastname= input.nextLine();
		String txt1 = "dosen\"intelektual\"kampus";
		System.out.println("nama lengkap: "+firstname + " " + lastname);
		System.out.println("nama lengkap: "+firstname.concat(lastname));
		System.out.println(txt1);
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("x+y="+z);
		String a = "10";
		String b = "20";
		String c = a + b;
		System.out.println("string a + string b ="+c);
		String v = a + y;
		System.out.println("String a integer y ="+v);
	}
}
