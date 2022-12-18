package com.praktikum.modul5;
import java.util.Arrays;
import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        //inisiasi scanner
        Scanner inputData = new Scanner(System.in);

        //list number sebelum disoring
        int [] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        System.out.println("Numbers :  " + Arrays.toString(arr));
        //Sorting API dengan Arrays.sort
        Arrays.sort(arr);
        //Mengubah numbers yang sudah disorting menjadi String untuk ditampilkan
        String finSort = Arrays.toString(arr);
        //Menampilkan hasil sorting
        System.out.println("Sorting : " + finSort);

        //Searching
        try {
            do {
            System.out.print("Masukkan angka yang ingin dicari : ");
            int user = inputData.nextInt();
            int search = Arrays.binarySearch(arr, user);
                if (search >= 0){
                    System.out.println("Data " + user + " berhasil ditemukan pada index : " + search);
                    System.exit(100);
                }else {
                    System.out.println("Maaf data yang dicari tidak ditemukan!\n");
                }
            }while (true);
        }catch (Exception error){
            System.out.println("Ups terjadi kesalahan \n" + error);
        }

    }
}
