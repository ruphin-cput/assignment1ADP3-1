package za.ac.cput.shopping;

/*
* @author Mogamat Taahir Boltman - 218022972
 */
public class Account {

    private String Accnumber, Accname, Storename;
    private double Payment;

    public String getAccnumber() {
        return Accnumber;
    }

    public void setAccnumber(String accountnmb) {
        this.Accnumber = accountnmb;
    }

    public String getAccname() {
        return Accname;
    }

    public void setAccname(String accountnme) {
        this.Accname = accountnme;
    }

    public String getStorename() {
        return Storename;
    }

    public void setStorename(String storename) {
        this.Storename = storename;
    }

    public double getPayment() {
        return Payment;
    }

    public void setPayment(double payment) {
        this.Payment = payment;
    }


    @Override
    public String toString() {
        return "Account{" +
                "Accountnmb='" + Accnumber + '\'' +
                ", Accountnme='" + Accname + '\'' +
                ", Payment=" + Payment +
                '}';
    }
}
