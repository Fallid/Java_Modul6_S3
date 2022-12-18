package com.praktikum.playground;
import static java.lang.Math.*;
import java.util.Scanner;

public class Alpro_Ahmad_Naufal_296 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double corner;

        System.out.println("Input corner: ");
        corner = input.nextDouble();

        System.out.println("SIN : " + sin(toRadians(corner)));
        System.out.println("COS : " + cos(toRadians(corner)));
        System.out.println("TAN : " + tan(toRadians(corner)));
        System.out.println("COT : " + 1/ tan(toRadians(corner)));
        System.out.println("SEC : " + 1/ cos(toRadians(corner)));
        System.out.println("CSC : " + 1/ sin(toRadians(corner)));
        System.out.println("ACOS: " + acos(toRadians(corner)));
    }


}

