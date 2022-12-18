package com.praktikum.modul4;
import java.util.Scanner;


public class proses {
    private final int Tahun = 365;
    private final int bulan = 30;
    private int tempHari;

    public void menuResult(){
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Berapa hari yang ingin di convert: ");
        setTempHari(inputUser.nextInt());
        System.out.println(getTempHari() + " Hari = " + convertTahun(getTempHari()) + " tahun " + convertBulan(getTempHari()) + " bulan " + convertHari(getTempHari()) + " hari");
    }
    public int convertTahun (int hari){
        return hari/Tahun;
    }
    public int convertBulan(int hari){
        return (hari%Tahun)/bulan;
    }
    public int convertHari(int hari){
        return (hari % Tahun % bulan);
    }

    public int getTempHari() {
        return tempHari;
    }

    public void setTempHari(int tempHari) {
        this.tempHari = tempHari;
    }
}
