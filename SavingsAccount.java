/**
 * Kevin T. Period 1
 * Extra Credit
 **/

public class SavingsAccount extends BankAccount
{
  private double myInterestRate;
  
  public SavingsAccount()
  {
    super();
    myInterestRate = 0.0;
  }
  
  public SavingsAccount(double balance, double rate)
  {
    super(balance);
    myInterestRate = rate;
  }
  
  public void addInterest()
  {
    deposit(getBalance() * myInterestRate);
  }
  
  public double getInterestRate()
  {
    return myInterestRate;
  }
  
  public String toString()
  {
    return "Balance: " + getBalance() + "; Interest Rate: " + getInterestRate();
  }
}
