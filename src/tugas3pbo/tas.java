package tugas3pbo;
   
public class tas {
    private String merk ;
    private String warna;
    private double harga;
    
    void cetakInfo(){
        System.out.println("warna \t: "+warna+"\n"+
                "merk \t: "+merk+"\n"+"harga \t: "+harga+"\n");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
