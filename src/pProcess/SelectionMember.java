package pProcess;

import pdata.*;
import java.util.*;

public class SelectionMember implements Data{

    //create random promotion to spice things up.
    //this is a class that allow user to set random given number
			Random promo = new Random();
    //scanner for user input
            Scanner chose = new Scanner(System.in);
 //for inserting each purchases
            ArrayList<Double> store = new ArrayList<>();
            
            
			int deal = promo.nextInt(50) + 1;//member will get random deal each promotion    
         
    
    //set the value for each items
			double  total=0,discount=0,
                    num1=40.99,num2=10.99,
                    num3=70.49,num4=149.99,
 				 	num5=25.50;

                
		 public void display_data(){
		 
			
            System.out.println("\n FOR THIS MONTH, HERE IS YOUR DEAL: " +deal+"%");

			System.out.println("\n1.Mouse:\tRM "+num1+"\n2.MP3 player:\tRM "+num2+
			"\n3.Webcam:\tRM "+num3+"\n4.Hard drive:\tRM "+num4+"\n5.Headphones:\tRM "+num5
            +"\n6. Exit.");

               if (!store.isEmpty()){
                store.clear();
            }
        char yn;
         while(true){
            System.out.print("Enter code of your Item:  ");

         
            int choice = chose.nextInt();
                switch (choice) {
                    case 1: store.add(num1);  break;
                    case 2: store.add(num2);  break;
                    case 3: store.add(num3);  break;
                    case 4: store.add(num4);  break;
                    case 5: store.add(num5);  break;
                    case 6: break;
                    
                    default: System.out.println("Wrong operation."); break;
                }
                     if(choice == 6){
                        break;
                 }
                System.out.println("Item added.");

            }
          
        }
                
		

    
    public void calculation1() {
        total=0;
        discount=0;
        for (Double double1 : store) {
            total+=double1;
        }
        
        discount=total*((double)deal/100);
        total=total- discount;
        System.out.println("\nAfter Discount: RM "+String.format("%.2f",total));
        System.out.println("You saved:RM "+ String.format("%.2f",discount));
    }

    
    public void calculation2() {
        if (total>50) {
            total = total*0.25;
            System.out.println("There are discount: RM "+total);
        }
        else{
            System.out.println("There are no discount.");
        }
    }


    public void Exit() {
        System.out.println("Thank you for purchasing our Item.");
        System.exit(0);
    }

       


}