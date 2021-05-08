
package controlstatements_emplyee_menudrivenprogram;

import java.util.Scanner;


public class IncentiveEligibility {

  
        public static void checkEligibility(String name, int expYr, int appScore){
            boolean  flag;
   
        if(expYr >= 5)
        flag = true;
        else if(expYr <5 && expYr > 3 && appScore >= 70)
                flag =  true;
        else if(expYr <3 && appScore >= 90)
                flag = true;
        else
            flag = false;
        
         if(flag == true){
            System.out.println(name+" is Eligible for incentive");
            
        }
        else{
            System.out.println(name+" is not eligible for incentive");
        }
        
        }
}
