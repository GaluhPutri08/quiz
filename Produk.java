package Quiz;

public class Produk {
    private String namaProduk;
    private int harga;

    public Produk (String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public int getHarga(){
        return harga;
    }
    public void TampilInfo(){
        System.out.println("Nama Produk : " +getNamaProduk);
        System.out.println("Harga Produk: " +harga);
    }

    public class BukuDigital{
        protected int jumlahHalaman;

        public String getTampilInfo(){
            System.out.println("Jumlah halaman Buku Digital: " +jumlahHalaman);
        }
    }

    public class KursusOnline{
        protected int durasiVideo;

    }

    public void  
    
}
