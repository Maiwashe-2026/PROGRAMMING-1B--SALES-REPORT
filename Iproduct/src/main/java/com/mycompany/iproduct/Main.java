/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iproduct;

/**
 *
 * @author Shirley
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(
                    "Enter number of sales for month "
                    + (j + 1) + " for "
                    + products[i] + " mattress: ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        Product product = new Product(products, sales);
        PrintProduct print = new PrintProduct();

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("********************************");

        print.PrintTotalSales(product);
        print.PrintAverageSales(product);
        print.PrintMostPopular(product);
    }
}