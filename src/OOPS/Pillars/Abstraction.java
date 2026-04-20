package OOPS.Pillars;

abstract class Abstraction {
    abstract void withdraw(double amount);// abstract method

    }
    class BankAtm extends Abstraction{
        double balance = 20000;
        void withdraw(double amount){
            if(balance >= amount){
                balance = balance - amount;
                System.out.println("Withdraw Successfully");
                System.out.println("Remaining Amount: "+balance);
            }else {
                System.out.println("Insufficient amount");
            }

        }

        public static void main(String[] args) {
            BankAtm atm = new BankAtm();
            atm.withdraw(1000);
        }
}
