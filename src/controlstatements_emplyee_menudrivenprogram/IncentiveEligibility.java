
package controlstatements_emplyee_menudrivenprogram;

import java.util.Scanner;


public class IncentiveEligibility {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String name;
        boolean  flag;
        int expYr, appScore;
        System.out.print("Enter the Name of Employee\n");
        name = sc.nextLine();
        System.out.print("Enter year of experience\n");
        expYr = sc.nextInt();
        System.out.print("Enter appraisal score\n");
        appScore = sc.nextInt();
       flag =  checkEligibility(expYr, appScore);
        if(flag == true){
            System.out.println(name+" is Eligible for incentive");
            
        }
        else{
            System.out.println(name+" is not eligible for incentive");
        }
        
    }
    
    public static boolean checkEligibility(int expYr, int appScore){
        
        if(expYr >= 5)
        return true;
        else if(expYr <5 && expYr > 3 && appScore > 70)
                return true;
        else if(expYr <3 && appScore > 90)
                return true;
        else
            return false;
        
    }

}
