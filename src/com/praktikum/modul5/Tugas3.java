package com.praktikum.modul5;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {

    //Proses penghitungan nilai ratio
    public static void elementRatio (int[] arr){
        int negatifNum = 0, positifNum = 0, zeroNum = 0;
        double negaRatio, posRatio, zeroRatio;

        //membandingkan tiap array
        for (int i : arr){
            if (i < 0){
                negatifNum++;
            }else if (i == 0){
                zeroNum++;
            }else {
                positifNum++;
            }
        }
        //Rumus menghitung ratio
        negaRatio = (double)negatifNum / arr.length;
        posRatio = (double)positifNum / arr.length;
        zeroRatio = (double)zeroNum / arr.length;
        //Menampilkan hasil ratio
        System.out.println("Negatif Ratio : " + negaRatio);
        System.out.println("Positif Ratio : " + posRatio);
        System.out.println("Zero Ratio : " + zeroRatio);
    }

    //main drive
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        int sizeArray; int []data;

        System.out.print("Size : ");
        sizeArray = inputData.nextInt();
        data = new int[sizeArray];
        System.out.print("input Data : ");

        //Perulangan untuk memasukkan element ke tiap index
        for (int i = 0; i < sizeArray; i++){
            data[i] = inputData.nextInt();
        }
        Arrays.sort(data);
        String filter = Arrays.toString(data);
        String result = filter.replace("  ", ",");
        System.out.println("Result : " + result);

        elementRatio(data);
    }
}
