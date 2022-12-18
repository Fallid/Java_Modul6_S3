package com.praktikum.modul2T1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        String inputNim, inputEmail, inputNama, inputNomorTelp, inputTanggalLahir, rules = "(.*)@webmail.umm.ac.id", rules2 = "(.*)10370311(.*)", filter1 = "[a-zA-Z]+", filter2= "^.*[~!@#$%^&()_+=\\-{}\\[\\]|:;“’<,>.?๐฿].*$";
        int nim;
        do {
            try {
                //Masukkan NIM User
                System.out.print("Masukkan NIM : ");
                inputNim = inputData.nextLine();
                if (inputNim.isEmpty() ){
                    throw new Exception("NIM tidak boleh kosong!");
                }else if (inputNim.matches(filter2) || inputNim.matches(filter1)){
                    throw new Exception("Format NIM salah!");
                }
                else if (inputNim.length() >15){
                    throw new Exception("NIM lebih dari 15");
                }
                //Masukkan Email User (include @webmail.umm.ac.id)
                System.out.print("Email (@webmail.umm.ac.id) : ");
                inputEmail = inputData.nextLine();
                if (inputEmail.isEmpty()){
                    throw new Exception("Email tidak boleh kosong!");
                }else if (!inputEmail.matches(rules)){
                    throw new Exception("Format email salah!");
                }
                //Masukkan Nama User
                System.out.print("Masukkan Nama : ");
                inputNama = inputData.nextLine();
                //Masukkan Nomor Telp
                System.out.print("Masukkan No Telp : ");
                inputNomorTelp = inputData.nextLine();
                //Masukkan tanggal lahir (opsional)
                System.out.print("Masukkan Tanggal lahir (dd-mm-yyyy) : ");
                inputTanggalLahir = inputData.nextLine();

                //variabel yg menyimpan panjang nim dan formating nim
                nim = inputNim.length();
                //upercase nama user
                inputNama = inputNama.toUpperCase();

                if (inputNim.matches(rules2) && nim == 15 && inputEmail.matches(rules)) {
                    System.out.println("\nData berhasil dibuat!! \n===============\n");
                    System.out.println("NIM         : " + inputNim);
                    System.out.println("Email       : " + inputEmail);
                    System.out.println("Nama        : " + inputNama);
                    System.out.println("No Telp     : " + inputNomorTelp);
                    System.out.println("Tgl Lahir   : " + inputTanggalLahir);
                    System.exit(100);
                }
                //Mengecek format NIM (harus angka)
                else if (inputNim.matches("[a-zA-Z]+")) {
                    throw new NumberFormatException("Fromat NIM yang dimasukkan salah");
                }
                //Mengecek panjang NIM
                else if (nim < 15) {
                    throw new Exception("NIM kurang dari 15 Karakter");
                } else if (nim > 15) {
                    throw new Exception("NIM lebih dari 15 karakter");
                }
                //Mengecek kode NIM (10370311)
                else if (!inputNim.matches(rules2)) {
                    throw new Exception("Kode NIM tidak ditemukan (10370311)");
                }
                //Mengecek email user (harus email UMM)
                else if (!inputEmail.matches(rules)) {
                    throw new Exception("Email yg harus digunakan adalah @webmail.umm.ac.id");
                } else {
                    System.exit(404);
                }
            } catch (Exception error) {
                System.out.println(error);
            }
        }while (true);
    }
}
