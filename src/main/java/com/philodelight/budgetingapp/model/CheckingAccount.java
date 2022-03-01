package com.philodelight.budgetingapp.model;

public class CheckingAccount extends Account{
    
    
    public CheckingAccount(String firstName, String lastName, Double balance) {
        super(firstName, lastName, balance);
    }
    
    public void withdrawalMoney(Double withdrawalAmount){
        if(this.balance >= withdrawalAmount){
            this.balance -= withdrawalAmount;
        } else {
            System.out.println("We're sorry. You cannot withdraw more money than you have in your account.");
        }
    }
    
}
