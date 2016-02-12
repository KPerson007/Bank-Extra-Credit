/**
 * Kevin T. Period 1
 * Extra Credit
 **/

public class BankAccount
{
  private double myBalance;
  
  public BankAccount()
  {
    myBalance = 0;
  }
  
  public BankAccount(double balance)
  {
    myBalance = balance;
  }
  
  public void deposit(double amount)
  {
    myBalance += amount;
  }
  
  public void withdrawl(double amount)
  {
    myBalance -= amount;
  }
  
  public double getBalance()
  {
    return myBalance;
  }
  
  public String toString()
  {
    return "Balance: " + getBalance();
  }
}
