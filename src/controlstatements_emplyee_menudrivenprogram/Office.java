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
    static Scanner sc = new Scanner(System.in);
    static int empCount = 0;
    static int empID = 1000;
    static Employee employee[] = new Employee[10];
    static IncentiveEligibility inEligibility = new IncentiveEligibility();
     public static void main(String[] args) {
        
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
                 + "Choose Your Option\n");
          
          options = sc.nextInt();
          
switch(options){
    case 1 :
        employee[empCount] = addEmployee();
        empCount++;
        break;
    case 2:
       deleteEmployee();
        break;
    case 3:
       displayEmployee();    
        break;
    case 4:
      displayAll();
        break;
    case 5:
       checkIncentive();
        break;
    case 6:
        flag = false;
        break;
    default:
       System.out.print("Invalid input try again\n");
       
     }
        }while(flag=true);
    
}

    private static Employee addEmployee() {
        String name;
        empID++;
        int expYr, appScore,empGrade;
        System.out.print("Enter the Name of Employee\n");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Enter year of experience\n");
        expYr = sc.nextInt();
        System.out.print("Enter appraisal score\n");
        appScore = sc.nextInt();
        System.out.print("Enter Grade of Employee\n");
        empGrade = sc.nextInt();
        Employee employeeObj = new Employee(name, empID, appScore, expYr,empGrade);
        return employeeObj;
        
    }

    private static void deleteEmployee() {
       int deltEmpId;
       Boolean found = false;
       System.out.println("Enter id of Employee to be deleted\n");
       deltEmpId = sc.nextInt();
       for(int i=0 ;i<empCount; i++){
        if(employee[i].getEmpID() == deltEmpId){
            for(int j = i; j <empCount;j++){
            employee[j] = employee[j+1];
        }
            empCount--;
            found = true;
            System.out.print("Employee deleted\n");
        }
    }
       if(!found){
           System.out.print("Employee not found\n");
       }
    }
    private static void displayEmployee() {
       int dispEmpId;
       System.out.println("Enter id of Employee ");
       dispEmpId = sc.nextInt();
       Boolean flag = false;
       for(int i = 0; i<empCount; i++){
       if(employee[i].getEmpID() == dispEmpId){
        System.out.println("Name                : "+ employee[i].getEmpName());
        System.out.println("EmpId               : "+ employee[i].getEmpID());
        System.out.println("Appraisal Score     : "+ employee[i].getAppraisalScore());
        System.out.println("Grade               : "+ employee[i].getEmpGrade());
        System.out.println("Position            : "+ employee[i].getEmpPosition());
        flag = true;
       }
       }   
     if(!flag){
    System.out.println("Employee not found\n");
}
    }
    private static void displayAll() {
        for(int i = 0; i<empCount; i++){
        System.out.println("Name                : "+ employee[i].getEmpName());
        System.out.println("EmpId               : "+ employee[i].getEmpID());
        System.out.println("Appraisal Score     : "+ employee[i].getAppraisalScore());
        System.out.println("Grade               : "+ employee[i].getEmpGrade());
        System.out.println("Position            : "+ employee[i].getEmpPosition());
        System.out.println("\n..............................................\n");
    }
    }
    private static void checkIncentive() {
       System.out.println("Enter id of Employee ");
       int IncentiveEmpId = sc.nextInt();
       String Empname;
       int appScore;
       Boolean found = false;
       int Expyr;
       for(int i = 0;i<empCount;i++){
           if(employee[i].getEmpID() == IncentiveEmpId){
              Empname = employee[i].getEmpName();
              appScore = employee[i].getAppraisalScore();
              Expyr = employee[i].getEmpExpYr();
              inEligibility.checkEligibility(Empname, Expyr, appScore);
              found = true;
           }
            
       }
       if(!found){
           System.out.print("Employee not found\n");
       }
      
       
    }
}

