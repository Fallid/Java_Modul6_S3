package com.praktikum.modul6;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class ini untuk memanipulasi input user dan Arrays
 * @author Ahmad Naufal
 */
public class Tugas1 {

        /**
         * @see  []TempNumber untuk menyimpan semua data number beserta nilai null
         * @see  []inNumber untuk menyimpan data number tanpa nilai null
         * @see  []TempString untuk menyimpan semua data string beserta nilai null
         * @see  []inString untuk menyimpan data string tanpa nilai null
         */
    public static void main(String[] args) {
        int []TempNumber;
        int []inNumber;
        String []TempString;
        String []inString;

        String stringUser; //Variabel untuk menyimpan data user
        int index, indexNum = 0, indexStr = 0; //Variabel untuk manipulasi index array
        int stopped = 0; //variabel untuk membatasi jumlah brp kali inputan

        //inisiasi scanner
        Scanner inputData = new Scanner(System.in);

        //Defensif Program
        try {
            //inisiasi Buffered untuk membuat file, mamasukkan data ke dalam file, dan membaca data file
            //untuk data Number
            BufferedWriter numWriter = new BufferedWriter(new FileWriter("NumberArray.txt"));
            BufferedReader numReader = new BufferedReader(new FileReader("C:\\Latihan Ngoding\\JavaTutorial\\Modul1S3\\NumberArray.txt"));
            //untuk data String
            BufferedWriter strWriter = new BufferedWriter(new FileWriter("StringArray.txt"));
            BufferedReader strReader = new BufferedReader(new FileReader("C:\\Latihan Ngoding\\JavaTutorial\\Modul1S3\\StringArray.txt"));

            //input berapa banyak data yang ingin dimasukkan
            System.out.print("Masukkan jumlah inputan : ");
            index = inputData.nextInt();
            inputData.nextLine();
            //temp array yang max array sesuai dengan jumlah inputan
            TempNumber = new int[index];
            TempString = new String[index];

            //perulangan dimana jika jumlah inputan sama dengan nilai stopped maka perulangan berhenti
            while (stopped != index) {
                stopped++;
                System.out.print("Masukkan Data : ");
                stringUser = inputData.nextLine();
                //filter untuk mengankap jika data yang dimasukkan adalah number
                if (stringUser.matches("[0-9]+")) {
                    TempNumber[indexNum] = Integer.parseInt(stringUser);
                    indexNum++;
                }
                //filter untuk mengankap data yang bukan number
                else {
                    TempString[indexStr] = stringUser;
                    indexStr++;
                }
            }
            //Array final dimana data yg disimpan nanti bersifat pasti dan sudah di filter
            inString = new String[indexStr];
            inNumber = new int[indexNum];

            //mengambil data data yang ada di temp array kemudian dipindah ke array final, data yang bersifat null tidak akan dipindah ke array final
            System.arraycopy(TempString, 0, inString, 0, indexStr);
            System.arraycopy(TempNumber, 0, inNumber, 0, indexNum);

            //Menulis data yang sudah difilter ke dalam sebuah file txt
            numWriter.write("Array Number : " + Arrays.toString(inNumber));
            numWriter.close();
            strWriter.write("Array String : " + Arrays.toString(inString));
            strWriter.close();
            //Menampilkan data yang sudah dimasukkan ke terminal
            System.out.println(numReader.readLine());
            System.out.println(strReader.readLine());
        }catch (Exception err){
            System.out.println(err);
        }
    }


}
