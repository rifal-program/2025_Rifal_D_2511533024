package pekan3;

import java.util.Scanner;
public class operatoraritmatika {
    public static void main (String[] args) {
    	int A1;
    	int A2;
    	int hasil;
    	Scanner keyboard = new Scanner (System.in);
    	System.out.print("input angka-1: ");
    	A1 = keyboard.nextInt();
    	System.out.print("input angka-2: ");
    	A2 = keyboard.nextInt();
    	System.out.println("operator penjumlahan");
    	hasil = A1 + A2; //penjumlahan
    	System.out.println("Hasil = " + hasil);
    	System.out.println("operator pengurangann");
    	hasil = A1 - A2;//pengurangann
    	System.out.println("Hasil = " + hasil);
    	System.out.println("operator perkalian");
    	hasil = A1 * A2;//perkalian
    	System.out.println("Hasil = " + hasil);
    	System.out.println("operator hasil bagi");
    	hasil = A1 / A2;//pembagian 
    	System.out.println("Hasil = " + hasil);
    	System.out.println("operator sisa bagi");
    	hasil = A1 % A2;//sisa bagi
    	System.out.println("Hasil = " + hasil);

    }
}
