import java.util.Scanner;

// Class untuk menampung Method (Fungsi di dalam class)
class SistemPenilaian {
    // 1. Method Non-Return Type (Void) TANPA Parameter
    public void tampilkanWatermark() {
        System.out.println("=================================");
        System.out.println("   PROGRAM PENILAIAN MAHASISWA   ");
        System.out.println("     WATERMARK: KELOMPOK 09      ");
        System.out.println("=================================");
    }

    // 2. Method Return Type TANPA Parameter
    public String getMataKuliah() {
        return "Dasar Pemrograman";
    }
}

// NAMA CLASS INI HARUS SAMA DENGAN NAMA FILE: TugasPraktikum.java
public class TugasPraktikum {

    // 3. Function Return Type BERPARAMETER (Fungsi static)
    public static String tentukanStatus(int nilai) {
        // PENGKONDISIAN (if-else)
        if (nilai >= 70) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }

    // 4. Function Non-Return Type (Void) BERPARAMETER
    public static void cetakHasil(String nama, String status) {
        System.out.println("-> Hasil: " + nama + " dinyatakan " + status + "\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pembuatan objek dari class SistemPenilaian
        SistemPenilaian sistem = new SistemPenilaian();

        // Pemanggilan Method dari objek
        sistem.tampilkanWatermark();
        System.out.println("Mata Kuliah: " + sistem.getMataKuliah());
        System.out.println("---------------------------------");

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahData = input.nextInt();
        input.nextLine(); // Membersihkan buffer karakter newline dari input.nextInt()

        // PERULANGAN (for loop)
        for (int i = 1; i <= jumlahData; i++) {
            System.out.println("Data Mahasiswa ke-" + i + ":");

            // Input nama mahasiswa
            System.out.print("  Nama Mahasiswa : ");
            String nama = input.nextLine();

            // Input nilai mahasiswa
            System.out.print("  Nilai (0-100)  : ");
            int nilai = input.nextInt();
            input.nextLine(); // Membersihkan buffer newline

            // Pemanggilan Function Return Type Berparameter
            String statusKelulusan = tentukanStatus(nilai);

            // Pemanggilan Function Non-Return Type Berparameter
            cetakHasil(nama, statusKelulusan);
        }

        System.out.println("Pendataan Kelompok 09 Selesai. Terima kasih.");
        input.close();
    }
}
