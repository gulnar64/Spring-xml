package aze.coders.entity;

public class Account {
    public void startMethod() {
        System.out.println("Start accocunt");
    }
    public void finishMethod() {
        System.out.println("End accocunt");
    }
    private String account;
    private User user;
    private Currency currency;

    public Account(User user) {
        this.user = user;
    }

    public User getUser() {
        System.out.println("user constructor");
        return user;
    }

    public Account() {
        System.out.println("default constructor");
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setUser(User user) {
        System.out.println("set user");
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", user=" + user +
                ", currency=" + currency +
                '}';
    }
}
