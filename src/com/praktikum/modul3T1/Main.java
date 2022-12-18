package com.praktikum.modul3T1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // inisiate Scanner dan object
        Scanner inputData = new Scanner(System.in);
        balok obj = new balok();

        //input panjang balok
        System.out.print("Masukkan Panjang  : ");
        obj.setPanjangBalok(inputData.nextInt());

        //input lebar balok
        System.out.print("Masukkan Lebar    : ");
        obj.setLebarBalok(inputData.nextInt());

        //input tinggi balok
        System.out.print("Masukkan tinggi   : ");
        obj.setTinggiBalok(inputData.nextInt());
        obj.hasil();
    }
}
