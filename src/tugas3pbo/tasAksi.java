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
    }
    
}
