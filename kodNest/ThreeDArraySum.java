package kodNest;

import java.util.Scanner;

public class ThreeDArraySum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter dimensions of the 3D arrays (blocks, rows, columns):");
        int block = scanner.nextInt();
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][][] arr1 = new int[block][row][col];
        int[][][] arr2 = new int[block][row][col];

        System.out.println("Enter elements for Layer 1:");
        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr1[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("Enter elements for Layer 2:");
        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    arr2[i][j][k] = scanner.nextInt();
                }
            }
        }

        int sum1 = calculateSum(arr1);
        int sum2 = calculateSum(arr2);

        System.out.println("Sum of Layer 1: " + sum1);
        System.out.println("Sum of Layer 2: " + sum2);

        scanner.close();
    }

    public static int calculateSum(int[][][] array) {
        int sum = 0;
        for (int[][] block : array) {
            for (int[] row : block) {
                for (int val : row) {
                    sum += val;
                }
            }
        }
        return sum;
    }
}

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("3D Array:");
//
//        int block = scanner.nextInt();
//        int row = scanner.nextInt();
//        int col = scanner.nextInt();
//        int[][][] arr = new int[block][row][col];
//
//        for(int i=0;i<block;i++){
//            for(int j=0;j<row;j++){
//                for(int k=0;k<col;k++){
//                  arr[i][j][k] = scanner.nextInt();
//                }
//            }
//        }   
//        for(int i=0;i<block;i++){
//            System.out.println("Layer " + (i + 1) + ":");
//            for(int j=0;j<row;j++){
//                for(int k=0;k<col;k++){
//                   System.out.print(arr[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//        }
//
//        for(int i=0;i<block;i++){
//            int sum = 0;
//            for(int j=0;j<row;j++){
//                for(int k=0;k<col;k++){
//                  sum += arr[i][j][k];
//                }
//            }
//            System.out.println("Sum of layer " + (i + 1) + ": " + sum);
//        }
//        scanner.close();
//    }
//}

