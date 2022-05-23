package model;

public class Customer extends Person{
    private int discount;
    private String group;
    private int credit;
    private String cprNr;
    
    public Customer(String name, String phoneNumber, String address, int discount, String group, int credit, String cprNr){
        super(name, phoneNumber, address);
        this.discount = discount;
        this.group = group;
        this.credit = credit;
        this.cprNr = cprNr;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    public String getGroup(){
        return group;
    }
    
    public int getCredit(){
        return credit;
    }
    
    public String getCprNr(){
        return cprNr;
    }
    
    public void setDiscount(){
        this.discount = discount;
    }
    
    public void setGroup(){
        this.group = group;
    }
    
    public void setCredit(){
        this.credit = credit;
    }
    
    public void setCprNr(){
        this.cprNr = cprNr;
    }
}