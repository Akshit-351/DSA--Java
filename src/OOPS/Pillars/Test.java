package OOPS.Pillars;

public class Test {
    public static void main(String[] args) {
        ATM atm = new ATM("Ayush", 10000);
        //atm.balance = 20;// it will show 20 but my actual balance is 10000 so hacker can easily update my balance and change it so for this solution
        // we can private the name and balance
        atm.getbalance();
    }
}
