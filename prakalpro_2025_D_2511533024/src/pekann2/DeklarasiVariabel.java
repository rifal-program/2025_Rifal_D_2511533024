package pekann2;

public class DeklarasiVariabel {
     /* program java
      * latihan
      * tentang pendeklarasian variabel
      */
      static int umur=25; /* variabel dapat lansung diinisiasi */
      public static void main(String [] args) {
    	  int kode;
    	  boolean isDibawahUmur; /* perhatikan penulisan nama variabel */
    		kode = 1234; /* pengisisan variabel (assigment)*/
    	  double gaji; /* deklarasi variabel dapat dimana saja */
    	  gaji = 5500000.23;
    	  isDibawahUmur = true;
    	  System.out.println("status: "+isDibawahUmur);
    	  System.out.println("kode:"+kode);
    	  System.out.println("umur:"+umur);
    	  System.out.println("Gaji:"+gaji);
    	 
      }
      
}
