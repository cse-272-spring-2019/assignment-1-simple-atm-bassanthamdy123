package atm;


import bank.ATM;
import bank.client;
import static bank.ATM.transaction;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
 public class ATMTest {
    

public static void main (String args[])
{
    client c1 = new client("5337","bassant","hamdy",0);
    
     
    ATM.setAccount(c1.getAccount());
    
        
        transaction();
}
    
}

