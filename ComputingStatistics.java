//programmers: Kenneth Yeon, Carson Irons
import java.util.ArrayList;


public class ComputingStatistics {
   /**
   * The ArrayList containing all of the loan data.
   */
   private ArrayList<Loan> data;
   
   /**
    * Creates a new ComputingStatistics object with an empty ArrayList 
    */
   public ComputingStatistics() {
      data = new ArrayList<Loan>();
   }
   
   /**
    * Creates a new ComputingStatistics object with the data passed in
    */
   public ComputingStatistics(ArrayList<Loan> d) {
      data = d;
   }
   
   /**
    * Calclates the total amount funded from all of the loans in the file.
    * @return the total loan amount.
    */
   public double totalAmount() {
      double amount = 0.0;
      for(int i = 0; i < data.size(); i++) {
         amount = amount + data.get(i).getLoanAmount();
      }
      return amount;
   }

   public double avgLoan()
   {
     //set a double called average = to the average
     double average = (double) this.totalAmount() / data.size();
     //return average
     return average;
   }

   public double largestLoan()
   {
     //set a double called max equal to 0.0
     double max = 0.0;
     //loop through each element in the data list
     for (int i = 0; i < data.size(); i++)
     {
       //if the loan amount of the element is greater than max set max = to that loan amount
       if (data.get(i).getLoanAmount() > max)
       {
         max = data.get(i).getLoanAmount();
       }
     }
     //return max
     return max;
   }

public double smallestLoan(){ 
//set double variable min to first loan loanAmount
double min=10000000000.0;
//traverse list starting at index 1
for(int i=0;i<data.size();i++){
//check whether current loan loanAmount is smaller than 
//min
if(data.get(i).getLoanAmount()<min)
//if so set min to current loanAmount
min=data.get(i).getLoanAmount();
//end loop
}
//return min 
return min;
   }



   public String largestLoanCountry()
   {
    //run largestLoan() method
    double largeLoan = this.largestLoan();
    //loop through each element in the arraylist
    for(int i = 0; i < data.size(); i++)
    {
      //if the loan is equal to max return the name of the country at that index
      if (data.get(i).getLoanAmount() == largeLoan)
      {
        return data.get(i).getCountry();
      }
    }
    return "";
   }

   public String smallestLoanCountry(){
//create int index variable equal to 0
int index=0;
//traverse list starting at 1 
for(int i=1;i<data.size();i++){
//if loanAmount of current is smaller than loanAmmount of index, setindex to current
if(data.get(i).getLoanAmount()<data.get(index).getLoanAmount())
index=i;
//end loop
}
//return getCountry method for loan at index
return data.get(index).getCountry();
   }


public double avgDaysToFund()
{
  //Set an int called sum equal to 0
  int sum = 0;
  //loop through each element in the list
  for (int i = 0; i < data.size(); i++)
  {
    //add daysToFund of each element to sum
    sum = sum + data.get(i).getDaysToFund();
  }
  //set a double called average equal to sum divided by the size of the arraylist
  double average = (double)sum / data.size();
  //return average
  return average;
}

public double largestLoanKenya(){
//create a double variable, max equal to 0.0
double max=0.0;
//traverse array 
for(int i=0;i<data.size();i++){
//if current amount surpasses max and current country is 
//kenya, set max to //current
if(data.get(i).getLoanAmount()>max && data.get(i).getCountry().toLowerCase().equals("kenya"))
max=data.get(i).getLoanAmount();
//end loop
}
//return max
return max;
}

public double avgLoanPhilippines()
{
  //create an int called sum equal to 0
  double sum = 0;
  //create an int called counter
  int counter = 0;
  //loop through the arraylist
  for(int i = 0; i < data.size(); i++)
  {
    //if the element’s country is philippines add the loan amount to sum and add one to counter
    if (data.get(i).getCountry().equals("Philippines"))
    {
      counter++;
      sum = sum + data.get(i).getLoanAmount();
    }
  }
  //set a double called average equal to sum divided by counter
  double average = (double) sum / counter;
  //return average
  return average;
}

public String longestToFundCountry(){
//create int var long equal to 0
int longy=0;
//traverse list
for(int i=1; i<data.size();i++){
//check if current duration is longer than long duration
if(data.get(i).getDaysToFund()>data.get(longy).getDaysToFund())
//if so set long to current 
longy=i;
//end loop
}
//return long’s country 
return data.get(longy).getCountry();

}


public double variance()
{
  //set double called sum = 0.0
  double sum = 0.0;
  //loop through the arraylist
  for (int i = 0; i < data.size(); i++)
  {
    //add the value of the average minus each value squared
    sum += ((this.avgLoan() - data.get(i).getLoanAmount()) * (this.avgLoan() - data.get(i).getLoanAmount()));
  }
  //return sum divided by the size of the arraylist
  return sum / data.size();
}
   
public double standardDeviation(){
//return math static method square root of list.variance 
return Math.sqrt(this.variance());
}


public boolean empiricalRule()
{
  //set a double called counter = 0.0
  double counter = 0.0;
  //set a double called low equal to the average minus the standardDeviation
  double low = this.avgLoan() - this.standardDeviation();
  //set a double called high equal to the average plus the standardDeviation
  double high = this.avgLoan() + this.standardDeviation();
  //loop through each element in the arraylist
  for (int i = 0; i < data.size(); i++)
  {
    //if the loan of this element is between the average - variance and average + variance, add one to counter
    if (data.get(i).getLoanAmount() > low && data.get(i).getLoanAmount() < high)
    {
      counter++;
    }
  }
  //set a double called flag equal to counter divided by the size of the arraylist
  double flag = (double) counter/data.size();
  //if counter divided the size of the arraylist is greater than or equal to .68 return true
  if (flag >= 0.68)
  {
    return true;
  }
  //else return false
  return false;
}
   
}
