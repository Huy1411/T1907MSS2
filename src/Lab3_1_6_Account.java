public class Lab3_1_6_Account {
    String id,name;
    int balance = 0;

    public Lab3_1_6_Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Lab3_1_6_Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
