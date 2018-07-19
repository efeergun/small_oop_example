/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efe
 */
public class GroceryCart {
    
    public List<Food> foodlist;
    

    public GroceryCart() {
        this.foodlist = new ArrayList<Food>();
    }

    public List<Food> getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(List<Food> foodlist) {
        this.foodlist = foodlist;
    }
    
    
    
    public void addFoodToCart(Food f){
        
        foodlist.add(f);
        
    }
    
    public String showAllInCart(){
        
        String result = "// - Cart List - //\n";
        
        for (int i = 0; i < foodlist.size(); i++) {
            result = result + foodlist.get(i) + "\n";
        }
        
        return result;
    }
    
    public String getTotalPrice(){
    
        double result = 0.0;
        
        for (int i = 0; i < foodlist.size(); i++) {
         result = result +  foodlist.get(i).getPrice();  
        }
       
        return "Your total payment is: " + result;
        
    }
    
    
    public String getTotalKcal(){
    
        int result = 0;
        
        for (int i = 0; i < foodlist.size(); i++) {
         result = result +  foodlist.get(i).getKalories();
        }
       
        return "Total Kcal of cart is: " + result;
        
    }
    
}
