import java.util.Scanner;

public class GudangOke {
    public static void main(String[] args) {
        String hastag = "##################";

        // Create scanner object
        Scanner sc = new Scanner(System.in);

        // Get nama
        System.out.println("Masukkan nama anda : ");
        String nama = sc.nextLine();

        System.out.println("Stok Gudang Input Barang");
        System.out.println(hastag);
        System.out.println("Selamat Datang " + nama);

        // Stok Gudang
        System.out.println("Masukkan nama barang yang mau ditambah : ");
        String nama_barang = sc.nextLine();
        System.out.println("Masukkan jumlah barang yang mau ditambah : ");
        int jumlah_barang = sc.nextInt();
        System.out.println("Masukkan harga beli untuk barang tersebut : ");
        double harga_beli = sc.nextDouble();
        System.out.println("Masukkan harga jual untuk barang tersebut : ");
        double harga_jual = sc.nextDouble();

        // Rincian Barang
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println(hastag);
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Jumlah Barang : " + jumlah_barang);
        System.out.println("Harga Beli : " + harga_beli);
        System.out.println("Harga Jual : " + harga_jual);
    }
}
