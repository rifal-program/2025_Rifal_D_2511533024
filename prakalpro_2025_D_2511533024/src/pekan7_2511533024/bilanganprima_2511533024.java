package pekan7_2511533024;

import java.util.Scanner;

public class bilanganprima_2511533024 {
	public static boolean isprime(int n) {
		int factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors++;
			}
		}
		return ( factors == 2);
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input nilai n = ");
		int a = input.nextInt();
		if (isprime(a)) {
			System.out.println(a + " adalah bilangan prima");
		} else
			System.out.println(a + "bukan bilangan prima");
	}
}
