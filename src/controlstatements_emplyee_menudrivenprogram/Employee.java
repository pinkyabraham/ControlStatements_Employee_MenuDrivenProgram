/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstatements_emplyee_menudrivenprogram;

/**
 *
 * @author asus
 */
public class Employee {
      private String empName;
    private String empPosition;
    private int empID;
    private int appraisalScore;
    private int empExpYr;
    private int empGrade;
     public Employee(String empName, int empID, int appraisalScore, int empExpYr, int empGrade, String position){
        this.empName = empName;
        this.empID = empID;
        this.appraisalScore = appraisalScore;
        this.empExpYr = empExpYr;
        this.empGrade = empGrade;
       
        checkPosition(empGrade);
   
}
  public String getEmpName() {
        return empName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public int getEmpID() {
        return empID;
    }

    public int getAppraisalScore() {
        return appraisalScore;
    }

    public void setAppraisalScore(int appraisalScore) {
        this.appraisalScore = appraisalScore;
    }

    public int getEmpExpYr() {
        return empExpYr;
    }

    public void setEmpExpYr(int empExpYr) {
        this.empExpYr = empExpYr;
    }

    public int getEmpGrade() {
        return empGrade;
    }

    public void setEmpGrade(int empGrade) {
        this.empGrade = empGrade;
        checkPosition(empGrade);
    }
  
    
   
     
public static String checkPosition(int empGrade){
      String position="";
    switch(empGrade){
    
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
     

    

