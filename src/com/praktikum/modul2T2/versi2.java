package com.praktikum.modul2T2;

import java.util.Scanner;

public class versi2 {
    String rules = "(.*)@webmail.umm.ac.id", rules2 = "(.*)10370311(.*)", filter1 = "[a-zA-Z]+", filter2 = "^.*[~!@#$%^&()_+=\\-{}\\[\\]|:;“’<,>.?๐฿].*$", filter3 = "[0-9]+", error404 = "Error tidak diketahui";
    boolean verifNim = false, verifEmail = false, verifName = false, verifNoTelp = false, verifTglLahir = false, loopNim =true, loopEmail = true, loopNama = true, loopNoTelp= true, loopTgl = true;

    //Verifikasi NIM
    void nimUser(String nim) {
            try {
                if (nim.isEmpty()) {
                    throw new Exception("NIM tidak boleh kosong!");
                } else if (nim.matches(filter1) || nim.matches(filter2)) {
                    throw new Exception("Format NIM salah");
                } else if (nim.length() > 15) {
                    throw new Exception("NIM lebih dari 15 angka");
                } else if (nim.length() < 15) {
                    throw new Exception("NIM kurang dari 15 angka");
                } else if (!nim.matches(rules2)) {
                    throw new Exception("Kode NIM tidak ditemukan!");
                } else if (nim.matches(rules2)) {
                    verifNim = true;
                }else {
                    throw new Exception(error404);
                }
            } catch (Exception errorNIM) {
                System.out.println(errorNIM);
            }
    }

    //Verifikasi email
    void emailUser(String email){
        try{
            if (email.isEmpty()){
                throw new Exception("Email tidak boleh kosong!");
            }else if (!email.matches(rules)){
                throw new Exception("Harus menggunakan email kampus (@webmail.umm.ac.id)");
            }else if (email.matches(rules)){
                verifEmail = true;
            }else {
                throw new Exception(error404);
            }
        }catch (Exception errorEmail){
            System.out.println(errorEmail);
        }
    }

    //Verifikasi nama
    void namaUser(String nama){
        try{
            if (nama.isEmpty()){
                throw new Exception("Nama harus diisi tidak boleh kosong!");
            }else if (nama.matches(filter3) || nama.matches(filter2)){
                throw new Exception("Format nama salah!");
            }else if (!nama.matches(filter3) && !nama.matches(filter2)){
                verifName = true;
            }else {
                throw new Exception(error404);
            }
        }catch (Exception errorNama){
            System.out.println(errorNama);
        }
    }

    void telpUser(String telp){
        try{
            if (telp.isEmpty()){
                throw new Exception("No Telp harus diisi!");
            }else if (telp.length() <12){
                throw new Exception("Tidak termasuk no telp");
            }else if (telp.matches(filter1) || telp.matches(filter2)){
                throw new Exception("Format no telp salah!");
            }else if (telp.matches(filter3)){
                verifNoTelp = true;
            }else {
                throw new Exception(error404);
            }
        }catch (Exception errorTelp){
            System.out.println(errorTelp);
        }
    }

    //Verif tanggal lahir
    void userTglLahir(String tgl){
        try{
            if (tgl.isEmpty()){
                throw new Exception("Tgl Lahir harus diisi");
            }else if (tgl.matches(filter2) || tgl.matches(filter1)){
                throw new Exception("Format tgl salah!");
            }else if (!tgl.matches(filter2) || !tgl.matches(filter1)){
                verifTglLahir = true;
            }else {
                throw new Exception(error404);
            }
        }catch (Exception errorTgl){
            System.out.println(errorTgl);
        }
    }

    //main Method
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String inputNim, inputEmail, inputNama, inputNomorTelp, inputTanggalLahir;
        versi2 obj = new versi2();

        //Perulangan NIM
        do {
            System.out.print("Masukkan NIM                          : ");
            inputNim = inputData.nextLine();
            obj.nimUser(inputNim);
            if (obj.verifNim){
                obj.loopNim = false;
            }
        }while (obj.loopNim);

        //Perulangan Email
        do {
            System.out.print("Masukkan Email (@webmail.umm.ac.id)   : ");
            inputEmail = inputData.nextLine();
            obj.emailUser(inputEmail);
            if (obj.verifEmail){
                obj.loopEmail = false;
            }
        }while (obj.loopEmail);

        //Perulangan Nama
        do {
            System.out.print("Masukkan Nama                         : ");
            inputNama = inputData.nextLine();
            obj.namaUser(inputNama);
            if (obj.verifName){
                obj.loopNama = false;
            }
        }while (obj.loopNama);

        //Perulangan No telp
        do {
            System.out.print("Masukkan No Telp                      : ");
            inputNomorTelp = inputData.nextLine();
            obj.telpUser(inputNomorTelp);
            if (obj.verifNoTelp){
                obj.loopNoTelp = false;
            }
        }while (obj.loopNoTelp);

        //Perulangan Tgl Lahir
        do {
            System.out.print("Masukkan Tgl Lahir (dd mm yyyy)       : ");
            inputTanggalLahir = inputData.nextLine();
            obj.userTglLahir(inputTanggalLahir);
            if (obj.verifTglLahir){
                obj.loopTgl = false;
            }
        }while (obj.loopTgl);

        //Penampilan data final
        if (obj.verifName == true && obj.verifNim == true && obj.verifEmail == true && obj.verifNoTelp == true && obj.verifTglLahir == true){
            System.out.println("======== DATA BERHASIL DIBUAT ========");
            System.out.println("NIM             : " + inputNim);
            System.out.println("Email           : " + inputEmail);
            System.out.println("Nama            : " + inputNama);
            System.out.println("No Telp         : " + inputNomorTelp);
            System.out.println("Tanggal Lahir   : " + inputTanggalLahir);
        }
    }
}