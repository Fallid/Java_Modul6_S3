package com.praktikum.modul1T1;

public class Main {
    public static void main (String[] args){
        try {
            int[] arr = new int[5];
            arr[5] = 25;
            System.out.println(arr[4]);
        }catch (IndexOutOfBoundsException error) {
            System.out.println(error);
        }
    }
}
