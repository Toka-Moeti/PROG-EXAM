/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrintProduct;

import IProduct.IProduct;

/**
 *
 * @author Toka
 */
public class PrintProduct {
    public void printReport(IProduct product) {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
        System.out.println("*************************************************");
    }
}
