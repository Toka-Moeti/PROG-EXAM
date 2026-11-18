/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

import IProduct.IProduct;

/**
 *
 * @author Toka
 */
public class Product implements IProduct {
    // 2D Array: Rows = Products (3), Columns = Months (3)
    private final int[][] salesData;

    public Product(int[][] salesData) {
        this.salesData = salesData;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] salesData1 : salesData) {
            for (int j = 0; j < salesData1.length; j++) {
                total += salesData1[j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        // Total divided by number of products (3)
        return (double) GetTotalProductsSold() / salesData.length;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSales = -1;
        int mostPopularIndex = 0;

        for (int i = 0; i < salesData.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                productTotal += salesData[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                mostPopularIndex = i;
            }
        }

        // Match index & product name
        switch (mostPopularIndex) {
            case 0: return "Cozy Nights Monarch (" + maxSales + ")";
            case 1: return "Restonic Barbados (" + maxSales + ")";
            case 2: return "Sealy Phuket (" + maxSales + ")";
            default: return "Unknown";
        }
    }
}
