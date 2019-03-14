package bank;


public class client {
   private Account account;
   private String firstname;
   private String lastname;

    public Account getAccount() {
        return account;
    }

    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public client(String accountnumber, String firstname, String lastname,float b) {
        account = new Account(b);
        this.firstname = firstname;
        this.lastname = lastname;
        this.account.setAccountnumber(accountnumber);
    }
   
   
   
}
