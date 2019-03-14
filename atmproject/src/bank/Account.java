package bank;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Account {

    private float balance = 0;
    private String accountnumber;
    private List<Transaction> history = new ArrayList<>();

    public Account(float f) {
        this.balance = f;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }


    public List<Transaction> getHistory() {
        return history;
    }

    public void deposit(float deposit) {
        balance = deposit + balance;
        addtransaction(new Transaction(deposit, Transaction.type.deposit));
    }

    public void withdraw(float amount) {
        balance = balance - amount;
        addtransaction(new Transaction(amount, Transaction.type.withdraw));
    }

    public float getBalance() {
        return balance;
    }

    private void addtransaction(Transaction t) {
        history.add(t);
    }

    public String getAccountnumber() {
        return accountnumber;
    }

}
