package com.tanvi;

import java.util.Scanner;

/**
 *
 */
public class PrintPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number : ");

        int triangleHeight = scanner.nextInt();
        //printPyramid(pyramidHeight);
        //printReversePyramid(pyramidHeight);
        printTriangle(triangleHeight);


    }

    public static void printPyramid(int pyramidHeight){
        for (int row = 0; row < pyramidHeight; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReversePyramid(int pyramidHeight){
        for (int row = pyramidHeight; row >0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int triangleHeight){
        int colPrint = triangleHeight*2 -1;
        for(int row = triangleHeight; row > 0; row--){
            for (int colWhiteSpace = triangleHeight-1; colWhiteSpace>= row; colWhiteSpace--){
                System.out.print(" ");
            }
            for ( int col1 =1; col1 <= colPrint; col1++){
                System.out.print("*");
            }
            colPrint-=2;
            System.out.println();
        }
    }
}
