package Pegawai;

import java.util.Scanner;

interface Gaji {
    int hitungGaji(int jamMasuk, int jamKeluar, int jumlahAnak);
}

class Supervisor implements Gaji {
    private final int gajiPokok = 10000000;
    private final int transport = 1000000;
    private final int lemburPerJam = 10000;
    private final int tunjanganIstri = 300000;
    private final int tunjanganAnak = 100000;
    private final int tunjanganAnakDua=200000;
    @Override
    public int hitungGaji(int jamMasuk, int jamKeluar, int jumlahAnak) {
        int totalGaji = gajiPokok + transport;
        int jamKerja = jamKeluar - jamMasuk;

        if (jamMasuk > 7) {
            totalGaji -= 100000 * (jamMasuk - 7);
        }

        if (jamKeluar < 16) {
            totalGaji -= 100000 * (16 - jamKeluar);
        }

        if (jamKerja > 9) {
            totalGaji += lemburPerJam * (jamKerja - 9);
        }

        totalGaji += tunjanganIstri;

        if (jumlahAnak == 1) {
            totalGaji += tunjanganAnak;
        } else if (jumlahAnak > 1) {
            totalGaji += tunjanganAnakDua;
        }
        return totalGaji;
    }
}

class HRD implements Gaji {
    private final int gajiPokok = 5000000;
    private final int transport = 750000;
    private final int lemburPerJam = 7500;
    private final int tunjanganIstri = 250000;
    private final int tunjanganAnak = 90000;
    private final int tunjanganAnakDua=190000;
    @Override
    public int hitungGaji(int jamMasuk, int jamKeluar, int jumlahAnak) {
        int totalGaji = gajiPokok + transport;
        int jamKerja = jamKeluar - jamMasuk;

        if (jamMasuk > 7) {
            totalGaji -= 100000 * (jamMasuk - 7);
        }

        if (jamKeluar < 16) {
            totalGaji -= 100000 * (16 - jamKeluar);
        }

        if (jamKerja > 9) {
            totalGaji += lemburPerJam * (jamKerja - 9);
        }

        totalGaji += tunjanganIstri;

        if (jumlahAnak == 1) {
            totalGaji += tunjanganAnak;
        } else if (jumlahAnak > 1) {
            totalGaji += tunjanganAnakDua;
        }

        return totalGaji;
    }
}

class Teknisi implements Gaji {
    private final int gajiPokok = 3000000;
    private final int transport = 500000;
    private final int lemburPerJam = 5000;
    private final int tunjanganIstri = 200000;
    private final int tunjanganAnak = 75000;
    private final int tunjanganAnakDua=150000;
    @Override
    public int hitungGaji(int jamMasuk, int jamKeluar, int jumlahAnak) {
        int totalGaji = gajiPokok + transport;
        int jamKerja = jamKeluar - jamMasuk;

        if (jamMasuk > 7) {
            totalGaji -= 100000 * (jamMasuk - 7);
        }

        if (jamKeluar < 16) {
            totalGaji -= 100000 * (16 - jamKeluar);
        }

        if (jamKerja > 9) {
            totalGaji += lemburPerJam * (jamKerja - 9);
        }

        totalGaji += tunjanganIstri;

        if (jumlahAnak == 1) {
            totalGaji += tunjanganAnak;
        } else if (jumlahAnak > 1) {
            totalGaji += tunjanganAnakDua;
        }

        return totalGaji;
    }
}

class Karyawan implements Gaji {
    private final int gajiPokok = 1500000;
    private final int transport = 250000;
    private final int lemburPerJam = 10000;
    private final int tunjanganIstri = 300000;
    private final int tunjanganAnak = 60000;
    private final int tunjanganAnakDua=130000;
    @Override
    public int hitungGaji(int jamMasuk, int jamKeluar, int jumlahAnak) {
        int totalGaji = gajiPokok + transport;
        int jamKerja = jamKeluar - jamMasuk;

        if (jamMasuk > 7) {
            totalGaji -= 100000 * (jamMasuk - 7);
        }

        if (jamKeluar < 16) {
            totalGaji -= 100000 * (16 - jamKeluar);
        }

        if (jamKerja > 9) {
            totalGaji += lemburPerJam * (jamKerja - 9);
        }

        totalGaji += tunjanganIstri;

        if (jumlahAnak == 1) {
            totalGaji += tunjanganAnak;
        } else if (jumlahAnak > 1) {
            totalGaji += tunjanganAnakDua;
        }

        return totalGaji;
    }
}
