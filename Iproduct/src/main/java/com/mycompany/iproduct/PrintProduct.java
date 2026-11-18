/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iproduct;

/**
 *
 * @author Shirley
 */
public class PrintProduct {
    
    public void PrintTotalSales(Product product) {
        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }
    public void PrintAverageSales(Product product) {
        System.out.println("AVERAGE PRODUCT SALES: "
                + product.GetAverageProductSold());
    }
    public void PrintMostPopular(Product product) {
        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }
}

    

