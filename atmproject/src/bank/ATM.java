/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bank.Account;
import bank.Transaction;
import java.util.Scanner;

public class ATM
{
    private static Scanner in =new Scanner (System.in);
    private static int anothertransaction;
    private static Account account;

    public static void setAccount(Account account) {
        ATM.account = account;
    }
    
    
   
    
    public static void transaction() {
        int choice;
        
        System.out.println("Please select an option");
        System.out.println("1-withdraw");
        System.out.println("2-deposit");
        System.out.println("3-balance");
       
        choice = in.nextInt();
        
        switch(choice)
        {
            case 1:
                float amount;
                System.out.println("Please enter the amount to withdraw");
                amount= in.nextFloat();
                if(amount>account.getBalance()||amount==0)
                {
                    System.out.println("You don't have sufficient money");
                
                }
                else{
                    account.withdraw(amount);
                  
                    System.out.println("the amount withdrawn"+amount+"and your new balance"+account.getBalance()+"\n");                 
                    
                    
                }
            if( anothertransaction())
                 transaction();
                return;
                
            case 2:
                float deposit = 0 ;
                System.out.println("please enter the amount you want to deposit");
                deposit=in.nextFloat();
                account.deposit(deposit);               
                System.out.println("the amount that you have deposited"+deposit+"and your new balance="+account.getBalance()+"\n");
                if( anothertransaction())
                 transaction();
                return;
                
                
                
             case 3:
                 display();
                 System.out.println("your balance now is="+account.getBalance()+"\n");
                 if( anothertransaction())
                 transaction();
                return;
                 
                 
                 
          
             
             default:
                 System.out.println("Invalid option");
                 if( anothertransaction())
                 transaction();
                return;            
    }
    
}
    private static boolean anothertransaction()
 {
    System.out.println("do you want another transaction?\n\n press 1 for another trancation \n 2 to exit");
    anothertransaction= in.nextInt();
    if(anothertransaction==1)
    {
       
        return true;
    }
    else if(anothertransaction==2)
    {
       System.out.println("END OF SYSTEM");
       return false ;
    }
    
    System.out.println("Invalid option\n\n");
    
    return anothertransaction();
}
     public static void display()
    {
        for(Transaction t:account.getHistory())
        {
            System.out.println(t.getMytype()+" "+t.getAmount());
        }
    }
}