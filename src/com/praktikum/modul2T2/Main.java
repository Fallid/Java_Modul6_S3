package com.praktikum.modul2T2;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    String[][] book = new String[100][1];
    String[][] place = new String[100][1];

    void  cekDate (int date) throws  Exception{
        if (date < 2018 || date > 2022){
            throw new Exception("Tahun tidak bisa kurang dari 2018 dan lebih dari 2022");
        }
    }

    void cekFrom (String from) throws Exception{
        for (String[] indexTempat : place){
            if (from.equals(indexTempat[0])){
                throw new Exception("Tempat sudah ada");
            }
        }

    }

    void cekName(String name) throws Exception{
        for (String[] indexNama : book){
            if (indexNama[0] == null){
                break;
            }
            Pattern mencari = Pattern.compile(name, Pattern.CASE_INSENSITIVE);
            Matcher mencocokkan = mencari.matcher(indexNama[0].toLowerCase());
            if (mencocokkan.find()){
                throw new Exception("Buku sudah tersedia");
            }
        }
    }

    void list(){
        for (String[] indexBuku : book){
            if (indexBuku[0] == null){
                break;
            }
            System.out.println( indexBuku[0]);
        }
    }


    public static void main(String[] args) {
        Main method = new Main();
        String inName, inFrom, inDate;
        int inIndex;

        Scanner input = new Scanner(System.in);
        inIndex = 1;

        method.book[0][0] = "This is Book, Malang. 2022";
        method.place[0][0] = "Malang";
        method.place[1][0] = "Bandung";
        method.place[2][0] = "Surabaya";

        System.out.println("Book list   : ");
        while (true){
            method.list();
            try {
                System.out.print("Name      : ");
                inName = input.nextLine();
                method.cekName(inName);

                System.out.print("From      : ");
                inFrom = input.nextLine();
                method.cekFrom(inFrom);

                System.out.print("Date      : ");
                inDate = input.nextLine();
                method.cekDate(Integer.parseInt(inDate));

                method.book[inIndex][0] = inName + "," + inFrom + ". " + inDate;
                method.place[inIndex+2][0] = inFrom;
                inIndex++;
                System.out.println("Berhasil ditambahkan");

                System.out.print("Do you want add more books? [y/n] : ");
                if (input.nextLine().equalsIgnoreCase("n")){
                    break;
                }
            }catch (NumberFormatException error){
                System.out.println("Paramaters must use numbers");
                break;
            }
            catch (Exception e) {
                System.err.println(e.toString().replaceAll("Java.lang.Exception : ", ""));
            }
        }
    }
}
