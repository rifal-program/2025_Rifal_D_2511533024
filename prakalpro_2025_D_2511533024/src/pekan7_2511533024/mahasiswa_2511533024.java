package pekan7_2511533024;

public class mahasiswa_2511533024 {
	//variabel global
	private int nim;
	private String nama,nim2;
	//membuat mutator (settter)
	public void setnim (int nim) {
		this.nim=nim;
	}
	public void setnim2 (String nim2) {
		this .nim2=nim2;
	}
	public void setnama (String nama) {
		this.nama=nama;
	}
	//membuat accessor (getter)
	public int getnim() {
		return nim;
	}
	public String getnim2() {
		return nim2;
	}
	public String getnama() {
		return nama;
	}
	//metode lain
	public void cetak() {
		System.out.println("nim : "+nim);
		System.out.println("nama : "+nama);
	}
	public void cetak2() {
		System.out.println("nim : "+nim2);
		System.out.println("nama : "+nama);
	}
}
