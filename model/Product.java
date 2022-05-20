package model;

public class Product {
    private String name;
    private int amount;
    private int priceCost;
    private int retailPrice;
    private String category;
    private String barcode;
    private String location;

    private Product(String name, int amount,int priceCost, int retailPrice, String category, String barcode, String location){
        this.name = name;
        this.amount = amount;
        this.priceCost = priceCost;
        this.retailPrice = retailPrice;
        this.category = category;
        this.barcode = barcode;
        this.location = location;
    }

    //getters
    private String getName(){
        return name;
    }

    private int getAmount(){
        return amount;
    }

    private int getPriceCost(){
        return priceCost;
    }

    private int getRetailPrice(){
        return retailPrice;
    }

    private String getCategory(){
        return category;
    }
    
    private String getBarcode(){
        return barcode;
    }
    
    private String getLocation(){
        return location;
    }
    
    private void setName(String name){
        this.name = name;
    }
    
    private void setAmount(int amount){
        this.amount = amount;
    }
    
    private void setPriceCost(int priceCost){
        this.priceCost = priceCost;
    }
    
    private void setRetailPrice(int retailPrice){
        this.retailPrice = retailPrice;
    }
    
    private void setCategory(String category){
        this.category = category;
    }
    
    private void setBarcode(String barcode){
        this.barcode = barcode;
    }
    
    private void setLocation(String location){
        this.location = location;
    }
}
