import java.util.List;
import java.util.Objects;

public class Account {
    public Account(int accountId) {
        this.accountId = accountId;
    }

    private final int accountId;
    private double moneyValue;


    public Account(int id, double money) {
        this.accountId = id;
        this.moneyValue = money;
    }

    public long getAccountId() {
        return accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountId == account.accountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId);
    }

    public double getMoneyValue() {
        return moneyValue;
    }

    @Override
    public String toString() {
        return "\nAccount [accountId=" + accountId
                + ", money=" + moneyValue + "]";
    }
}
