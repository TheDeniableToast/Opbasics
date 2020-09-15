public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        balance = 0;
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = id;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance = balance + amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance = another.balance + amount;
            this.balance = this.balance - amount;
        }
        else {
            System.out.println("amount exceeded");
        }
        return balance;
    }

    public String toString() {
        return "Account{" +
                "id=" + id +
                "name=" + name +
                "balance=" + balance +
                "}";
    }
}
