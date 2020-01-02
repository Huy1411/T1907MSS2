public class Lab4_ATM {
    private String number_card;
    private String password;
    private double balance;
    private double amount;
    private double balance2;

    public Lab4_ATM() {
        this.number_card = number_card;
        this.password = password;
        this.balance = balance;
        this.amount = amount;
        this.balance2 = balance2;
    }

    public String getNumber_card() {
        return number_card;
    }

    public void setNumber_card(String number_card) {
        this.number_card = number_card;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance2() {
        return balance2;
    }

    public void setBalance2(double balance2) {
        this.balance2 = balance2;
    }

    public double withdrawal(double amount) { //rut tien
        if (amount <= balance) {
           return balance - amount;
        } else {
            System.out.println("ERROR! balance > amount!");
        }
        return balance;
    }
    public  double deposit(double amount ){ // nop tien
        return balance + amount;
    }

    public double tranferTo( int amount) {
        if (amount <= balance) {
            return balance2 = balance - amount;

        } else {
            System.out.println("amount excceeded balance");
        }
        System.out.println("Balance2"+balance2);
        return balance2;
    }

    @Override
    public String toString() {
        return "ATM{" + "number_card=" + number_card + ", password=" + password + ", balance=" + balance + ", amount=" + amount + ", balance2=" + balance2 + "}";
    }
}
