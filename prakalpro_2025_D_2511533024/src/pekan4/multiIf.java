package pekan4;

import java.util.Scanner;

public class multiIf {
    public static void main(String[] args) {
    	int umur;
    	int sim;
    	Scanner a=new Scanner(System.in);
    	System.out.print("input umur anda: ");
    	umur= a.nextInt();
    	System.out.println("apakah anda punya sim c: ");
    	sim=a.next().charAt(0);
    	a.close();
    	     if ((umur >= 17)&&(sim=='y')) {
    	    	 System.out.println("anda sudah dewasa dan boleh bawa motor");
    	     }
    	     if ((umur >= 17)&&(sim!='y')) {
    	    	 System.out.println("anda sudah dewasa tetapi tidak boleh bawa motor");
    	     if ((umur < 17)&&(sim!='y')) { 
    	    	System.out.println("anda belum cukup umur bawa motor");
    	     if ((umur < 17)&&(sim=='y')) { 
    	    	 System.out.println("anda belum cukup umur punya sim");
    	    		 }
    	    	 }
    	     }
    	   
    }
}
