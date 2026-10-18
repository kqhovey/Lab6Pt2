
/**
 * BankAccount calculates the interest rate, the monthly interest rate, the deposits, withdraws, and total balance of a bank account over a certain period of months.
 * @author Kyra Hovey, khovey@student.sdccd.edu
 * @version v1.0
 * @since 10/17/26
 */
public class BankAccount
{
    private double balance, deposit, withdraw, interest, monthlyIntRate;
    /**
     * No args-constructor for objects of class BankAccount, initializes field vars balance, deposit, withdraw, interest, and monthlyIntRate
     */
    public BankAccount()
    {
        monthlyIntRate = 0.044/12;
        balance = 0.0;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
    }
    /**
     * Constructor for objects of class BankAccount that sets the field variables balance to the user-provided int balance and monthlyIntRate relative to the user-provided
     * intRate
     * @param inBalance, the int balance given by the user
     * @param intRate, the annual interest rate provided by the user
     */
    public BankAccount(int inBalance, double intRate) //how do i make that int?
    {
        balance = inBalance;
        monthlyIntRate = (intRate/100)/12;
    }
    /**
     * Constructor for objects of class BankAccount that sets the field variables balance to the user-provided double balance and monthlyIntRate relative to the user-provided
     * intRate
     * @param inBalance, the double balance given by the user
     * @param intRate, the annual interest rate provided by the user
     */
    public BankAccount(double inBalance, double intRate)
    {
        balance = inBalance;
        monthlyIntRate = (intRate/100)/12;
    }
    /**
     * makeDeposit() gives the effect of a deposit on the balance and total deposits
     * @param add, a double of how much is added per month
     */
    public void makeDeposit(double add)
    {
        balance += add;
        deposit += add;
    }
    /**
     * makeDeposit() gives the effect of a deposit on the balance and total deposits
     * @param add, an int of how much is added per month
     */
    public void makeDeposit(int add)
    {
        balance += add;
        deposit += add;
    }
    /**
     * makeWithdraw() gives the effect of a withdraw on the balance and total withdraws
     * @param sub, a double of how much is withdrawn per month
     */
    public void makeWithdraw(double sub)
    {
        balance -= sub;
        withdraw += sub;
    }
    /**
     * makeWithdraw() gives the effect of a withdraw on the balance and total withdraws
     * @param sub, an int of how much is withdrawn per month
     */
    public void makeWithdraw(int sub)
    {
        balance -= sub;
        withdraw += sub;
    }
    /**
     * calcInterest() gives the monthly interest and its effect on the balance and total interest
     */
    public void calcInterest()
    {
        if (balance > 0) {
            balance += balance * monthlyIntRate;
            interest += balance * monthlyIntRate;
        }
    }
    /**
     * getBalance() calculates the total balance
     * @return gives the total balance as a double
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * getDeposit() calculates the sum deposits
     * @return gives the total deposits as a double
     */
    public double getDeposit()
    {
        return deposit;
    }
    /**
     * getWithdraw() calculates the sum withdraws
     * @return gives the total withdraws as a double
     */
    public double getWithdraw()
    {
        return withdraw;
    }
    /**
     * getInterest() calculates the accured interest
     * @return gives the total amount accrued as interest as a double
     */
    public double getInterest()
    {
        return interest;
    }
}