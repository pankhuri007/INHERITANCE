public class Student {
}
class Account{
    private  String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    public Account(String acc,String n,String add,String phno,String dob){
        accNo=acc;
        name=n;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDob() {
        return dob;
    }

    public long getBalance() {
        return balance;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
class SavingAccount extends Account{
    public SavingAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt){
        balance+=amt;
    }
    public void wiithdraw(long amt){
        balance-=amt;
    }
}
class LoanAccount extends Account{
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void payEMI(long amt){
        balance-=amt;
    }
    public void repay(long amt){

    }
}
class Result1{
    public static void main(String[] args) {

    }
}

