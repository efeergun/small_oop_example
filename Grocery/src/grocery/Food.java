/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

/**
 *
 * @author efe
 */
public class Food {
    private String type;
    private int kalories;
    private double price;
    private int amount;

    public Food(String type, int kalories, double price, int amount) {
        this.type = type;
        this.kalories = kalories;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public int getKalories() {
        return kalories;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setKalories(int kalories) {
        this.kalories = kalories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return " -> " + amount + " " + type + " - " + (kalories * amount) + " kcals.";
    }
    
    
    
}
