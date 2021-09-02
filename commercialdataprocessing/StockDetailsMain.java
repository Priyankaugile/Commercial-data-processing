package com.commercialdataprocessing;

public class StockDetailsMain {
    public static void main(String[] args) {

        StockDetailsService stockDetailsService = new StockDetailsService();

        int choice = 0;
        int exitValue = 5;
        while (choice != exitValue){
            StockDetailsModel.displayOptions();
            choice = StockDetailsModel.readInteger();
            switch (choice){
                case 1:
                    stockDetailsService.addStock();
                    break;
                case 2:
                    stockDetailsService.getStockDetails();
                    break;
                case 3:
                    stockDetailsService.subtractShares();
                    break;
                case 4:
                    stockDetailsService.displayRecord();
                    break;

            }
        }
    }
}
