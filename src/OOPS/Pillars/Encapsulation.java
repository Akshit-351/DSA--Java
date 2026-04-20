package OOPS.Pillars;

class ATM {
    private String AccoutnHolder;
    private double balance;

    ATM(String name, double bal) {
        this.AccoutnHolder = name;
        this.balance = bal;
    }

    public double getbalance() {
        return balance;
    }

    public void depositBalance(double amount) {
        balance = balance + amount;
    }
}

       public class Encapsulation{
        public static void main(String[] args) {
            ATM atm = new ATM("Akshit", 200000);
            System.out.println("Before deposit the balance is: " + atm.getbalance());
            atm.depositBalance(2000);
            System.out.println("After deposit the balance is: " + atm.getbalance());
        }
    }
