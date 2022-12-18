package com.praktikum.modul3T1;

public class perhitungan {



    public int volume(balok sisi) {
        return sisi.getPanjangBalok() * sisi.getLebarBalok() * sisi.getTinggiBalok();
    }

    public int luas(balok sisi) {
        return  2 * ((sisi.getPanjangBalok() * sisi.getLebarBalok()) + (sisi.getPanjangBalok() * sisi.getTinggiBalok()) + (sisi.getLebarBalok() * sisi.getTinggiBalok()));
    }


}
