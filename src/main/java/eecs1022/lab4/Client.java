package eecs1022.lab4;

/**
 * Created by user on 2/28/18.
 */
public class Client
{

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }



    public Client(String name, double balance, String c)
    {
        this.name = name;
        this.balance = balance;
        this.c = c;
    }
    public String name;
    public double balance;
    public String c;
    @Override







    public String toString()
    {
        return "Client " + name + " has balance $" + String.format("%.2f", balance);
    }
}
