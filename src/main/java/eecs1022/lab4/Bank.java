package eecs1022.lab4;

/**
 * Created by user on 2/28/18.
 */
public class Bank
{
    public Bank(Client c1, Client c2, Client c3)
    {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public Client c1;
    public Client c2;
    public Client c3;
    public void deposit(String to, double amount){
        if((c1.c.equals(to))){
            c1.balance += amount;
        }
        else if(c2.c.equals(to)){
            c2.balance += amount;
        }
        else if(c3.c.equals(to)){
            c3.balance += amount;
        }

    }
    public void withdraw(String from, double amount){
        if((c1.c.equals(from))){
            c1.balance -= amount;
        }
        else if(c2.c.equals(from)){
            c2.balance -= amount;
        }
        else if(c3.c.equals(from)){
            c3.balance -= amount;
        }

    }
    public void transfer(String from, String to, double amount){
        if((c1.c.equals(to))){
            c1.balance += amount;
        }
        else if(c2.c.equals(to)){
            c2.balance += amount;
        }
        else if(c3.c.equals(to)){
            c3.balance += amount;
        }

        if((c1.c.equals(from))){
            c1.balance -= amount;
        }
        else if(c2.c.equals(from)){
            c2.balance -= amount;
        }
        else if(c3.c.equals(from)){
            c3.balance -= amount;
        }

    }

    public void transaction(String service, String from, String to, String amount){
        if(service.equals("Deposit")){

            deposit(to, Double.parseDouble(amount));


        }

        else if( service.equals("Withdraw")){

            withdraw(from, Double.parseDouble(amount));

        }
        else if( service.equals("Transfer")){

            transfer(from, to, Double.parseDouble(amount));

        }

    }
    public String toString(){
       return c1.toString() +'\n' + c2.toString() + '\n' + c3.toString();
    }



}
