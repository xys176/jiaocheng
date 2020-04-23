package Nine;

import java.util.Date;

public class Account7 {
    private int id=0;
    private double balance=0;
    private double annuailnterestRate=0;
    private Date dateCreated= new Date();
    Account7(){
    }
    Account7(int id,double initial_balance){
        this.id=id;
        this.balance=initial_balance;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnuailnterestRate(){
        return annuailnterestRate;
    }
    public void setId(int newId){
        id=newId;
    }
    public void setBalance(double newBalance){
        balance=newBalance;
    }
    public void setAnnuailnterestRate(double newAnnuailnterestRate){
        annuailnterestRate=newAnnuailnterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annuailnterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withDraw(double money){
        this.balance=balance-money;
    }
    public void deposit(double money){
        this.balance=balance+money;
    }
}
