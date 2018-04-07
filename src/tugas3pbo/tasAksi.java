package tugas3pbo;
public class tasAksi {
    public static void main(String[] args) {
        tas t = new tas();
        t.setWarna("biru");
        t.setMerk("Alto");
        t.setHarga(500);
        
        t.cetakInfo();
        
        System.out.print("warna \t:");
        System.out.println(t.getWarna());
        System.out.print("merk \t:"); 
        System.out.println(t.getMerk());
        System.out.print("harga \t:");
        System.out.println(t.getHarga());
        
        tasSekolah ts = new tasSekolah();
        ts.setWarna("merah");
        ts.setMerk("Channel");
        ts.setHarga(600);
        ts.setBahan("kain jeans");
        ts.cetakInfo();
        System.out.println("bahan \t:"+ts.getBahan());
        ts.throttle();
  
        tasKoper tk = new tasKoper();
        tk.setWarna("biru tua");
        tk.setMerk("Alto");
        tk.setHarga(650);
        tk.setUkuran("medium");
        tk.cetakInfo();
        System.out.println("ukuran \t:"+tk.getUkuran());
       tk.throttle();
       
       tasLaptop tl = new tasLaptop();
       tl.setWarna("hijau");
       tl.setMerk("bintang");
       tl.setHarga(150);
       tl.setBentuk("kotak");
       tl.cetakInfo();
       System.out.println("bentuk \t:"+tl.getBentuk());
       tl.throttle();
    }
    
}
