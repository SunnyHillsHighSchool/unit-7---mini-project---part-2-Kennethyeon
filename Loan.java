//Programmers: Kenneth Yeon, Carson Irons

import java.util.ArrayList;

public class Loan
{
  //instance variables
  private int ID;
  private double loanAmount;
  private String country;
  private int daysToFund;
  private int numLenders;
  //constructor
public Loan(int a, double b, String c, int d, int e){
ID=a;
loanAmount=b;
country=c;
daysToFund=d;
numLenders=e; 
}
  //accessor methods
  public int getID(){
    return ID;
  }

  public double getLoanAmount()
  {
    return loanAmount;
  }

  public int getDaysToFund()
  {
    return daysToFund;
  }

  public String getCountry(){
    return country;
  }

  public int getNumLenders(){
    return numLenders;
  }

  //modifier methods
  public void setID(int a)
  {
    ID = a;
  }
  public void setLoanAmount(double a){
    loanAmount=a;
  }
  public void setDaysToFund(int a){
    daysToFund=a;
  }
  public void setCountry(String a)
  {
    country = a;
  }

  public void setNumLenders(int a){
    numLenders=a;
  }
  //toString
  public String toString(){
    return "TRANSACTION DATA"+"\n"+"User ID: "+ID+"\n"+"Loan Amount: "+loanAmount+"\n"+"Days to Fund: "+daysToFund+"\n"+"User Country: "+country+"\n"+"Number of Lenders: "+numLenders;
  }
}
