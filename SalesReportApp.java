/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SalesReportApp;

/**
 *
 * @author Toka
 */
import PrintProduct.PrintProduct;
import Product.Product;
import java.util.Scanner;

public class SalesReportApp {
    public static void main(String[] args) {
        // 1D Array for product names
        try (Scanner scanner = new Scanner(System.in)) {
            // 1D Array - product names
            String[] productNames = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
            
            // 2D Array - sales data (3 products x 3 months)
            int[][] salesData = new int[3][3];
            
            // Capture Input
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress: ");
                    salesData[i][j] = scanner.nextInt();
                }
                System.out.println(); // Blank line between products
            }
            
            // Process + Print
            Product product = new Product(salesData);
            PrintProduct printer = new PrintProduct();
            printer.printReport(product);
        }
    }
}
