public class Bank
{
    private double checkingBal;
    private double savingsBal;
    private String name;

    int x = 0;
    int y = 0;
    public Bank()
    {
        name = "...b.l.a.n.k...";
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }

    public Bank(String n)
    {
        name = n;
        checkingBal = 0.0;
        savingsBal  = 0.0;
    }
    
    public Bank(String n, double c, double s)
    {
        name = n;
        checkingBal = c;
        savingsBal  = s;
    }

    public double getChecking()
    {
        return checkingBal;
    }

    public double getSavings()
    {
        return savingsBal;
    }

    public double getCombined()
    {
        return checkingBal + savingsBal;
    }

    public void checkingDeposit(double amount)
    {
        checkingBal += amount;
    }
    public void transferToChecking(double amount)
    {
        savingsBal -= amount;
        checkingBal += amount;
    }
    
    public void transferToSavings(double amount)
    {
        checkingBal -= amount;
        savingsBal += amount;
    }
    public void savingsDeposit(double amount)
    {
        savingsBal += amount;
    }
    
    public void checkingWithdrawal(double amount)
    {
        checkingBal -= amount;
        if( checkingBal < 0)
        {
            checkingBal += amount;
            y += amount;
        }    
    }

    public void savingsWithdrawal(double amount)
    {
        savingsBal -= amount;
        if( savingsBal < 0)
        {
            x += amount;
        }    
    }
    
    public void closeChecking()
    {
        checkingBal = 0;
    }

    public void closeSavings()
    {
        savingsBal = 0;
    }

    public void showBalances()
    {
        if( checkingBal < 0)
        {
            System.out.println();
            System.out.println("insufficient Funds: Withdrawal refused");
            System.out.println();
            savingsBal += x;
        }    
        
        if( savingsBal < 0)
        {
            System.out.println();
            System.out.println("insufficient Funds: Withdrawal refused");
            System.out.println();
            checkingBal += y;
        }   
        
        if( checkingBal > 0)
        {
            System.out.println();
            System.out.println("Account balances for " + name);
            System.out.println("Checking: $" + getChecking());
            System.out.println("Savings:  $" + getSavings());
            System.out.println("Combined: $" + getCombined());
            System.out.println();
        }
    }
}
