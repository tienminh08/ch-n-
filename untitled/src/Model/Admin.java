package Model;

public class Admin {
    private String account;
    private String Pass;

    public Admin(String account, String pass) {
        this.account = account;
        Pass = pass;
    }

    public Admin() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    @Override
    public String toString() {
        return
                "account='" + account + '\'' +
                ", Pass='" + Pass + '\'' +
                '}';
    }
}
