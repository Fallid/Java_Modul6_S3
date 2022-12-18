package com.praktikum.modul1T2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        String inputNim, rulesNIM = "(.*)10370311(.*)";
        int nim;
        do {
            try {
                System.out.print("Masukkan NIM : ");
                inputNim = inputData.nextLine();
                nim = inputNim.length();

                if (inputNim.matches(rulesNIM) && nim == 15) {
                    System.out.println("\nData berhasil dibuat!! \n===============\n");
                    System.out.println("NIM         : " + inputNim);
                    System.exit(100);
                } else if (inputNim.matches("[a-zA-Z]+")) {
                    throw new NumberFormatException("Fromat NIM yang dimasukkan salah");
                } else if (nim < 15) {
                    throw new Exception("NIM Anda kurang dari 15");
                } else if (nim > 15) {
                    throw new Exception("NIM Anda lebih dari 15");
                } else if (!inputNim.matches(rulesNIM)) {
                    throw new Exception("Kode NIM tidak ditemukan (10370311)");
                } else {
                    System.exit(404);
                }
            } catch (Exception error) {
                System.out.println(error);
            }
        }while (true);
    }
}
