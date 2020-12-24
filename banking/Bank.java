package banking;

public class Bank {
//    blank contructor
    public Bank(){

    }

    public void start_banking(){
        Account fahad = new Account("Fahad", "01766610087");
        Account esha = new Account("Esha", "01722453465");

        fahad.add_money(1500);
        esha.add_money(2000);

        fahad.cash_out(1000);

        System.out.println(fahad.getAccount_holder_name()+ "; "
                + fahad.getAccount_pnone_number() + "; "
                + fahad.getBalance());

        System.out.println(esha.getAccount_holder_name()+ "; "
                + esha.getAccount_pnone_number() + "; "
                + esha.getBalance());

        fahad.cash_out(1000);

    }
}
