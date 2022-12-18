package com.praktikum.modul3T1;


public class balok {

    private int panjangBalok;
    private int lebarBalok;
    private int tinggiBalok;



    protected void hasil(){
        perhitungan ph = new perhitungan();
        System.out.println("Hasil luas balok    : " + ph.luas(this));
        System.out.println("Hasil Volume balok  : " + ph.volume(this));
    }


    public int getPanjangBalok() {
        return panjangBalok;
    }

    public void setPanjangBalok(int panjangBalok) {
        this.panjangBalok = panjangBalok;
    }

    public int getLebarBalok() {
        return lebarBalok;
    }

    public void setLebarBalok(int lebarBalok) {
        this.lebarBalok = lebarBalok;
    }

    public int getTinggiBalok() {
        return tinggiBalok;
    }

    public void setTinggiBalok(int tinggiBalok) {
        this.tinggiBalok = tinggiBalok;
    }
}
