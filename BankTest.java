/**
 * Kevin T. Period 1
 * Extra Credit
 **/

import javax.swing.*;

public class BankTest
{
  public static void main(String[] args)
  {
    BankAccount myAccount = new BankAccount();
    //Custom button text
    Object[] options = {"Generic Account",
      "Savings Account",
      "Checking Account"};
    int n = JOptionPane.showOptionDialog(null,
                                         "What type of account is being created?",
                                         "Bank of Java",
                                         JOptionPane.YES_NO_CANCEL_OPTION,
                                         JOptionPane.QUESTION_MESSAGE,
                                         null,
                                         options,
                                         options[0]);
    switch (n)
    {
      case 0:
        String genericAmount = JOptionPane.showInputDialog(null, "What is the initial amount?", "0.0");
        myAccount = new BankAccount(Double.parseDouble(genericAmount));
        break;
      case 1:
        String savingsAmount = JOptionPane.showInputDialog(null, "What is the initial amount?", "0.0");
        String savingsRate = JOptionPane.showInputDialog(null, "What is the interest rate?", "0.0");
        myAccount = new SavingsAccount(Double.parseDouble(savingsAmount), Double.parseDouble(savingsRate));
        break;
      case 2:
        String checkingAmount = JOptionPane.showInputDialog(null, "What is the initial amount?", "0.0");
        myAccount = new CheckingAccount(Double.parseDouble(checkingAmount));
        break;
    }
    JOptionPane.showMessageDialog(null, myAccount.toString());
  }
  
  
}
