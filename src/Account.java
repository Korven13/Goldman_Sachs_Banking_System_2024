public class Account {
    String accName;
    int accId;
    int ownerId;
    int balance;

    public Account(String accName, int accId, int ownerId, int balance) {
        this.accName = accName;
        this.accId = accId;
        this.ownerId = ownerId;
        this.balance = balance;
    }

    public String getName() {
        return this.accName;
    }
    public int getOwnerId() {
        return this.ownerId;
    }
}
