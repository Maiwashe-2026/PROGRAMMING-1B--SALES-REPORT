/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iproduct;

/**
 *
 * @author Shirley
 */
public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int count = sales.length * sales[0].length;

        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {

        int highest = 0;
        String popularProduct = "";

        for (int row = 0; row < sales.length; row++) {

            int productTotal = 0;

            for (int col = 0; col < sales[row].length; col++) {
                productTotal += sales[row][col];
            }

            if (productTotal > highest) {
                highest = productTotal;
                popularProduct = products[row];
            }
        }

        return popularProduct + " (" + highest + ")";
    }
}