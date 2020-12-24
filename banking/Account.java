package banking;

public class Account {
    private String account_holder_name;
    private String account_pnone_number;
    private double balance;

//    constructor
//    is a function having same name as class
//    always public function
//    no return type
//    can accept multiple agruments as function parameters

    public Account(String name, String account_pnone_number){
        this.account_holder_name = name;
        this.account_pnone_number = account_pnone_number;
    }

    public void add_money(double amount){
        this.balance += amount;
        System.out.println("Add money: " + amount);
    }

    public void cash_out(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Cash out: " + amount);
        }

        else {
            System.out.println("Failed to cash out due to balance limit");
        }
    }

    public String getAccount_holder_name(){
        return this.account_holder_name;
    }

    protected String getAccount_pnone_number(){
        return this.account_pnone_number;
    }

    public double getBalance(){
        return this.balance;
    }

}
