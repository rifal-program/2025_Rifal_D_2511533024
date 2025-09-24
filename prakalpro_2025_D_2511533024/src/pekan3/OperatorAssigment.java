package pekan3;
import java.util.Scanner;
public class OperatorAssigment {
	public static void main (String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("input angka-1:");
		A1 = keyboard.nextInt();//input 10 
		System.out.print("input angka-:");
		A2 = keyboard.nextInt();
		keyboard.close();//input 5
		System.out.println("Assigment penambahann");
		A1 += A2;//penambahan,sekarang A1 = 15
		System.out.println("penambahan :" + A1);
		System.out.println("Assigment pengurangan");
		A1 -= A2;//pengurangan,sekarang A1 = 10
		System.out.println("pengurangan :" + A1);
		System.out.println("Assigment perkalian");
		A1 *= A2;//perkalian,sekarang A1 = 50
		System.out.println("perkalian :" + A1);
		System.out.println("Assigment hasil bagi");
		A1 /= A2;//hasil bagi,sekarang A1 = 10
		System.out.println("hasil bagi :" + A1);
		System.out.println("Assigment sisa bagi");
		A1 %= A2;//sisa bagi,sekarang A1 = 0
		System.out.println("sisa bagi :" + A1);
   }
}