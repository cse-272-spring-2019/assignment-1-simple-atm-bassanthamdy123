package bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Transaction {
    
    public enum type{
        deposit,
        withdraw; 
    } 
    private float amount;
    private type mytype;

    public float getAmount() {
        return amount;
    }

    public type getMytype() {
        return mytype;
    }
    

    public Transaction(float amount, type mytype) {
        this.amount = amount;
        this.mytype = mytype;
    }
    
    
}
