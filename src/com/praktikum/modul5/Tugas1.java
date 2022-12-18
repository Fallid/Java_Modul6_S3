package com.praktikum.modul5;
import java.util.Scanner;

public class Tugas1 {

    void sorting(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {-75, -10, 0, 30, 0, -30, 90, 70, 89, -50, -55, -30};
        Scanner input = new Scanner(System.in);
        Tugas1 obj = new Tugas1();

        int n = arr.length;
        System.out.print("Data : ");
        for (int i = 0; i < n; i++){
            System.out.print (+ arr[i] + ", ");
        }
        System.out.println("\n\n");
        obj.sorting(arr);
        System.out.print("\nMasukkan index : ");
        int index = input.nextInt();
        System.out.println("Index ke-" + index + " = " + arr[index]);
    }
}
