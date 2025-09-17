package pekan1;

public class membuatkue {
    public static void main (String [] args) {
    	makebatter();
    	memanggang();
    	memanggang();
    	menghias();
    }
    // Langkah 1: buat adonan kue.
    public static void makebatter() {
    	System.out.println("campur bahan kering.");
    	System.out.println("krim mentega dan gula.");
    	System.out.println("kocok telurnya.");
    	System.out.println("masukan bahan kering.");
    }
    // Langkah 2: panggang sekumpulan kue.
    public static void memanggang () {
    	System.out.println("setel suhu oven.");
    	System.out.println("setel pengatur waktu");
    	System.out.println("masukan kue ke dalam oven.");
    	System.out.println("biarkan cookie untuk dipanggang.");
    }
    // Langkah 3: Hiasi cookie.
    public static void menghias() {
    	System.out.println("campur bahan untuk forsting.");
    	System.out.println("taburkan frosting dan taburkan.");
    }
}
