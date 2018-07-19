/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author efe
 */
public class GroceryStoreTest {

    
    public static void main(String[] args) {
    
       int pick = 0;  
        
        Scanner sc = new Scanner(System.in);
        GroceryCart gc = new GroceryCart();
        
        gc.addFoodToCart(new Food("Apple", 135, 4, 2));  // example input
        gc.addFoodToCart(new Food("Cake", 500, 11.7, 1));  // example input
        
      while(pick != 9){
          
          System.out.println("\n Please select one of the options.."
                  + "\n (1) Add a Food to Your Shopping Cart. "
                  + "\n (2) View All of Your Food on display. "
                  + "\n (3) Ask for the Payment. "
                  + "\n (4) PAY ? ? ? "
                  + "\n (5) Learn total kcal of your Cart. "
                  + "\n (9) exit.");
          pick = sc.nextInt();
          
          
          switch(pick){
              case 2:  System.out.println(gc.showAllInCart());
                    break;
              case 3:  System.out.println(gc.getTotalPrice());
                    break;
              case 1:   
                  System.out.println("What is the type of food ? (e.g. Bread)");
                  String type = sc.next();
                  System.out.println("How many calories it has ? (e.g. 324)");
                  int kcal = sc.nextInt();
                  System.out.println("How much does it cost ? (e.g. 4.5)");
                  double price = sc.nextDouble();
                  System.out.println("How many will you buy ? (e.g. 2)");
                  int amount = sc.nextInt();
                  
                  gc.addFoodToCart(new Food(type, kcal, price, amount));
                  break;
              case 5: 
                  System.out.println(gc.getTotalKcal());
                  break;
              case 4: 
                  gc.foodlist.clear();
                  System.out.println("\nPaid !!");
                  break;
              case 9: 
                  pick = 9;
                  System.out.println("\n GOODBYE ...");
                  break;
          }
          
          
      }
      
      
       
        
       
        
        
    }
    
}
