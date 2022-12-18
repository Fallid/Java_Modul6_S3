package com.praktikum.quiz1;
import java.util.Scanner;
public class bonusKaryawan {

    public static void main(String[] args) {
        int indexKaryawan, jamKaryawan, kehadiranHari , satuMinggu = 5, jamBonus = 40, gajiKaryawan = 500000;
        double bonusGaji, bonus1 = 1.5, bonus2= 2.0;
        Scanner inputData = new Scanner(System.in);


        System.out.print("Masukkan nilai karyawan                       : ");
        indexKaryawan = inputData.nextInt();
        System.out.print("Berapa jam karyawan bekerja dalam seminggu    : ");
        jamKaryawan = inputData.nextInt();
        System.out.print("Berapa hari karyawan bekerja dalam seminggu   :");
        kehadiranHari = inputData.nextInt();
        if (indexKaryawan >= 9 && indexKaryawan <= 10 && jamKaryawan > jamBonus && kehadiranHari == satuMinggu){
            bonusGaji = gajiKaryawan * bonus2;
            System.out.println("Gajih Bonus karyawan adalah " + bonusGaji);
        }else if (indexKaryawan >= 9 && indexKaryawan <= 10 && jamKaryawan <=jamBonus && jamKaryawan >= 35 && kehadiranHari == satuMinggu){
            bonusGaji = gajiKaryawan * bonus1;
            System.out.println("Gajih Bonus karyawan adalah " + bonusGaji);

        }else {
            System.out.println("Karyawan tersebut tidak mendapatkan bonus");
        }
    }
}
