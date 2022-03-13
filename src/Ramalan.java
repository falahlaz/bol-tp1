import java.util.Scanner;

public class Ramalan {
    public static void main(String[] args) {
        String heart = "❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤";

        // Intro
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("");

        // Data diri anda
        System.out.println("Data Anda : ");
        System.out.println(heart);
        System.out.println("Masukkan Nama Anda : ");
        String nama_anda = sc.nextLine();
        System.out.println("Masukkan Umur Anda : ");
        int umur_anda = sc.nextInt();
        System.out.println("");

        // Data diri pasangan
        System.out.println("Data Pasangan Anda : ");
        System.out.println(heart);
        System.out.println("Masukkan Nama Pasangan Anda : ");
        String nama_pasangan = sc.next();
        System.out.println("Masukkan Umur Pasangan Anda : ");
        int umur_pasangan = sc.nextInt();
        System.out.println("");

        // Display Hasil ramalan
        System.out.println(nama_anda + " ["+ umur_anda +"] tahun");
        System.out.println("  ❤❤❤❤    ❤❤❤❤");
        System.out.println(" ❤❤❤❤❤   ❤❤❤❤❤");
        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤");
        System.out.println("  ❤❤❤❤❤❤❤❤❤❤");
        System.out.println("    ❤❤❤❤❤❤❤");
        System.out.println("      ❤❤❤❤");
        System.out.println("        ❤");
        System.out.println(nama_pasangan + " ["+ umur_pasangan +"] tahun");
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("");

        // Result
        String result = String.format("%.2f", getRandomNumber()/1.1);
        System.out.println("Kecocokan Anda dengan Pasangan Anda adalah : " + result + " %");
        System.out.println("Terima Kasih karena Anda Telah Menggunakan Jasa Ramalan Kami.. ^^");
    }

    static double getRandomNumber() {
        return (double) ((Math.random() * (100 - 50)) + 50);
    }
}
