package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("nhập vào số hàng của ma trận: ");
        row = scanner.nextInt();
        System.out.println("nhập vào số cột của ma trận");
        column = scanner.nextInt();

        int matrix[][] = new int[row][column];

        System.out.println("nhập các phần tử cho ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);
    }
}
