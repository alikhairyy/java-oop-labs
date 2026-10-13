/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.assignment.lab.pkg6;

/**
 *
 * @author Zbook
 */
public class OOPAssignmentLab6 {

    public static void main(String[] args) {

    
        Asset asset1 = new Asset("Laptop", 1500.00, 10.0);
        Asset asset2 = new Asset("Machine", 5000.00, 15.0);

        
        System.out.println("Initial Asset Information:");
        asset1.displayInfo();
        asset2.displayInfo();


        asset1.increaseValueByPercent(5);
        asset2.increaseValueByPercent(5);

        
        System.out.println("After Increasing Value by 5%:");
        asset1.displayInfo();
        asset2.displayInfo();
    }
}



class Asset {
    private String assetName;
    private double assetValue;
    private double depreciationRate;

  
    public Asset(String assetName, double assetValue, double depreciationRate) {
        this.assetName = assetName;
        this.assetValue = assetValue < 0 ? 0 : assetValue;
        this.depreciationRate = depreciationRate < 0 ? 0 : depreciationRate;
    }

   
    public String getAssetName() {
        return assetName;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public double getDepreciationRate() {
        return depreciationRate;
    }

    // Setters
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public void setAssetValue(double assetValue) {
        if (assetValue >= 0) {
            this.assetValue = assetValue;
        }
    }

    public void setDepreciationRate(double depreciationRate) {
        if (depreciationRate >= 0) {
            this.depreciationRate = depreciationRate;
        }
    }

    
    public void increaseValueByPercent(double percent) {
        assetValue += assetValue * (percent / 100);
    }

    // Display asset info
    public void displayInfo() {
        System.out.println("Asset Name: " + assetName);
        System.out.println("Asset Value: " + assetValue);
        System.out.println("Depreciation Rate: " + depreciationRate);
        System.out.println("---------------------------------");
    }
}
