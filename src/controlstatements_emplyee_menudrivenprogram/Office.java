/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatements_emplyee_menudrivenprogram;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Office {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Boolean flag = true;
        do{
         int options;
         System.out.print("Welcome to the Office\n"
                 + "1. Add an Employee \n"
                 + "2. Delete Employee \n"
                 + "3. Display an Employee \n"
                 + "4. Display all Employees \n"            
                 + "5. Check Incentives \n"
                 + "6. Exit\n"
                 + "Choose Your Option");
          
          options = sc.nextInt();
          
switch(options){
    case 1 :
 //      addEmployee();
        break;
    case 2:
  //     deleteEmployee();
        break;
    case 3:
 //      displayEmployee();    
        break;
    case 4:
 //      displayAll();
        break;
    case 5:
 //       checkIncentive();
        break;
    case 6:
        flag = false;
        break;
    default:
       System.out.print("Invalid input try again");
       
     }
        }while(false);
    
}
}

