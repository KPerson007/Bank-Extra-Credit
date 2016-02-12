/**
 * Kevin T. Period 1
 * Extra Credit
 **/

public class CheckingAccount extends BankAccount
{
  private static final double FEE = 2.0;
  private static final double MIN_BALANCE = 50.0;
  
  public CheckingAccount(double balance)
  {
    super(balance);
  }
  
  public void withdrawl(double amount)
  {
    if (getBalance() - amount < MIN_BALANCE)
    {
      super.withdrawl(amount + FEE);
    }
    else
    {
      super.withdrawl(amount);
    }
  }
}
