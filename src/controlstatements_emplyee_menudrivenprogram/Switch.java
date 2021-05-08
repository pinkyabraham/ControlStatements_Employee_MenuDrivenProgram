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
public class Switch {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        String name;
        
        int grade;
      
        System.out.print("Enter the Name of Employee\n");
        name = sc.nextLine();
        System.out.print("Enter grade\n");
        grade = sc.nextInt();
        String pos = checkPosition(grade);
        if("Error".equals(pos)){
            System.out.println("Invalid grade");
        }
        else if(pos.charAt(0)== 'a'||pos.charAt(0)=='A')
        {
       System.out.println(name+" is an "+pos);
        }
        else
        {
          System.out.println(name+" is a "+pos);  
        }
    
}


public static String checkPosition(int grade){

    String position="";
switch(grade){
    
    case 1 :
        position = "Senior System Engineer";
        break;
    case 2:
        position ="System Engineer";   
        break;
    case 3:
        position ="Assistent System Engineer";    
        break;
    case 4:
        position ="Junior System Analyst";
        break;
    case 5:
        position  ="System Analyst";
        break;
    default:
        position = "Error"; 
       
}
         return position;


}
}
