package Pegawai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan kode pegawai (SPV/HRD/TKN/KRY):");
        String kode = input.next();
        System.out.println("Masukkan jam masuk:");
        int jamMasuk = input.nextInt();
        System.out.println("Masukkan jam keluar:");
        int jamKeluar = input.nextInt();
        System.out.println("Masukkan jumlah anak:");
        int jumlahAnak = input.nextInt();

        Gaji pegawai = null;
        switch (kode) {
            case "SPV":
                pegawai = new Supervisor();
                break;
            case "HRD":
                pegawai = new HRD();
                break;
            case "TKN":
                pegawai = new Teknisi();
                break;
            case "KRY":
                pegawai = new Karyawan();
                break;
        
            default:
                System.out.println("Kode pegawai tidak valid!");
                System.exit(0);
        }

        if (pegawai != null) {
            int totalGaji = pegawai.hitungGaji(jamMasuk, jamKeluar, jumlahAnak);
            System.out.println("Total gaji: Rp " + totalGaji);
        }

        input.close();
    }
}
